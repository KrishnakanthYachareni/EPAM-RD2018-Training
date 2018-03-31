/**
 * This is a simple login example.
 */
package org.login.dao;

import org.apache.log4j.Logger;
import org.login.dao.datasource.DbConnection;
import org.login.dao.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class is implementation of {@link User}.
 * 
 * @author Krishnakanth_Yachare
 *
 */
public class UserDaoImpl implements UserDao {

    /**
     * Logging initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

    private static final String QUERY_TO_VALID_USER =
            "SELECT * FROM user WHERE userName=? AND password=?";
    private static final String QUERY_TO_ADD_USER = "INSERT INTO user VALUES (NULL, ?, ?)";
    private static final String QUERY_TO_USER_EXIST = "SELECT * FROM user WHERE username=?";

    /**
     * @param result
     * @return {@link User} reference.
     * @throws SQLException
     */
    private User extractUserFromResultSet(ResultSet result) throws SQLException {

        User user = new User();

        user.setId(result.getInt("iduser"));
        user.setUsername(result.getString("userName"));
        user.setPassword(result.getString("password"));

        return user;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.login.dao.UserDao#addUser(org.login.dao.model.User)
     */
    @Override
    public boolean addUser(User user) {
        try (PreparedStatement ps =
                DbConnection.getConnection().prepareStatement(QUERY_TO_ADD_USER)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());

            int i = ps.executeUpdate();

            if (i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            LOGGER.error(ex);
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.login.dao.UserDao#isValid(java.lang.String, java.lang.String)
     */
    @Override
    public boolean isValid(String userName, String password) {

        try (PreparedStatement preparedStmt =
                DbConnection.getConnection().prepareStatement(QUERY_TO_VALID_USER)) {

            preparedStmt.setString(1, userName);
            preparedStmt.setString(2, password);

            ResultSet resultSet = preparedStmt.executeQuery();

            if (resultSet.next()) {
                User user = extractUserFromResultSet(resultSet);
                if (user.getUsername().equals(userName) && user.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            LOGGER.error(ex);
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.login.dao.UserDao#isExist(java.lang.String)
     */
    @Override
    public boolean isExist(String username) {
        try (PreparedStatement statement =
                DbConnection.getConnection().prepareStatement(QUERY_TO_USER_EXIST)) {

            statement.setString(1, username);
            ResultSet result = statement.executeQuery();

            if (result.next() && result.getString(2).equals(username)) {
                return true;
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return false;
    }
}
