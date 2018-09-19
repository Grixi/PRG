import java.util.Scanner;
public class BMI {
    String vyska;
    double vyskaCislo;
    String hmotnost;
    double hmotnostCislo;
    double vysledek;

    public static void main(String[] args){

        BMI bm = new BMI();
        Scanner sc = new Scanner(System.in,"Windows-1250");
        bm.vratParametry(bm, sc);
        bm.vypocitejBMI(bm);
        bm.vypisVysledek(bm);
    }

        public void  vratParametry(BMI bm,Scanner sc){
            System.out.println("Zadej tvoji vysku (m)");
            vyska = sc.nextLine();
            vyskaCislo = Double.parseDouble(vyska);
            System.out.println("Zadej tvoji hmotnost (kg)");
            hmotnost = sc.nextLine();
            hmotnostCislo = Double.parseDouble(hmotnost);
        }
        public void vypocitejBMI (BMI bm){
            vysledek = hmotnostCislo/(vyskaCislo*vyskaCislo);
        }
        public void vypisVysledek (BMI bm){
           if (vysledek <= 18.5){
               System.out.println("Tvoje kategorie je podvaha hrozi vysoke zdravtni riziko tvoje BMI je "+vysledek);
           }
           else if (vysledek<24.9 && vysledek > 18.5){
                 System.out.println("Tvoje kategorie je v normalu nehrozi  zdravtni riziko tvoje BMI je "+vysledek);
           }
           else if (vysledek<29.9 && vysledek >24.9){
            System.out.println("Tvoje kategorie je v nadvaha hrozi minimalni zdravtni riziko tvoje BMI je "+vysledek);
           }
           else if (vysledek <=34.9 && vysledek > 29.9 ){
            System.out.println("Tvoje kategorie je v obezita 1. stupne hrozi zvysene zdravtni riziko tvoje BMI je "+vysledek);
           }
           else if (vysledek <=39.9 && vysledek > 34.9 ){
            System.out.println("Tvoje kategorie je v obezita 2. stupne hrozi vysoke zdravtni riziko tvoje BMI je "+vysledek);   

        }
        else if (vysledek >=40  ){
            System.out.println("Tvoje kategorie je v obezita 3. stupne hrozi velike zdravtni riziko");   
        }
    }
}