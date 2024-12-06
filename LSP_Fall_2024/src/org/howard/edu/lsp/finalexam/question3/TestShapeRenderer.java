package org.howard.edu.lsp.finalexam.question3;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;




import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for ShapeRenderer and ShapeFactory.
 */
public class TestShapeRenderer {

    @Test
    @DisplayName ("Testing circle")
    public void testCircleRendering() {
        ShapeFactory factory = ShapeFactory.getInstance();
        // Ensure Circle is instantiated and renders correctly
        Shape circle = factory.createShape("circle");
        assertNotNull(circle, "Circle should be instantiated");
        assertTrue(circle instanceof Circle, "Shape should be an instance of Circle");
    }
    

    @Test
    @DisplayName ("Testing rectangle")
    public void testRectangleRendering() {
        ShapeFactory factory = ShapeFactory.getInstance();

        // Ensure Rectangle is instantiated and renders correctly
        Shape rectangle = factory.createShape("rectangle");
        assertNotNull(rectangle, "Rectangle should be instantiated");
        assertTrue(rectangle instanceof Rectangle, "Shape should be an instance of Rectangle");
    }
    

    @Test
    @DisplayName ("Testing Triangle")
    public void testTriangleRendering() {
        ShapeFactory factory = ShapeFactory.getInstance();
        // Ensure Triangle is instantiated and renders correctly
        Shape triangle = factory.createShape("triangle");
        assertNotNull(triangle, "Triangle should be instantiated");
        assertTrue(triangle instanceof Triangle, "Shape should be an instance of Triangle");
    }

    
    
    @Test
    @DisplayName ("Testing unknown shape")
    public void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        // Ensure unknown shape returns null
        Shape unknown = factory.createShape("hexagon");
        assertNull(unknown, "Unknown shape should return null");
    }
    

    @Test
    @DisplayName ("Test if shape is actually rendered")
    public void testShapeRendererRendering() {
        ShapeRenderer renderer = new ShapeRenderer();

        // Capture output to ensure shapes are rendered
        // Note: You can use a library like SystemLambda for capturing output in actual tests
        assertDoesNotThrow(() -> renderer.renderShape("circle"), "Rendering a Circle should not throw exceptions");
        assertDoesNotThrow(() -> renderer.renderShape("rectangle"), "Rendering a Rectangle should not throw exceptions");
        assertDoesNotThrow(() -> renderer.renderShape("triangle"), "Rendering a Triangle should not throw exceptions");
        assertDoesNotThrow(() -> renderer.renderShape("hexagon"), "Rendering an unknown shape should not throw exceptions");
    }
    
    
    
    
    
   
    
    @Test
    @DisplayName ("Test if Singleton Pattern Implemented Successfully")
    public void testSingletonFactoryInstance() {
        ShapeFactory instance1 = ShapeFactory.getInstance();
        ShapeFactory instance2 = ShapeFactory.getInstance();

        assertSame(instance1, instance2, "ShapeFactory should return same instance for multiple calls");
    }
    
    
    
    @Test
    @DisplayName ("Testing null shape type")
    public void testNullType() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape(null);
        assertNull(shape, "Factory should return null for null shape type");

        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape(null), "Renderer should handle null shape without throwing error");
    }
    
    
    
    @Test
    @DisplayName ("Testing empty shape type")
    public void testEmptyShapeType() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("");
        assertNull(shape, "Factory should return null for empty string type");

        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape(""), "Renderer should handle empty shape without throwing error");
    }
    
    
    
    
    @Test
    @DisplayName ("Testing case insensitivity in shape type")
    public void testCaseInsensitiveShapeType() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.createShape("CIRCLE");
        assertNotNull(circle, "Factory should create Circle for uppercase input");
        assertTrue(circle instanceof Circle, "Should be instance of Circle for uppercase input");

        Shape rectangle = factory.createShape("ReCtAnGlE");
        assertNotNull(rectangle, "Factory should create Rectangle for mixed-case input");
        assertTrue(rectangle instanceof Rectangle, "Shape should be an instance of Rectangle for mixed-case input");
    }




}
