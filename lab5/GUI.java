/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
    private final JButton AddButton = new JButton("Add");
    private final JButton BackButton = new JButton("Back");
    private final JButton DeleteButton = new JButton("Delete");
    private final JButton NextButton = new JButton("Next");
    private final JLabel Label1 = new JLabel("Number");
    private final JLabel Label2 = new JLabel("Mark");
    private final JLabel Label3 = new JLabel("Year");
    private final JLabel Label4 = new JLabel("Color");
    private final JLabel Label5 = new JLabel("Name");
    private final JLabel Label6 = new JLabel("Surname");
    private final JLabel Label7 = new JLabel("Address");
    private JTextField Field1 = new JTextField("");
    private JTextField Field2 = new JTextField("");
    private JTextField Field3 = new JTextField("");
    private JTextField Field4 = new JTextField("");
    private JTextField Field5 = new JTextField("");
    private JTextField Field6 = new JTextField("");
    private JTextField Field7 = new JTextField("");
    private RoadPolice RP = new RoadPolice(); 
    int i = 0;
    public GUI(){
        super("RoadPolice");
        this.setBounds(100, 100, 200, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AddButton.addActionListener((ActionEvent e) -> { 
            RP.addCarLast(new car(Field1.getText(),
            Field2.getText(),
            Integer.parseInt(Field3.getText()),
            Field4.getText(),
            Field5.getText(),
            Field6.getText(),
            Field7.getText()
            ));
            update();
        });
        DeleteButton.addActionListener((ActionEvent e) -> { 
            RP.delCar(Field1.getText());
            update();
        });
        NextButton.addActionListener((ActionEvent e) -> {
            if(i >= RP.getCars().size()-1) 
                return;
            i++;
            car c = RP.getCars().get(i);
            Field1.setText(c.getNumber());
            Field2.setText(c.getMark());
            Field3.setText(String.valueOf(c.getYear()));
            Field4.setText(c.getColor());
            Field5.setText(c.getName());
            Field6.setText(c.getSurname());
            Field7.setText(c.getAddress());
            
        });
        BackButton.addActionListener((ActionEvent e) -> { 
            if(i <= 0) 
                return;
            i--;
            car c = RP.getCars().get(i);
            Field1.setText(c.getNumber());
            Field2.setText(c.getMark());
            Field3.setText(String.valueOf(c.getYear()));
            Field4.setText(c.getColor());
            Field5.setText(c.getName());
            Field6.setText(c.getSurname());
            Field7.setText(c.getAddress());
            
        });
        
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(9,2,2,2));
        container.add(Label1);
        container.add(Field1);
        container.add(Label2);
        container.add(Field2);
        container.add(Label3);
        container.add(Field3);
        container.add(Label4);
        container.add(Field4);
        container.add(Label5);
        container.add(Field5);
        container.add(Label6);
        container.add(Field6);
        container.add(Label7);
        container.add(Field7);
        container.add(NextButton);
        container.add(BackButton);
        container.add(AddButton);
        container.add(DeleteButton);
        update();
    }
    public void update(){
        if(RP.getCars().isEmpty()){
            Field1.setText("");
            Field2.setText("");
            Field3.setText("");
            Field4.setText("");
            Field5.setText("");
            Field6.setText("");
            Field7.setText("");
        }else{
            car c = RP.getCars().get(0);
            Field1.setText(c.getNumber());
            Field2.setText(c.getMark());
            Field3.setText(String.valueOf(c.getYear()));
            Field4.setText(c.getColor());
            Field5.setText(c.getName());
            Field6.setText(c.getSurname());
            Field7.setText(c.getAddress());
        }
        i=0;
    }
}
