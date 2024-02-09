package testObjects;

import objects.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3,11,-2,-10);
        Rectangle rec2 = new Rectangle(2,11,0,0);
       // System.out.println("Rec 1 \nCircumference: " + rec1.getCircumference() +"\nArea: " + rec1.getArea());
       // System.out.println("Rec 2 \nCircumference: " + rec2.getCircumference() +"\nArea: " + rec2.getArea());
        Boolean rectangleCovers = rec1.covers(rec2);
        System.out.println(rectangleCovers);
    }
}
