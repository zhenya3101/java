/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */
public class piramida extends Rectangle{
    public piramida(double a,double h){
        this.a = a; 
        this.h = h;
    }
    public double h;
    public double getH(){return h;}
    public void setH(double h){this.h = h;}
    public double getV(){return (a*a*h)/3;}
    public double getS(){
        double a,b,c;
        a = this.getd()/2;
        b=h;
        c = java.lang.Math.sqrt(a*a+b*b);
        double p = (this.a+2*c)/2;
        double S = java.lang.Math.sqrt(p*(p-this.a)*(p-c)*(p-c));
        S*=4;
        return S+this.a*this.a;
    }
}
