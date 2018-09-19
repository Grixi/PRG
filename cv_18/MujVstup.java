//Made by:Adam Tretera
import java.util.Scanner;
public class MujVstup{
    int rodneInt;  
    public void vratVstup(String rodneCislo) {
    Scanner sc = new Scanner(System.in,"Windows-1250");
    rodneCislo = sc.nextLine();
    rodneInt = Integer.parseInt(rodneCislo);
}
}