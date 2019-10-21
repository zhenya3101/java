/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */

import java.util.Vector;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,h;
        int n,m;
        System.out.println("Введите N и M");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        Vector vn = new Vector();
        Vector vm = new Vector();
        for(int i = 0;i < n;i++) {
            System.out.print("a: ");
            a=in.nextDouble();
            vn.add(new Rectangle(a));
        }
        for(int i = 0;i < m;i++) {
            System.out.print("a: ");
            a=in.nextDouble();
            System.out.print("h: ");
            h=in.nextDouble();
            vm.add(new piramida(a,h));
        }
        double S = ((Rectangle)vn.get(0)).gets();
        for(int i = 1;i<n;i++){
            if(((Rectangle)vn.get(i)).gets()<S){
                S=((Rectangle)vn.get(i)).gets();
            }
        }
        System.out.print("S: ");
        System.out.println(S);
        System.out.print("Введите A: ");
        double A=in.nextDouble();
        int c=0;
        for(int i = 0;i<m;i++) {
           if(((piramida)vm.get(i)).getH()>A)
               c++;
        }
        System.out.print("Еолво пирамид: ");
        System.out.println(c);
        
    }
}
