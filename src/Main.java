import java.util.Arrays;

    import java.util.Arrays;
    public class Main {    public static void selectionSort(double[] oneGame) {
        int a = oneGame.length;
        for (int i = 0; i < a - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a; j++) {                if (oneGame[j] < oneGame[minIndex]) {
                minIndex = j;                }
            }
            double temp = oneGame[i];            oneGame[i] = oneGame[minIndex];
            oneGame[minIndex] = temp;
            System.out.println(Arrays.toString(oneGame));        }
    }
        public static void main(String[] args) {        double[] oneHit = {0.34, 652.9, -224.921, -0.89, 234.221, 934.2, 55.6, -87.7, -3.34, -7.364, 21.80432, 145.586, 663.65, -234.0043, -894.237};
            for (int i = 0; i < oneHit.length; i++) {
                System.out.println(oneHit[i] + "\n");        }
            double result = 0;
            int s = 0;        boolean negativeNumber = false;

            for (double forNow : oneHit) {
                if (!negativeNumber) {                if (forNow < 0) {
                    negativeNumber = true;                }
                } else {                if (forNow > 0) {
                    result += forNow;                    s++;
                }            }
            }        //сумма чисел, деленное на их кол-во = их ср. ариф.
            System.out.println(result / s);
            double[] myNumbers = {0.56, 9.99, -43.62, 0.004, 9384.5, -9.77081, 3.66, -2.9, 6.733332, -88.33};
            System.out.println(Arrays.toString(myNumbers));
            selectionSort(myNumbers);
            System.out.println(Arrays.toString(myNumbers));
        }}


