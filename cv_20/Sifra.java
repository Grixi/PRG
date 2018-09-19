//Made by Adam Tretera (Grixi)
import java.util.Scanner;
public class Sifra {
    String slovo;
    char pismeno;
     int delkatextu;
     String text1atext2;
     String text1;
     char kodpismeno;
    
     public static void main(String[] args){
        Sifra sf = new Sifra();
        Scanner sc = new Scanner(System.in,"Windows-1250");
        sf.vratSlovo(sf,sc);
        sf.vratDelkuSlova(sf);
        sf.nastavPismeno(sf);

     }
      public void  vratSlovo(Sifra sf,Scanner sc){
        System.out.println("Napis slovo");
        slovo = sc.nextLine();
    }
    public void vratDelkuSlova(Sifra sf){
        delkatextu =slovo.length();
    }
    public void nastavPismeno (Sifra sf){
        
        for (int i=0; i<delkatextu; i++ ){
            
              pismeno =slovo.charAt(i);
        
         switch (pismeno){
             case 'a':kodpismeno='1';
             break;
             case 'b':kodpismeno='2';
             break;
             case 'c':kodpismeno='3';
             break;
             case 'd':kodpismeno='4';
             break;
             case 'e':kodpismeno='5';
             break;
             case 'f':kodpismeno='6';
             break;
             case 'g':kodpismeno='7';
             break;
             case 'h':kodpismeno='8';
             break;
             case 'i':kodpismeno='9';
             break;
             case 'j':kodpismeno='0';
             break;
             case 'k':kodpismeno='a';
             break;
             case 'l':kodpismeno='c';
             break;
            case 'm':kodpismeno='d';
             break;
             case 'n':kodpismeno='e';
             break;
             case 'o':kodpismeno='f';
             break;
             case 'p':kodpismeno='g';
             break;
             case 'q':kodpismeno='h';
             break;
             case 'r':kodpismeno='i';
             break;
             case 's':kodpismeno='j';
             break;
             case 't':kodpismeno='k';
             break;
             case 'u':kodpismeno='l';
             break;
             case 'v':kodpismeno='m';
             break;
             case 'w':kodpismeno='n';
             break;
             case 'x':kodpismeno='o';
             break;
             case 'y':kodpismeno='p';
             break;
             case 'z':kodpismeno='q';
             break;
             default: System.out.println("Error");
                     break;       
         }  
         System.out.print(kodpismeno);
         
    }
}
}
