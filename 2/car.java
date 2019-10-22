/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */
public class car{
        private String number;
        private String mark;
        private int year;
        private String color;
        private String name;
        private String surname;
        private String address;
        public car(){
            this.number="";
            this.mark="";
            this.year=1900;
            this.color="";
            this.name="";
            this.surname="";
            this.address="";
        };
        public car(String number,
                    String mark,
                    int year,
                    String color,
                    String name,
                    String surname,
                    String address){
            if((year<1900)||(year>2019))throw new IllegalArgumentException();
            this.number=number;
            this.mark=mark;
            this.year=year;
            this.color=color;
            this.name=name;
            this.surname=surname;
            this.address=address;
    };
        public String getNumber() {
            return number;
        }
        public void setNumber(String number) {
            this.number = number;
        }
        public String getMark() {
            return mark;
        }
        public void setMark(String mark) {
            this.mark = mark;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year){
            if((year<1900)||(year>2019))throw new IllegalArgumentException();                    
            this.year = year;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
    }
    