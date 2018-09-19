//Made by Adam Tretera (Grixi)
import java.util.Random;
public class Pozdrav {
    int cislo;
    
    public static void main(String[] args){
        String pozdravTyp;
        Pozdrav pv = new Pozdrav();
        pv.vyberCislo(pv);
        pv.jeSude(pv);
    }
     public void  vyberCislo(Pozdrav pv){
         Random rand = new Random();
         cislo = rand.nextInt(10) + 1;
             
    }
    public void jeSude(Pozdrav pv){
        
        if (cislo%2==0){
             System.out.println("Ahoj");
        }
        else {
            System.out.println("Hello");
        }
    }
}
