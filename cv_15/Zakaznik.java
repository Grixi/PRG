//Made by:Adam Tretera
import java.util.Scanner;

public class Zakaznik{
        int vekcislo;
        
        int rok;
        int nowrok = 2018;
        String vek;
        int penizezaplat =100;
        
       
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in,"Windows-1250");
        
       
     
        Zakaznik zk =new Zakaznik();
        Zakaznik zk1 =new Zakaznik();
        Zakaznik zk2 =new Zakaznik();
        Zakaznik zk3 =new Zakaznik();
       
        zk.spustObsah  (zk1 ,sc);
       zk.spustObsah  (zk2 ,sc);
       zk.spustObsah  (zk3 ,sc);
        
        sc.close();
    }
    
    void spustObsah (Zakaznik zk,Scanner sc){
        zk.scanPromene (sc);
        zk.vypoctiObsah ();
    }
 

     public void scanPromene (Scanner sc){
        
         System.out.println("Zadej tvuj vek ");
        vek = sc.nextLine();
        vekcislo = Integer.parseInt(vek);
     }
       
   
     void vypoctiObsah (){
        rok=nowrok-vekcislo;
        System.out.println("Rok narozeni je "+rok);
        System.out.println("Zaplat"+penizezaplat);
        
    }
    }




