import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */
public class Main {
    public static void main(String[] args) {
        RoadPolice rc = new RoadPolice();
        Scanner in = new Scanner(System.in);
        for(int i = 0;i < 5; i++){
            System.out.println("Машина "+ (i+1));
            car _car;
            try{ 
                _car = new car(in.nextLine(),in.nextLine(),
                    Integer.parseInt(in.nextLine()),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine());}
            catch(Exception e){
                System.out.println(e);
                i-=1;
                continue;
            }
            rc.addCarLast(_car);
        }
        System.out.print("Поиск машины по номеру ");
        System.out.println(rc.getcarfromnum(in.nextLine()).toString());
        System.out.print("Поиск машина по марке и цвету ");
        System.out.println(rc.getcarfromCaM(in.nextLine(),in.nextLine()).toString());
        System.out.print("Удалить машину по номеру ");
        rc.delCar(in.nextLine());
        while(true){
        System.out.println("Добавить машину в начало введите");
            try{
                rc.addCarFirst(new car(in.nextLine(),in.nextLine(),
                    Integer.parseInt(in.nextLine()),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine()));
                break;
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
