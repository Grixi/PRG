import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

    public class DruheOkno extends JFrame{

            public DruheOkno(){
            this.setTitle("Druhe Okno");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
        }

        public static void main(String[] args){
            DruheOkno druheOkno = new DruheOkno();
            Color myWhite = new Color(255, 255, 255);
            Color red =new Color (0, 0, 255);
            JLabel popisek = new JLabel("Adam Tretera");



            
            Font font = new Font("Verdana", Font.BOLD, 102);

            popisek.setFont(font);
            popisek.setOpaque(true);
            JButton tlacitko =new JButton("Zde");
            
            popisek.setBackground(red);
            popisek.setForeground(myWhite);
            druheOkno.add(tlacitko);
            druheOkno.pack();
            druheOkno.setVisible(true);
            


            
        }
}