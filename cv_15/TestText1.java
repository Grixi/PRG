//Made by: Adam Barta
public class TestText{    
    public static void main(String[] args) {
        String jmeno = "Adam";
        String prijmeni = new String("Barta");
        String jmenoAprijmeni = ("   ")+jmeno.concat(prijmeni); //spoji jmeno a prijmeni
        int delkaJmena = jmeno.length(); //vypocita delku jmena
        int pozice = 2; //urci pozici pismena
        char znakDlePozice = jmeno.charAt(pozice); //najde znak na pozici 
        String castPrijmeni = prijmeni.substring(2, 5); //najde cast prijmeni, zacne na "2" neskonci dokud neni pozice stejna jako "5"
        String bezMezer = jmenoAprijmeni.trim(); //odstrani mezery
        int castJmena = jmeno.indexOf("da"); //najde pozici na ktere zacina "da" ve jmene
        String heslo = "291A";
        String zadaneHeslo = "291a";

        System.out.println(jmeno.toLowerCase()); //vypise jmeno v lowerCase
        System.out.println(prijmeni.toUpperCase()); //vypise prijmeni v upperCase
        System.out.println(jmenoAprijmeni);
        System.out.println("Delka jmena je: " + delkaJmena);
        System.out.println("Znak na 3. pozici je: " + znakDlePozice);
        System.out.println("Cast prijmeni: " + castPrijmeni);
        System.out.println(bezMezer);
        System.out.println("da zacina na pozici: " + castJmena);

        //porovna 2 stringy
        if (heslo.equals(zadaneHeslo)) {
            System.out.println("Heslo OK");
        } else {
            System.out.println("Heslo ERROR");
        }

        //porovna 2 stringy- nezalezi na velikost pismen (lowercase,uppercase)
        if (heslo.equalsIgnoreCase(zadaneHeslo)) {
            System.out.println("Heslo OK");
        } else {
            System.out.println("Heslo ERROR");
        }
    }
}