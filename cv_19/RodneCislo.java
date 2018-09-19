//Made by: Adam Tretera
public class RodneCislo{

    public boolean kontrolujRC(String rodneCislo){
        Long rodneCislo1 = Long.parseLong(rodneCislo);  //převedení 
        if(rodneCislo1%11 == 0) {
            return true;
        } else {
            return false;
        }
    }

            public String vratRokNarozeni(String rodneCislo){
                return rodneCislo.substring(2,6);
            }

            public String vratDenNarozeni(String rodneCislo){
                return rodneCislo.substring(0,2);
            }
        }