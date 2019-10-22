
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */

    public class RoadPolice {
        private List<car> cars;
        public RoadPolice(){
            cars = new ArrayList<car>();
        }
        public void addCarLast(car _car){
            cars.add(_car);
        }
        public void addCarFirst(car _car){
            cars.add(0,_car);
        }
        public void delCar(String number){
            for(car _car : cars)
                if(_car.getNumber().equals(number)){
                    cars.remove(_car);
                    return;
                }
        }
        public car getcarfromnum(String s){
            for(car _car : cars){
                if(_car.getNumber().contains(s))
                    return _car;
            }
            return null;
        };
        public List<car> getCars(){
            return cars;
        };
        public car getcarfromCaM(String Color,String Mark){
            for(car _car : cars){
                if(_car.getMark().equals(Mark)&&_car.getColor().equals(Color))
                    return _car;
            }
            return null;
        };
        public void Clear(){
            cars.clear();
        };
    }
