package com.example.project;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(1, 1, 5, 5, 5, 1);
        Triangle otherTriangle = new Triangle();
        System.out.println(myTriangle.perimeter());
        System.out.println(myTriangle.area());

        myTriangle.translateX(5);
        System.out.println(myTriangle.perimeter());
        System.out.println(myTriangle.area());

        myTriangle.translateY(-1);
        System.out.println(myTriangle.perimeter());
        System.out.println(myTriangle.area());
    }
}
