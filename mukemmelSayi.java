package patikadev;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, total = 0;
        boolean isEqual = true;
        System.out.print("bir sayı giriniz:");
        number = inp.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number){
        isEqual = true;
        }else {
            isEqual = false;
        }
        if (isEqual){
            System.out.println(number+" sayısı mükemmel sayıdır");
        }else {
            System.out.println(number+" sayısı mükemmel sayı değildir");
        }
    }
}
