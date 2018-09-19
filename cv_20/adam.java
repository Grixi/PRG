public class Test {

    public static void main(String[] args) {

        int firstGuessDigit, secondGuessDigit, thirdGuessDigit, fourthGuessDigit;
        String guess = "1234";

        String[] parts = new String[4];
        for(int i = 0; i < 4; i++) {
            parts[i] = ""+guess.charAt(i);
        }

        firstGuessDigit = Integer.parseInt(parts[0]);
        secondGuessDigit = Integer.parseInt(parts[1]);
        thirdGuessDigit = Integer.parseInt(parts[2]);
        fourthGuessDigit = Integer.parseInt(parts[3]);

    } 

}

