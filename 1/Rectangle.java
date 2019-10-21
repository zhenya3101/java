/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */
public class Rectangle {
    
    public double a;
    public Rectangle(){};
    public Rectangle(double a){this.a=a;};
    public void setA(int a) {
        this.a = a;
    }
    public double getA(){return a;}
    public double gets(){
        return a*a;
    }
    public double getd(){
        return java.lang.Math.sqrt(2*a*a);
    }
    public double getP(){
        return a*4;
    }
}
