package Fizzbuzz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{

    public Ventana(){

        //configuraciones basicas
        this.setVisible(true);
        this.setBounds(200,200,500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200,200) );
        this.setMaximumSize(new Dimension(800,800) );
        this.setTitle("cough cough");
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);

        //elementos contenidos
        JLabel coso = new JLabel();
        coso.setText("waltuuuh");
        coso.setSize(100,40);
        coso.setLocation(175,50);
        coso.setBackground(Color.white);
        coso.setOpaque(true);
        coso.setFont(new Font("Arial",Font.PLAIN,22));
        coso.setHorizontalAlignment(JLabel.CENTER);
        this.add(coso);
    }
    
}
