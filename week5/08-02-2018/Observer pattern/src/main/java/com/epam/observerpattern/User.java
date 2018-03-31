/**
 * This is an observer pattern example.
 */
package com.epam.observerpattern;

/**
 * @author Krishnakanth Yachareni
 *
 */
public class User implements Observer {

    /**
     * String variable to hold article type.
     */
    private String article;
    /**
     * String variable to hold article content.
     */
    private Subject blog;

    /**
     * This method set the subject to blog.
     * @see com.epam.observerpattern.Observer#setSubject
     *      (com.epam.observerpattern.Subject)
     * @param blg
     *            {@link Subject} interface.
     */
    public void setSubject(final Subject blg) {
        this.blog = blg;
        article = "No New Article!";
    }

    @Override
    public final void update() {
        System.out.println("State change reported by Subject.");
        article = (String) blog.getUpdate();
    }

    /**
     * @return article.
     */
    public String getArticle() {
        return article;
    }
}
