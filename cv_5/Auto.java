public class Auto {
    public static void main (String[] args){
        int x = 50000;
        int y =  12*x;
        if (y<200000) {

            System.out.println("Jezdi mhd");
        }
        else if (y<400000 & y>200000 ) {
        
            System.out.println("Kup Kalinu");
        }
        else if  (y<800000 & y>400000 ) {
            System.out.println("Kup Octavii");
        } 
        else if  ( y>1000000 ) {
            System.out.println("Kup Class-S");
        }  

    }
}