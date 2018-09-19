//Made by Adam Tretera
import java.util.Scanner;
public class SlovaPozpatku {
        String slovo;
        int delkaSlova;
        char pismeno;
        String pismenoString;
        String slovoPozpatku="";
        String pokracovat;
        int i;
        public static void main(String[] args){
        SlovaPozpatku sp = new SlovaPozpatku();
        Scanner sc = new Scanner(System.in,"Windows-1250");
        
        sp.zapisSlovo (sp,sc);
        sp.prevratCislo(sp); 
        sp.pokracovani(sp,sc);
    }

        public void  zapisSlovo(SlovaPozpatku sp,Scanner sc){
            System.out.println("Zadej slovo:");
            slovo = sc.nextLine();
            delkaSlova =slovo.length();
        }
        public void  prevratCislo(SlovaPozpatku sp){
            i=-1;
            for (i =i +delkaSlova; i>=0; i--)
            {
                

               pismeno =slovo.charAt(i);
              
               pismenoString = Character.toString(pismeno); 
               slovoPozpatku=slovoPozpatku +pismenoString;
            }
            System.out.println(slovoPozpatku);
            slovoPozpatku="";

           
        }
        public void  pokracovani(SlovaPozpatku sp,Scanner sc){
            System.out.println("chcete pokracovat ?(ANO/NE)");
            pokracovat = sc.nextLine();
            if (pokracovat.equalsIgnoreCase("NE")){
                System.exit(0);
            }
            else if (pokracovat.equalsIgnoreCase("ANO")){
                sp.zapisSlovo (sp,sc);
                sp.prevratCislo(sp); 
                sp.pokracovani(sp,sc); 
            }
        }

           
 }
