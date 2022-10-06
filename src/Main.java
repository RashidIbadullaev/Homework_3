public class Main {
    public static void main(String[] args) {

        double[] doublesArrays = {2.4, -2.1, 5.8, -7.2, 6.5, -8.3, 4.5, -9.1, 5.9, -3.2, 7.8, 1.2, 5.7, 8.7, -3.4};
        double sum = 0;
        int amount = 0;
        boolean first = false;

        for (int i = 0; i < doublesArrays.length; i++) {
            if (doublesArrays[i] > 0 && doublesArrays[i] < 10) {

            }

        }
        for (double n : doublesArrays) {
            if (n < 0) {
                first = true;
            }
            if (n > 0 && first) {
                sum = sum + n;
                amount++;
            }
        }
        System.out.println(sum / amount);
    }
}