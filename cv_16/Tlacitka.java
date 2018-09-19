import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

   
        public class Tlacitka {  
            Tlacitka()  
               {  
               JFrame f= new JFrame("Tlacitka");    
               JPanel panel=new JPanel();  
                   
               panel.setBackground(Color.gray);  
               JButton b1=new JButton("Do prava");  
               panel.setBounds(40,80,200,200); ad   
               b1.setBounds(50,100,80,30);  
               b1.setBackground(Color.yellow);   
               JButton b2=new JButton("Do leva");   
               b2.setBounds(100,100,80,30);   
               b2.setBackground(Color.blue);   
               panel.add(b1); panel.add(b2);  
               f.add(panel);  
                       f.setSize(1000,1000);    
                       f.setLayout(null);    
                       f.setVisible(true);    
               }  
               public static void main(String args[])  
               {  
               new Tlacitka();  
               }  
           }  
