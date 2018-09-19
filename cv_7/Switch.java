public class Switch {
    public static void main (String[] args){
    char pismeno='A';
    switch (pismeno){
        case 'A':case 'E':case 'I':case 'O':case 'U':case 'Y': System.out.println (pismeno+"  je samohlaska");break;
        default:System.out.println (pismeno+" je souhlaska");
    }
    }
}
