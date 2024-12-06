package org.howard.edu.lsp.finalexam.question3;

//source: https://pramonow.medium.com/design-pattern-101-singleton-and-factory-pattern-f0908a56d044
//source: https://www.codejava.net/testing/junit-assert-no-exception-thrown
//source: https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java
//source: https://www.baeldung.com/java-factory-pattern
//source: AI Overview for "assertSame"


/**
 * Renderer class for shapes, using ShapeFactory.
 */
public class ShapeRenderer {
    private final ShapeFactory shapeFactory;

    public ShapeRenderer() {
        this.shapeFactory = ShapeFactory.getInstance();
    }

    /**
     * Renders shape by type.
     *
     * @param shapeType type of shape to render.
     */
    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}
