/**
 * Autaparking application using database.
 */
package org.autoparking.dao.user;

import org.apache.log4j.Logger;
import org.autoparking.dao.connection.DataSource;
import org.autoparking.model.User;
import org.autoparking.service.util.CurrentTime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Krishnakanth
 *
 */
public class UserDAOImpl implements UserDAO {

    /**
     * Logger initialization
     */
    private static final Logger LOGGER = Logger.getLogger(UserDAOImpl.class);

    private static final String SELECT_USER_QUERY = "SELECT * FROM user WHERE id=?";
    private static final String SELECT_ALL_USERS_QUERY = "SELECT * FROM user";
    private static final String INSERT_USER_QUERY = "INSERT INTO user VALUES (NULL, ?, ?, ?,?,?)";
    private static final String USER_VALIDATION_QUERY =
            "SELECT * FROM user WHERE userName=? AND password=?";

    /**
     * {@link DataSource}
     */
    private DataSource dataSource;
    /**
     * {@link Connection}
     */
    private Connection connection;

    /**
     * This is constructor can initialize the database connection object.
     */
    public UserDAOImpl() {
        dataSource = new DataSource();
        connection = dataSource.getConnection();
    }

    /**
     * This method can return the user object by passing the ResultSet.
     * 
     * @param rs
     * @return
     * @throws SQLException
     */
    private User extractUserFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setUserName(rs.getString("userName"));
        user.setPassword(rs.getString("password"));
        user.setParkingLotName(rs.getString("lotName"));
        return user;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.UserDAO#getUser()
     */
    public User getUser(int id) {
        try (PreparedStatement statement = connection.prepareStatement(SELECT_USER_QUERY)) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return extractUserFromResultSet(result);
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in getUser()", ex);
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.UserDAO#getAllUsers()
     */
    public Set<User> getAllUsers() {

        try (Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(SELECT_ALL_USERS_QUERY)) {
            Set<User> users = new HashSet<>();
            while (rs.next()) {
                User user = extractUserFromResultSet(rs);
                users.add(user);
            }
            return users;
        } catch (SQLException ex) {
            LOGGER.error("Exception in getAllUsers()", ex);
        }

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.UserDAO#getUserByUserNameAndPassword()
     */

    public boolean isUserValid(String userName, String password) {

        try (PreparedStatement preparedStmt = connection.prepareStatement(USER_VALIDATION_QUERY)) {
            preparedStmt.setString(1, userName);
            preparedStmt.setString(2, password);
            ResultSet resultSet = preparedStmt.executeQuery();
            if (resultSet.next()) {
                User user = extractUserFromResultSet(resultSet);
                if (user.getUserName().equalsIgnoreCase(userName)
                        && user.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in isUserValid()", ex);
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.UserDAO#insertUser()
     */

    public boolean insertUser(User user) {
        try (PreparedStatement ps = connection.prepareStatement(INSERT_USER_QUERY)) {

            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getParkingLotName());
            ps.setTimestamp(4, CurrentTime.getTime());
            ps.setTimestamp(5, CurrentTime.getTime());

            int i = ps.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in insertUser()", ex);
        }
        return false;
    }

}
