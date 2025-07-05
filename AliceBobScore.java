import java.util.Scanner;

public class AliceBobScore {

    public static void compareTriplets(int[] alice, int[] bob) {
        int[] score = new int[2]; // [aliceScore, bobScore]

        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i]) {
                score[0]++;
            } else if (alice[i] < bob[i]) {
                score[1]++;
            }
        }

        System.out.print(score[0] + " " + score[1]);
    }

    public static void readArray(int[] arr, Scanner sc) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];

        readArray(alice, sc);
        readArray(bob, sc);
        compareTriplets(alice, bob);
    }
}
