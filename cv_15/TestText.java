//Made by: Adam Tretera
public class TestText{    
    String text1 = "Ahoj";
    String text2 = new String("Hello");
    String text1atext2;
    int delkatextu;
    char pismeno;
    String castPrijmeni;
    public static void main(String[] args) {
         TestText tt =new TestText();
    tt.spustObsah (tt);
    }
   
    void spustObsah (TestText tt){
        tt.spojText(tt);
     
     tt.zapisDelku (tt);
     tt.nastavPismeno (tt);
     tt.najdiCast (tt);
     tt.vypisText(tt);
    }
    void spojText(TestText tt){
         text1atext2 =text1.concat(text2); 
    }
   
    void zapisDelku (TestText tt){
        delkatextu =text2.length();
    }
    void nastavPismeno (TestText tt){
         pismeno =text2.charAt(2);
    }
    void najdiCast (TestText tt){
        castPrijmeni = text1.substring (2);
    }
     void vypisText (TestText tt){
         System.out.println(text1);
         System.out.println(text2);
         System.out.println(text1atext2);
         System.out.println (delkatextu);
          System.out.println (pismeno);
          System.out.println (castPrijmeni);
    }
}