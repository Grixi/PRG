
import java.util.Scanner;


public class RocniObdobi {

   
    public static void main(String[] args) {

      
        String mesic;
        String jmeno;               
        String zadanyRok;          
        int vek;          
        int nowrok = 2018;     
        int obdobi;
        String neco;
        
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        
        System.out.println("Ahoj, zadej sve jmeno:");
        
        jmeno = scanner.nextLine(); 
        System.out.println("Ve kterem roce jsi se narodil?"); 
        
        zadanyRok = scanner.nextLine();
        
        System.out.println("Ve kterem mesici jsi se narodil?(cisly)");
        mesic = scanner.nextLine();
        obdobi = Integer.parseInt(mesic);
        switch (mesic){
            case 1: case 2: case 12: neco= "Zime" ; break;
            case 6: case 7: case 8: neco= "Lete" ; break;
            case 3: case 4: case 5: neco= "Jare" ; break;
            case 9: case 10: case 11: neco= "Podzimu" ; break;
            default: neco="Error"; break;
            
        }

        vek = nowrok - Integer.parseInt(zadanyRok);
        
        System.out.println("Osoba, ktera se jmenuje: " + jmeno + " a je mu " + vek + " let a narodil/a se v "+neco  ); 
 
        scanner.close();
    }
}