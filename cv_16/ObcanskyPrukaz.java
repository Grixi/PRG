//Made by:Adam Tretera
import java.util.Scanner;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane.ScalableIconUIResource;

import java.util.Date;

public class ObcanskyPrukaz{
    String rodneCislo;
    String jmeno;
    String prijmeni;
    String adresa;
    Date rokNarozeni;
    Date datumVydani;
    String platnostDo;
    Date platnosDate;
    char pohlavi;
    String pohlavis;
    char typOperace;

    public static void main(String[] args) {
        
    ObcanskyPrukaz jirka = new ObcanskyPrukaz();
    ObcanskyPrukaz karel = new ObcanskyPrukaz();
    ObcanskyPrukaz adam = new ObcanskyPrukaz();
            jirka.ObcanskyPrukaz  (sc);
           karel.ObcanskyPrukaz  (sc);
           adam.ObcanskyPrukaz  (sc);
    }
       public void nactiHodnoty (){
           vypisHelp();
           
           
           do {
            Scanner sc = new Scanner(System.in,"Windows-1250");
            System.out.println("Zadej typ operace");
            System.out.println("Zadej hodnotu");
            switch  (typOperace)
            {
                case 'R': setRodneCislo(rodneCislo, sc);
                break;
                case 'P': setPrjmeni(prijmeni, sc);
                break;
                case 'J':setJmeno(jmeno ,sc);
                break;
                case 'C': setRokNarozeni(rokNarozeni ,sc);
                break;
                case 'T': setPlatnostDo(platnostDo ,sc);
                break;
                case 'X': setPohlavi(pohlavi ,sc);
                break;
            } 
           } while (typOperace=='E');
          
           
       }
       
        public void setRodneCislo(String rodneCislo ,Scanner sc){
         this.rodneCislo = rodneCislo;
         System.out.println("Zadej rodne cislo");
        rodneCislo = sc.nextLine();
       ;
         
        }
        public String getRodneCislo(){
            return this.rodneCislo;
            System.out.println(rodneCislo);

        }
        public void setJmeno(String jmeno ,Scanner sc){
            this.jmeno = jmeno;
         System.out.println("Zadej jmeno");
        jmeno = sc.nextLine();
        }
        public String getjJmeno(){
            return this.jmeno;
            System.out.println(jmeno);
        }
        public void setPrjmeni(String prijmeni ,Scanner sc){
            this.prijmeni = prijmeni;
            System.out.println("Zadej prijmeni");
        prijmeni = sc.nextLine();
        }
        public String getPrijmeni(){
            return this.prijmeni;
            System.out.println(prijmeni);
        }
        public void setAdresa(String adresa ,Scanner sc){
            this.adresa = adresa;
            System.out.println("Zadej adresu");
        adresa = sc.nextLine();
        }
        public String getAdresa(){
            return this.adresa;
            System.out.println(adresa);
        }
        public void setRokNarozeni(Date rokNarozeni ,Scanner sc){
            this.rokNarozeni = rokNarozeni;
            System.out.println("Zadej rok narozeni");
        rokNarozeni = sc.nextLine();
        }
        public String getRokNarozeni(){
            return this.rokNarozeni;
            System.out.println(rokNarozeni);
        }
        public void setDatumVydani(Date datumVydani ,Scanner sc){
            this.datumVydani = datumVydani;
            System.out.println("Zadej datum vydani");
        datumVydani = sc.nextLine();
        }
        public String getDatumVydani(){
            return this.datumVydani;
            System.out.println(datumVydani);
        }
        public void setPlatnostDo(String platnostDo ,Scanner sc){
            this.platnostDo = platnostDo;
            System.out.println("Zadej platnost");
        platnostDo = sc.nextLine();
        platnostDate.parse (platnostDo);
        }
        public String getPlatnostDo(){
            return this.PlatnostDo;
            System.out.println(platnostDo);
            
        }
        public void setPohlavi(char pohlavi ,Scanner sc){
            this.pohlavi = pohlavi;
            
            
            System.out.println("Zadej pohlavi");
        pohlavi = sc.nextLine();
        }
        public String getPohlavi(){
            return this.pohlavi;
            System.out.println(pohlavi);
        }
        public void vypisHelp (){
            System.out.println("Znaky operace :R=Rodnecislo,P =Prijmeni,J=Jmeno,C=rok narozeni,T= platnost do,V=datum vydani,X=pohlavi;E=konec");
        }
 }