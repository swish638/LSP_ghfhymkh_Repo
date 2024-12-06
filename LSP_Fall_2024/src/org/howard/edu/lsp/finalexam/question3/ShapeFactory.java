package org.howard.edu.lsp.finalexam.question3;

/**
 * Factory class for creating Shape objects. Singleton implementation.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor to prevent instantiation
    private ShapeFactory() {}

    /**
     * Return singleton instance of ShapeFactory.
     *
     * @return the singleton instance.
     */
    public static synchronized ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates a Shape object based on shapeType.
     *
     * @param shapeType type of shape (circle, triangle, rectangle).
     * @return a Shape object, or null if unknown.
     */
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        // Convert to lowercase for case-insensitive comparison
        String normalizedShapeType = shapeType.toLowerCase();

        if (normalizedShapeType.equals("circle")) {
            return new Circle();
        } else if (normalizedShapeType.equals("rectangle")) {
            return new Rectangle();
        } else if (normalizedShapeType.equals("triangle")) {
            return new Triangle();
        } else {
            return null; // Unknown shape type
        }
    }
}
