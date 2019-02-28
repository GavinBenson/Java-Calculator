/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_calculator_basic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/**
 *
 * @author compsci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        double mathTest = Math.pow(10.0, 2.0);
        System.out.println("10 ^ 2 = " + mathTest);
        
        mathTest = Math.sqrt(25.0);
        System.out.println("Square route of 25 = " + mathTest);
        
        mathTest = Math.pow(25.0, 0.5);
        System.out.println("Math.pow method for sqrt(25) = " + mathTest);
        
        mathTest = Math.pow(10.0, 2.5);
        System.out.println("10 ^ 2.5 = " + mathTest);
        
        mathTest = Math.log10(100000.0);
        System.out.println("log10(100000.0) = " + mathTest);
        
        mathTest = Math.log10(5.0);
        System.out.println("log10(5.0) = " + mathTest);
        */
        new Calculator();
        
        /*
        Graded assignment:
        Add 4 buttons on side, change layout to fit.
        Buttons will be single-function, unlike the other ones like 'add'
        First one: Square. Square the number
        Second one: Cube. Cube the number
        Third one: Square root. Find the square root of the number
        Fourth one: log10. Find the log10 of the number.
        
        */
        
    }
    
    static class Calculator implements ActionListener {
        JFrame frame;;
        JTextField textField;
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdec,badd,bsub,bmul,bdiv,beq,bclr,bksp, bsqr, bcbe, bsqt, blog, sind, sinr, cosd, cosr, tand,tanr,
                chex, cbin, coct, loge; //Buttons 0 through 9, add, subtract, multiply, divide, equals, clear, backspace, sin/cos/tan in radians and degrees, converters.
        
        static double firstNumber=0,secondNumber=0,result=0;
        static int operator=0;
        
        Calculator() {
            frame = new JFrame("Calculator");
            textField = new JTextField();
            
            b1 = new JButton("1");
            b2 = new JButton("2");
            b3 = new JButton("3");
            b4 = new JButton("4");
            b5 = new JButton("5");
            b6 = new JButton("6");
            b7 = new JButton("7");
            b8 = new JButton("8");
            b9 = new JButton("9");
            b0 = new JButton("0");
            bdec = new JButton(".");
            badd = new JButton("+");
            bsub = new JButton("-");
            bmul = new JButton("*");
            bdiv = new JButton("/");
            beq = new JButton("=");
            bclr = new JButton("Clear");
            bksp = new JButton("Backspace");
            
            bsqr = new JButton("Square");
            bcbe = new JButton("Cube");
            bsqt = new JButton("Sq. Root");
            blog = new JButton("Log(10)");
            
            sind = new JButton("Sin(Deg)");
            sinr = new JButton("Sin(Rad)");
            cosd = new JButton("Cos(Deg)");
            cosr = new JButton("Cos(Rad)");
            tand = new JButton("Tan(Deg)");
            tanr = new JButton("Tan(Rad)");
            
            cbin = new JButton("To Binary");
            chex = new JButton("To Hex");
            coct = new JButton("To Oct");
            
            loge = new JButton("Log(e)");
            
            textField.setBounds(30,40,410,30);
            b7.setBounds(40,100,50,40);
            b8.setBounds(110,100,50,40);
            b9.setBounds(180,100,50,40);
            bdiv.setBounds(250,100,50,40);
            bsqr.setBounds(320,100,100,40);
            sind.setBounds(440,100,100,40);
            sinr.setBounds(560,100,100,40);
            cbin.setBounds(680,100,100,40);
            
            b4.setBounds(40,170,50,40);
            b5.setBounds(110,170,50,40);
            b6.setBounds(180,170,50,40);
            bmul.setBounds(250,170,50,40);
            bcbe.setBounds(320,170,100,40);
            cosd.setBounds(440,170,100,40);
            cosr.setBounds(560,170,100,40);
            chex.setBounds(680,170,100,40);
                        
            b1.setBounds(40,240,50,40);
            b2.setBounds(110,240,50,40);
            b3.setBounds(180,240,50,40);
            bsub.setBounds(250,240,50,40);
            bsqt.setBounds(320,240,100,40);
            tand.setBounds(440,240,100,40);
            tanr.setBounds(560,240,100,40);
            coct.setBounds(680,240,100,40);
            
            bdec.setBounds(40,310,50,40);
            b0.setBounds(110,310,50,40);
            beq.setBounds(180,310,50,40);
            badd.setBounds(250,310,50,40);
            blog.setBounds(320,310,100,40);
            loge.setBounds(440,310,100,40);
            
            
            
            
            
            bclr.setBounds(40,380,260,40);
            bksp.setBounds(320,380,220,40);
            
            frame.add(textField);
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);
            frame.add(b4);
            frame.add(b5);
            frame.add(b6);
            frame.add(b7);
            frame.add(b8);
            frame.add(b9);
            frame.add(b0);
            frame.add(bdec);
            frame.add(badd);
            frame.add(bsub);
            frame.add(bmul);
            frame.add(bdiv);
            frame.add(beq);
            frame.add(bclr);
            frame.add(bksp);
            
            frame.add(bsqr);
            frame.add(bcbe);
            frame.add(bsqt);
            frame.add(blog);
            
            frame.add(sind);
            frame.add(sinr);
            frame.add(cosd);
            frame.add(cosr);
            frame.add(tand);
            frame.add(tanr);
            
            frame.add(cbin);
            frame.add(chex);
            frame.add(coct);
            
            frame.add(loge);
            
            frame.setSize(800, 500);
            frame.setLayout(null);
            frame.setVisible(true);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setTitle("Calculator");
            frame.setSize(800, 500); //redundant.
            

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b0.addActionListener(this);
            bdec.addActionListener(this);
            badd.addActionListener(this);
            bsub.addActionListener(this);
            bmul.addActionListener(this);
            bdiv.addActionListener(this);
            beq.addActionListener(this);
            bclr.addActionListener(this);
            bksp.addActionListener(this);
            bsqr.addActionListener(this);
            bcbe.addActionListener(this);
            bsqt.addActionListener(this);
            blog.addActionListener(this);
            sind.addActionListener(this);
            sinr.addActionListener(this);
            cosd.addActionListener(this);
            cosr.addActionListener(this);
            tand.addActionListener(this);
            tanr.addActionListener(this);
            cbin.addActionListener(this);
            chex.addActionListener(this);
            coct.addActionListener(this);
            loge.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1)
                textField.setText(textField.getText().concat("1"));
            if(e.getSource() == b2)
                textField.setText(textField.getText().concat("2"));
            if(e.getSource() == b3)
                textField.setText(textField.getText().concat("3"));
            if(e.getSource() == b4)
                textField.setText(textField.getText().concat("4"));
            if(e.getSource() == b5)
                textField.setText(textField.getText().concat("5"));
            if(e.getSource() == b6)
                textField.setText(textField.getText().concat("6"));
            if(e.getSource() == b7)
                textField.setText(textField.getText().concat("7"));
            if(e.getSource() == b8)
                textField.setText(textField.getText().concat("8"));
            if(e.getSource() == b9)
                textField.setText(textField.getText().concat("9"));
            if(e.getSource() == b0)
                textField.setText(textField.getText().concat("0"));
            if(e.getSource() == bdec)
                textField.setText(textField.getText().concat("."));
            
            if(e.getSource() == badd) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 1;
                textField.setText("");
            }
            
            if(e.getSource() == bsub) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 2;
                textField.setText("");
            }
            
            if(e.getSource() == bmul) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 3;
                textField.setText("");
            }
            
            if(e.getSource() == bdiv) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 4;
                textField.setText("");
            }
            
            if(e.getSource() == bsqr) {
                result = Math.pow(Double.parseDouble(textField.getText()), 2);
                textField.setText(""+result);
            }
            
            if(e.getSource() == bcbe) {
                result = Math.pow(Double.parseDouble(textField.getText()), 3);
                textField.setText(""+result);
            }
            
            if(e.getSource() == bsqt) {
                result = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText(""+result);
            }
            
            if(e.getSource() == blog) {
                result = Math.log10(Double.parseDouble(textField.getText()));
                textField.setText(""+result);
            }
            
            if(e.getSource() == beq) {
                secondNumber = Double.parseDouble(textField.getText());
                
                switch(operator) {
                    case 1:
                        result = firstNumber + secondNumber;
                        break;
                    case 2:
                        result = firstNumber - secondNumber;
                        break;
                    case 3:
                        result = firstNumber * secondNumber;
                        break;
                    case 4:
                        result = firstNumber / secondNumber;
                        break;
                    
                    default: result = 0;
                }
                
                textField.setText(""+result);
            }
            
            if(e.getSource() == bclr) {
                textField.setText("");
            }
            
            if(e.getSource() == bksp) {
                String s=textField.getText(); //s is what was in the text field
                textField.setText(""); //clear text field
                for(int i=0;i<s.length()-1;i++) //for every character in s minus one,
                    textField.setText(textField.getText()+s.charAt(i)); //add that character from s into the text field.
                
            }
            
            if(e.getSource() == sind) {
                //result = Math.toDegrees(Math.sin(Double.parseDouble(textField.getText())));
                result = Math.sin(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(""+result);
            }
            
            if(e.getSource() == sinr) {
                result = Math.sin(Double.parseDouble(textField.getText()));
                textField.setText(""+result);
            }
            
            if(e.getSource() == cosd) {
                result = Math.cos(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(""+result);
            }
            
            if(e.getSource() == cosr) {
                result = Math.cos(Double.parseDouble(textField.getText()));
                textField.setText(""+result);
            }
            
            if(e.getSource() == tand) {
                result = Math.tan(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(""+result);
            }
            
            if(e.getSource() == tanr) {
                result = Math.tan(Double.parseDouble(textField.getText()));
                textField.setText(""+result);;
            }
            
            if(e.getSource() == cbin) {
                result = Double.parseDouble(Integer.toBinaryString(Integer.parseInt(textField.getText())));
                textField.setText(""+(int)result);
            }
            
            if(e.getSource() == chex) {
                textField.setText(Integer.toHexString(Integer.parseInt(textField.getText())));
            }
            
            if(e.getSource() == coct) {
                
                result = Double.parseDouble(Integer.toString(Integer.parseInt(textField.getText()), 8));
                textField.setText(""+(int)result);
            
            }
            
            if(e.getSource() == loge) {
                
                result = Math.log(Double.parseDouble(textField.getText()));
                textField.setText(""+result);
                
            }
            
        }
    }
    
}
// {-}7
