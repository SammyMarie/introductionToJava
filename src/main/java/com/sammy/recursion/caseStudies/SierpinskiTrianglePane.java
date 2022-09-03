package com.sammy.recursion.caseStudies;

import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class SierpinskiTrianglePane extends Pane {
    private int triangleOrderNumber;

    SierpinskiTrianglePane(){}

    public void setTriangleOrderNumber(int triangleOrderNumber) {
        this.triangleOrderNumber = triangleOrderNumber;
        paint();
    }

    protected void paint(){
        Point2D firstPoint = new Point2D(getWidth() / 2, 10);
        Point2D secondPoint = new Point2D(10, getHeight() - 10);
        Point2D thirdPoint = new Point2D(getWidth() - 10, getHeight() - 10);
        this.getChildren().clear();//To clear the pane before redisplay

        displayTriangles(triangleOrderNumber, firstPoint, secondPoint, thirdPoint);
    }

    private void displayTriangles(int triangleOrderNumber, Point2D firstPoint, Point2D secondPoint, Point2D thirdPoint) {
        if(triangleOrderNumber == 0){
            //Draw a triangle to connect three points
            Polygon triangle = new Polygon();
            triangle.getPoints().addAll(firstPoint.getX(), firstPoint.getY(),
                                        secondPoint.getX(), secondPoint.getY(),
                                        thirdPoint.getX(), thirdPoint.getY());
            triangle.setStroke(Color.BLACK);
            triangle.setFill(Color.WHITE);
            this.getChildren().add(triangle);
        }else{
            //Get the midpoint on each edge in the triangle
            Point2D nextFirstPoint = firstPoint.midpoint(secondPoint);
            Point2D nextSecondPoint = secondPoint.midpoint(thirdPoint);
            Point2D nextThirdPoint = thirdPoint.midpoint(firstPoint);

            //Recursively display three triangles
            displayTriangles(triangleOrderNumber - 1, firstPoint, nextFirstPoint, nextThirdPoint);
            displayTriangles(triangleOrderNumber - 1, nextFirstPoint, secondPoint, nextSecondPoint);
            displayTriangles(triangleOrderNumber - 1, nextThirdPoint, nextSecondPoint, thirdPoint);
        }
    }
}
