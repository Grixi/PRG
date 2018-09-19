
import java.util.Scanner;

public class Mocnina {

   
    public static void main(String[] args) {
        int mocnina;

        int cislo;
       
        int vysledek=0;
        String cislozadane;
        String cislopromoc;
        
        Scanner scanner= new Scanner(System.in,"Windows-1250");

        System.out.println("Zadej cislo:");
        
        cislopromoc = scanner.nextLine();
         cislo= Integer.parseInt(cislopromoc);
    int cislo1=cislo;



    System.out.println("Zadej velikost mocniny:");
    
    cislozadane = scanner.nextLine();
    
   
    mocnina= Integer.parseInt(cislozadane);
   
    for (int i = 1; i < mocnina; i++) {
        cislo1 = cislo1 * cislo;}
    
  
        System.out.println("Mocnina je :"+cislo1);
    }
}
