package com.example.project;
import java.lang.Math;

public class Triangle {

    // your code goes here: good luck =)
    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Triangle(){ // This is the constructor that makes a all zero triangle
        this.x0 = 0;
        this.y0 = 0;
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    public Triangle(double x0,double y0,double x1,double y1,double x2,double y2){ // this is a custom triangle
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double perimeter(){
        double SideA;
        SideA = Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
        double SideB;
        SideB = Math.sqrt((x2-x0)*(x2-x0) + (y2-y0)*(y2-y0));
        double SideC;
        SideC = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double Perimeter = (SideA + SideB + SideC);
        return Perimeter;
    }

    public double area(){
        double SideA;
        SideA = Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
        double SideB;
        SideB = Math.sqrt((x2-x0)*(x2-x0) + (y2-y0)*(y2-y0));
        double SideC;
        SideC = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double S = ((SideA + SideB + SideC)/2);
        double Area = Math.sqrt((S)*(S-SideA)*(S-SideB)*(S-SideC));
        return Area;
    }

    public void translateX(double Xchange){
        this.x0 = this.x0 + Xchange;
        this.x1 = this.x1 + Xchange;
        this.x2 = this.x2 + Xchange;
    }

    public void translateY(double Ychange){
        this.y0 = this.y0 + Ychange;
        this.y1 = this.y1 + Ychange;
        this.y2 = this.y2 + Ychange;
    }


    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }
}
