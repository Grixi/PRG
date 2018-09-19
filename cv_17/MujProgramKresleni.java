import javax.swing.JFrame;

public class MujProgramKresleni extends JFrame {

MujProgramKresleni() {
this.setTitle("Jednoduchý Kreslící Program");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

KresliciPanel panel = new KresliciPanel();
this.add(panel);

this.pack();
}

public static void main(String[] args) {
MujProgramKresleni program = new MujProgramKresleni();
program.setVisible(true);
}
}