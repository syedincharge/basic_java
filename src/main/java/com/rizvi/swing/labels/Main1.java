package com.rizvi.swing.labels;


import javax.swing.*;
import java.awt.*;

public class Main1 {

    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("thumbsUp.png");


        JLabel jLabel = new JLabel();
        jLabel.setText("Hi");
        jLabel.setIcon(icon);
        //jLabel.setVerticalAlignment(JLabel.BOTTOM);
        //jLabel.setHorizontalAlignment(JLabel.RIGHT);
        jLabel.setBounds(100,100, 75, 75);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250, 500, 250);
        greenPanel.setLayout(new BorderLayout());


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0, 250, 250);
        bluePanel.setLayout(new BorderLayout());


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0, 250, 250);
        redPanel.setLayout(new BorderLayout());
        greenPanel.add(jLabel);

        JFrame frame  = new JFrame(); // create the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setLayout(null);
        frame.setSize(750,750); // sets the x-dimension, y-dimension of Frame
        frame.setVisible(true);  // make frame visible
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
