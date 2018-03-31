/**
 * This application implements factory method example.
 */
package com.epam.rd.factory;

/**
 * The ShapeFactoryDemo class has main method that to be called by JVM.
 * respective classes.
 * @author Krishnakanth_Yachareni
 * @since 29-01-2018
 */
public final class ShapeFactoryDemo {
    /**
     * Default constructor.
     */
    private ShapeFactoryDemo() {
    }

    /**
     * @param args
     *            string array.
     */
    public static void main(final String[] args) {
        try {

            if (args.length == 1) {
                // instance of ShapeFactory class.
                ShapeFactory shapeFactory = new ShapeFactory();
                /*
                 * calling createShape method to get instance of respective
                 * class.
                 */
                Shape shapeType = shapeFactory.createShape(args[0]);
                String status = shapeType.draw();
                System.out.println(status);
            } else {
                System.out.println(("Pass only one argument"));
            }
        } catch (NullPointerException e) {
            System.err.println("Enter valid classs name");
        }
    }

}
