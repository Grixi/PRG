//Made by:Adam Tretera
import java.util.Scanner;
public class Maxcislo {

   
    public static void main(String[] args) {
 String cislo1;

 int hodnota1;
int maxvalue=0;
 

 Scanner scanner = new Scanner(System.in,"Windows-1250");
 do {
     System.out.println("Zadej cislo");
     cislo1 = scanner.nextLine();
     
     hodnota1 = Integer.parseInt(cislo1); 
     if (hodnota1 > 0  && hodnota1 > maxvalue) 
     {
        maxvalue=hodnota1;
     }
    

     
}
while (hodnota1!=0);
System.out.println("max cislo je"+maxvalue);

 
 

    }
} 
   