//Made by:Adam Tretera
import java.util.Scanner;

public class ObsahGraficky {
        int hodnota1;
        int hodnota2;
        int obsah;
        String cislo1;
        String cislo2;
       
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in,"Windows-1250");
        ObsahGraficky og =new ObsahGraficky();
        ObsahGraficky og1 =new ObsahGraficky();
        ObsahGraficky og2 =new ObsahGraficky();
        ObsahGraficky og3 =new ObsahGraficky();
        og.spustObsah (og1 ,sc);
        og.spustObsah (og2 ,sc);
        og.spustObsah (og3 ,sc);
        sc.close();
    }
    
    void spustObsah(ObsahGraficky og,Scanner sc){
         og.scanPromene(sc);
         og.vykresliKostku();
         og.vypoctiObsah();
        }
     void scanPromene (Scanner sc){
        
         System.out.println("Zadej cislo pro delku");
        cislo1 = sc.nextLine();
        hodnota1 = Integer.parseInt(cislo1);
        System.out.println("Zadej cislo pro sirku");
        cislo2 = sc.nextLine();
        hodnota2 = Integer.parseInt(cislo2);
            }   
    void vykresliKostku() {
        int i=0;
        int y=0;
        for (i=0; i<hodnota1; i++) {
        System.out.println(""); //zapisuje se pouze šířka
            for ( y=0; y<hodnota2; y++ ){
                System.out.print(" Xx");}
                 }
            }  
     void vypoctiObsah (){
        obsah=hodnota1*hodnota2;
        System.out.println("");
        System.out.println ("Obsah je: "+obsah);
    }
    }





