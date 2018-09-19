import java.util.Scanner;
import java.util.Random;

public class GameFindNumber {
    int pokus;
    String pripraven;
    int randomCislo;
    String tip;
    int tipCislo;

    public static void main(String[] args){

        GameFindNumber gfn = new GameFindNumber();
        Scanner sc = new Scanner(System.in,"Windows-1250");
        
        gfn.chcesHrat(gfn, sc);
        gfn.vygenerujCislo (gfn, sc);
        gfn.zadejCislo (gfn, sc);
        gfn.rozhodni(gfn, sc);

        
    }

    public void chcesHrat (GameFindNumber gfn,Scanner sc){
        System.out.println("Chces hrat ? Ano / Ne ");
        pripraven = sc.nextLine();
        if (pripraven.equalsIgnoreCase("Ne")){
            System.out.println("Spust az budes pripraven");
            System.exit(0);
         }  
    }

    public void vygenerujCislo (GameFindNumber gfn,Scanner sc){
        Random rand = new Random();
        randomCislo = rand.nextInt(10) + 1;
    }

    public void zadejCislo (GameFindNumber gfn,Scanner sc){
        System.out.println("Myslím si cislo 1-10");
        System.out.println("Zadej cislo ,co si myslis ze to je:(Pocet pokusu 7) ");
        tip = sc.nextLine();
        tipCislo = Integer.parseInt(tip);
    }

    public void rozhodni (GameFindNumber gfn,Scanner sc){
       
            for (pokus=1; pokus <=10; pokus++){
                if (tipCislo==randomCislo){
                    System.out.println("Vyhral jsi cislo je "+randomCislo+" uhodl jsi ho na "+pokus+".");
                    if (pokus<=3)
                    {
                        System.out.println("Jsi buh");
                    }
                    else {
                        System.out.println("Jsi normální");  
                    }
                    break;
                }
                else {
                    if (pokus==7){
                        System.out.println("!Game over! vice stesti priste");
                        break;
                    }
                    else{
                    System.out.println("Nevadí zkus to znova");
                    System.out.println("Zadej cislo ,co si myslis ze to je: ");
                    tip = sc.nextLine();
                    tipCislo = Integer.parseInt(tip);
                    }
                }
            }    
    }


}