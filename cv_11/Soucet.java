import java.util.Scanner;


public class Soucet {

   
    public static void main(String[] args) {
 String moznost;
 String a;
 String b;
 int vysledek;
 int hodnota1;
 int hodnota2;
 

 Scanner scanner = new Scanner(System.in,"Windows-1250");
 System.out.println("Zadej jestli chceš počítat obsah (S) nebo obvod (O):");
 moznost = scanner.nextLine();
 System.out.println("Zadej hodnotu pro A:");
 a = scanner.nextLine();
 System.out.println("Zadej hodnotu pro B:");
 b = scanner.nextLine();
 hodnota1 = Integer.parseInt(a);
 hodnota2 = Integer.parseInt(b);
 char moznost1= moznost.charAt(0);
 if (moznost1=='O')  { vysledek=2*(hodnota1+hodnota2);}
   
 
 else {vysledek=(hodnota1*hodnota2);}
 System.out.println(moznost+" :obdelniku je "+vysledek);
    }
}