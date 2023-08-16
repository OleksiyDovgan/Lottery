import java.util.Arrays;

public class LotteryProject {
    public static void main(String[] args) {

        int[] first = new int[7];

        int[] second = new int[7];

        for (int i = 0; i < 7; i++) {
            first[i] = (int) (Math.random() * 10);

            second[i] = (int) (Math.random() * 10);

        }

        Arrays.sort(first);

        Arrays.sort(second);

        int matches = 0;

        for (int i = 0; i < 7; i++) {

            if (first[i] == second[i]){

                matches++;

            }

        }

        System.out.println("Lottery number " + Arrays.toString(first));

        System.out.println("Player number " + Arrays.toString(second));

        System.out.println("Number of matches " + matches);

    }

}
