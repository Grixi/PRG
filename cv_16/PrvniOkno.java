import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

    public class PrvniOkno extends JFrame{

            public PrvniOkno(){
            this.setTitle("Prvni Okno");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
        }

        public static void main(String[] args){
            PrvniOkno prvniOkno = new PrvniOkno();
            JLabel popisek = new JLabel("Dnes je: " + prvniOkno.vratDnesniDatum()+"Dnes je hezký den");
            popisek.setFont(new Font(Font.MONOSPACED, Font.BOLD, 50));
            popisek.setForeground(Color.RED);
            prvniOkno.add(popisek);
            prvniOkno.pack();
            prvniOkno.setVisible(true);
        }

        public String vratDnesniDatum(){
            SimpleDateFormat formatDatumu;
            formatDatumu = new SimpleDateFormat("dd.M.yyyy");
            Date aktualniDatum = new Date();
            return formatDatumu.format(aktualniDatum);
        }
}