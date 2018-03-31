/**
 * This application implements factory method example.
 */
package com.epam.rd.factory;

/**
 * The ShapeFactory class has createShape method can create instance of
 * respective classes.
 * @author Krishnakanth_Yachareni
 * @since 29-01-2018
 */
public class ShapeFactory {
    /**
     * Circle class name.
     */
    private static final String CRICLE = "circle";
    /**
     * Rectangle class name.
     */
    private static final String RECTANGLE = "rectangle";

    /**
     * @param type
     *            is a string
     * @return Shape instance
     */
    public Shape createShape(final String type) {
        Shape object;
        switch (type.toLowerCase()) {
        case CRICLE:
            object = new Circle();
            break;
        case RECTANGLE:
            object = new Rectangle();
            break;
        default:
            object = null;
	    break;
        }
        return object;
    }
}
