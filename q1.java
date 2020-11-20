package org.koud.example;

public class q1 {
    public static void main (String[] args) {

        int count = 0;
        int sum = 0;
        int count2 = 0;
        int sum2 = 0;

       //avg of numbers divisible by 5,3,7
        for(int i=0; i <= 2000 ; i++){
            if( i%3 == 0  && i%5 == 0 && i%7 == 0 ){
                sum += i ;
                count++;
            }

        }
        System.out.println("avg of numbers divisible by 5,3,7");
        System.out.println("count of numbers " + (count - 1));
        System.out.println("sum of numbers " + sum);
        int average =sum/count;
        System.out.println("average of numbers " + average);

       //avg of numbers divisible by 53
        for(int i=0; i <= 2000 ; i++){
            if( i%53 == 0  ){
                sum2 += i ;
                count2++;
            }

        }
        System.out.println("\navg of numbers divisible by 53");
        System.out.println("count of numbers " + (count2 - 1));
        System.out.println("sum of numbers " + sum2);
        int average2 =sum2/count2;
        System.out.println("average of numbers " + average2);


    }

}
