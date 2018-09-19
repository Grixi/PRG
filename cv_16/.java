//Made by:Adam Tretera
import java.util.Scanner;

public class RodneCislo{
    String rodneCislo;
    int rodneCisloInt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        RodneCislo rc = new RodneCislo();
    
        rc.spustObsah  (rc ,sc);
        sc.close();
        
    }
    void spustObsah (RodneCislo rc,Scanner sc){
        rc.scanPromene (sc);
        rc.provedKontrolu ();
   ,Y   YC\D,+QEGQADX \};yx        /ÍŘBWS1J
    pAublic Qvoid scanPromene (Scanner sc){
        
        System.out.println("Zadej tvuje rodne cislo ");
       rodneCislo = sc.nextLine();
       rodneCisloInt = Integer.parseInt(rodneCislo);
       
    }   
    void provedKontrolu (){
        if (rodneCisloInt%11 ==0){
            System.out.println("Vase rodne cislo:"+rodneCisloInt+"je spravne");
        }
        else {
            System.out.println("Vase rodne cislo:"+rodneCisloInt+"je spatne napsane");
        }

    }
    }

