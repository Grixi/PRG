public class PrevodKlasifikace{
    public static void main (String[] args){

        int znamka;
        znamka = Integer.parseInt(args[0]);
        if (znamka < 50) {
            System.out.println("Tvoje znamka je 5.");
        }
        if (znamka < 60 && znamka >= 50) {
            System.out.println("Dostanes 4");
        }
        if (znamka < 80 && znamka >= 60) {
            System.out.println("Mas za 3");
        }
        if (znamka < 90 && znamka >= 80) {
            System.out.println("2 jen tak dal");
        }
        if (znamka > 90) {
            System.out.println("Excelentni práce za 1");
        }
    }
}
