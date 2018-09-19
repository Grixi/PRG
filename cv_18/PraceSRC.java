//Made by:Adam Tretera
public class PraceSRC{
      String rodneCislo;
     

     public static void main(String[] args) {
       
        
        MujVstup mv = new MujVstup();
        RodneCislo rc =new RodneCislo();
        PraceSRC pc =new PraceSRC();

        System.out.println("Napis rodnecislo");

        mv.vratVstup();
        rc.vratRokNarozeni();
        rc.vratMesicNarozeni();
        rc.vratDenNarozeni();
        

        System.out.println("Je spravne:"+rc.kontrolujRc(rodneInt));
        System.out.println("Rok narozeni je "+rc.vratRokNarozeni());
        System.out.println("Mesic narozeni je "+rc.vratMesicNarozeni());
        System.out.println("Den narozeni je "+rc.vratDenNarozeni());      
        }
        }
 
