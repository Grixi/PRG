
//Made by:Adam Tretera
import java.util.Random;
public class Kostka {   
    public static void main(String[] args) {
         int pocetstran =6; 
         int delka=4;
         int sirka=4;
        int randomValue=1;

        

        Random rand = new Random();
        
        int  n = rand.nextInt(6) + 1; //zdorj internet
       
        
        randomValue = (int)Math.round(Math.random()*5);
        randomValue =randomValue+1;
         //zdorj loterie
         

        System.out.println(" na kostce ketra meri "+sirka+"cmX"+delka+"cm a ma "+pocetstran+"stran padlo:" +randomValue);
        System.out.println(" druha kostka:"+n );
    }
}