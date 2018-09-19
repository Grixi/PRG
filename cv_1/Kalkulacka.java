public class Kalkulacka {
    public static void main (String[] args){
        char operace='/';
        int cisloA=22;
        int cisloB=0;
        int vysledek=0;
        if (cisloB==0 & operace=='/'){System.out.println("Error");}
        else{
        switch (operace){
            case '+' :vysledek=cisloA + cisloB;break;
            case '-' :vysledek=cisloA - cisloB;break;
            case '*' :vysledek=cisloA * cisloB;break;
            case '/' :vysledek=cisloA / cisloB;break;
            default: System.out.println ("Error");
        }
        System.out.println(vysledek);
        }
        
    }
}