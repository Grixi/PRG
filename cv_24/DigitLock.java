//Made by Adam Tretera
import java.util.Scanner;

import java.util.Random;
public class DigitLock {
    String kod;
    int delkatextu;
    int cislo1;
    int cislo2;
    int cislo3;
    int randomKod;
    int kodCislo;
    public static void main(String[] args){ //hlavní třida vše se zde spoští
        DigitLock dl = new DigitLock(); //vytvoření nové třídy

        
        dl.vygenerujCisla (dl); 
        dl.zkontrolujKod (dl); 
    }

        public void vratCislo (DigitLock dl,Scanner sc){
            System.out.println("Zadej kod"); //vypíše text
            kod = sc.nextLine();
            delkatextu =kod.length();
            kodCislo = Integer.parseInt(kod);
            if (delkatextu >3 || delkatextu <3){
                System.out.println("Spatny format");
                System.exit(0); // ukončí 
            }
         
            
        }
        public void  vygenerujCisla(DigitLock dl){
            Random rand = new Random();
            cislo1 = rand.nextInt(9) + 1;   
            cislo2 = rand.nextInt(9) + 1; //vygenereuje cislo jedna až deset
            cislo3 = rand.nextInt(9) + 1;
             randomKod = Integer.valueOf(String.valueOf(cislo1) + String.valueOf(cislo2)+ String.valueOf(cislo3));
           
        }
        public void zkontrolujKod(DigitLock dl){
            for(int i=0; i<11; i++){
                Scanner sc = new Scanner(System.in,"Windows-1250");
                dl.vratCislo (dl ,sc);
               
                if (randomKod==kodCislo){
                    System.out.println("The lock is UNLOCKED now.");
                    break;
                }
                else if(i==10){
                    System.out.println("Wrong code  the lock is LOCKED.");
                }
            }
           
        }

}


