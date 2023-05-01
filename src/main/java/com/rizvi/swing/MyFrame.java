package com.rizvi.swing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame title goes here");// sets the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false);// prevent frame from being resized
        this.setSize(620,620); // sets the x-dimension, y-dimension of Frame
        this.setVisible(true);  // make frame visible

        ImageIcon image = new ImageIcon("test.jpg"); // create an ImageIcon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(126,50,255)); // change background of frame
        
    }
    
    }
