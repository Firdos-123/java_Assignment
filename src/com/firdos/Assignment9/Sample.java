package com.firdos.Assignment9;

import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSamples = 0;
        int rounds = 1;

        while (totalSamples < 30) {
            System.out.print("Enter samples collected in round and 0 for finished " +rounds);
            int samplesInRound = scanner.nextInt();

            if (samplesInRound == 0) {
                break;
            }

            totalSamples += samplesInRound;
            rounds++;
        }

        System.out.println("\nAsif collected a total of leaf sample " + totalSamples);
        System.out.println("He took total round " + rounds);

        scanner.close();
    }
}
