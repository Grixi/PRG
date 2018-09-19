//Made by: Adam Tretera
public class PraceSRC{

    public static void main(String[] args){

            String rodneCislo;
            boolean cislo;
            String rok;
            String den;


        MujVstup mv = new MujVstup();
        RodneCislo rc = new RodneCislo();


        rodneCislo = mv.vratVstup();

        cislo = rc.kontrolujRC(rodneCislo);
        rok = rc.vratDenNarozeni(rodneCislo);
        den = rc.vratRokNarozeni(rodneCislo);
        

            System.out.println("Je rodné cislo  spravne? " + cislo);
            System.out.println("rok narozeni = " + rok);
            System.out.println("mesic a den narození = " + den);
    }
}