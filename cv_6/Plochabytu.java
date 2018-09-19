public class Plochabytu {
    public static void main (String[] args){
        int A=1;
        int B=3;
        int C=5;
        int Koupelna=5;
        int Kuchyne=15;
        int Wc=1;
        int x=B;
        int m=0;
        for (int  i=0;i<=x; i++) {
            m+=1;
        }
        int Byt=Koupelna + Kuchyne + Wc +10*m;
        System.out.println("Plocha bytu bude  :" +Byt);

    
    }
}