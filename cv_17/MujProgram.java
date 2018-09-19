import javax.swing.JFrame;

public class MujProgram extends JFrame {

MujProgram() {
this.setTitle("Můj Program");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

MujPanel panel = new MujPanel();
this.add(panel);

this.setSize(400, 300);
}

public static void main(String[] args) {
MujProgram program = new MujProgram();
program.setVisible(true);
}
}
