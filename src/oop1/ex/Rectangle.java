package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;
    int area;
    int perimeter;
    boolean square;

    void calculateArea() {
        area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter() {
        perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare() {
        if (width == height) {
            square = true;
        } else {
            square = false;
        }
        System.out.println("정사각형 여부: " + square);
    }
}
