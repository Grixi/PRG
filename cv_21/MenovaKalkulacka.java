import java.util.Scanner;
public class MenovaKalkulacka {
   String euro;
   String usd;
   int euroCislo;
   int usdCislo;
   String hodnota;
   String castHodnoty;
   int hodnotaMeny;
   int delkaTextu;
   int cislo;
   int vysledek;
   int vysledek1;
   
    
     public static void main(String[] args){
        MenovaKalkulacka mk = new MenovaKalkulacka();
        Scanner sc = new Scanner(System.in,"Windows-1250");
        mk.vratCislo(mk, sc);
        mk.zadejCislo(mk, sc);
        mk.nastavMenu(mk, sc);
        mk.vypoctiHodnotu(mk);
        mk.vypisCisla(mk);
    

     }
      public void  vratCislo(MenovaKalkulacka mk,Scanner sc){
        System.out.println("Zadej kurz Euro");
        euro = sc.nextLine();
        if (euro.equalsIgnoreCase("end")){
            System.exit(0);
        }
        euroCislo = Integer.parseInt(euro);
        System.out.println("Zadej kurz USD");
        usd = sc.nextLine();
        if (usd.equalsIgnoreCase("end")){
            System.exit(0);
        }
        usdCislo = Integer.parseInt(usd);
        
        

    }
    public void zadejCislo(MenovaKalkulacka mk,Scanner sc){
        System.out.println("Napis hodnotu cisla a menu (KC,EUR,USD)"); 
        hodnota = sc.nextLine();
        if (hodnota.equalsIgnoreCase("end")){
            System.exit(0);
        }


    }
    public void nastavMenu(MenovaKalkulacka mk,Scanner sc){
        delkaTextu =hodnota.length();
        
        if ( hodnota.endsWith( "KC")){
            castHodnoty = hodnota.substring (0,delkaTextu-2);
            cislo = Integer.parseInt(castHodnoty);
        }
        else {
            castHodnoty = hodnota.substring (0,delkaTextu-3);
            cislo = Integer.parseInt(castHodnoty);
        }     
    }
    public void vypoctiHodnotu(MenovaKalkulacka mk){
        if (hodnota.endsWith( "KC")){
            vysledek= cislo/euroCislo;
            vysledek1=cislo/usdCislo;
        }
        else if (hodnota.endsWith( "USD")){
            vysledek= cislo*usdCislo/euroCislo;
            vysledek= cislo*usdCislo;
        }
        else if (hodnota.endsWith( "EUR")){
            vysledek= cislo * euroCislo/usdCislo;
            vysledek1=cislo*euroCislo;
            
        }
  }
  public void vypisCisla(MenovaKalkulacka mk){
    if (hodnota.endsWith( "KC")){
        System.out.println(vysledek+"EUR");
        System.out.println(vysledek1+"USD");
    }
    else if (hodnota.endsWith( "USD")){
        System.out.println(vysledek+"EUR");
        System.out.println(vysledek1+"KC");
    }
    else if (hodnota.endsWith( "EUR")){
        System.out.println(vysledek+"USD");
        System.out.println(vysledek1+"KC");
        
    }

}
}














