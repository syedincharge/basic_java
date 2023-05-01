package com.rizvi.swing.labels;



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {


    public static void main(String[] args) {

        //  JLabel  = a GUI display area for a string of text, an image or both

        ImageIcon image = new ImageIcon("test.jpg");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);



        JLabel label = new JLabel();
        label.setText("Bro, Do really wants to code ? "); // set test for label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text center
        label.setVerticalTextPosition(JLabel.TOP); // set text center
        label.setForeground(new Color(0,50,0));
        label.setFont(new Font("Mv Boli", Font.PLAIN ,20));
        label.setIconTextGap(-65); // sets the gap
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // to display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
       // label.setBounds(100,75,450,450); // sets x, y position with in the frame

        JFrame frame  = new JFrame(); // create the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //frame.setSize(620,620); // sets the x-dimension, y-dimension of Frame
        //frame.setLayout(null);
        frame.setVisible(true);  // make frame visible
        frame.add(label);
        frame.pack();


    }
}
