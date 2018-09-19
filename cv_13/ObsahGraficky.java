//Made by:Adam Tretera
import java.util.Scanner;
public class Obsahgraficky {

   
    public static void main(String[] args) {
 String cislo1;
 String cislo2;


 int hodnota1;
 int hodnota2;
 int obsah;

 Scanner scanner = new Scanner(System.in,"Windows-1250");
 System.out.println("Zadej cislo pro delku");
 cislo1 = scanner.nextLine();
 hodnota1 = Integer.parseInt(cislo1);
 System.out.println("Zadej cislo pro sirku");
 cislo2 = scanner.nextLine();
 hodnota2 = Integer.parseInt(cislo2);
 int i=0;
 for (i=0; i<hodnota1; i++) {
    System.out.println(""); //zapisuje se pouze šířka
     for (int y=0; y<hodnota2; y++ ){
     System.out.print("*");}
 }
    obsah=hodnota1*hodnota2;

    System.out.println("");
    System.out.println ("Obsah je"+obsah);
    }
}

