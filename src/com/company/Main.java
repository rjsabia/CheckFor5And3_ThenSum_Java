package com.company;

public class Main {

    public static void main(String[] args) {

        //counting every 2 numbers
//        for (int i = 1; i < 7; i += 2) {
//            System.out.println(i);
//        }

        int count = 0;
        int theSum = 0;

        for (int i = 1; i <= 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                theSum += i;
                count++;
            }

            if(count == 5) {
                System.out.println("Exiting for loop");
                break;
            }
        }

        System.out.println("The total of summed numbers is "
                + theSum);
    }
}
