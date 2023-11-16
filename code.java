import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        input natural number
//        Show sum of its digits
        // 564 =>  5 + 6 + 4  = 15
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the natural number");
//        int number = scanner.nextInt();
//        int sumOfDigits = 0;//save the sum of the digits here
//        //45612 (%10- 2) /10   => 4561 (%10- 1)  /10  456 (%10- 6) /10  .... 0... sum ++++
//        while (number > 0) {
//            int remainder = number % 10;//save the last digit in the variable remainder
//            sumOfDigits = sumOfDigits + remainder;
//            number = number / 10;
//        }
//        System.out.println("The sum of the digits is " + sumOfDigits);

//        Input number N
//        Print all numbers from 1 to n
//        After that all numbers from 2 to n
//        Example N=4:
//        Output:
//        1,2,3,4
//        2,3,4
//        3,4
//        4
        //input 4
        //loop i till < 4
        //loop j =1  till < 4
        //print i

//        System.out.println("enter the number N ");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n-1 ; j++) {
//                System.out.print(j + 1);
//                System.out.print(",");
//            }
//            System.out.println(n);
//        }

//        Calculate the Average of Elements in an Array.{7, 15, 3, 22, 10, 9, 14, 6};


//            int[] numbers = {7, 15, 3, 22, 10, 9, 14, 6};
//            int sum = 0;
//            for (int i = 0 ; i<numbers.length; i++) {
//                sum += numbers[i];
//            }
//            float average = sum / numbers.length;
//            System.out.println("The average of elements in the array is: " + average);


        //Write a Java program to create a two-dimensional array of integers and calculate the sum of all the elements in the array.
//        int[][] numbersArr = {{45,3,2},{10,20,34,35},{2}};
//
//        for (int i = 0; i < numbersArr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < numbersArr[i].length; j++) {
//                sum += numbersArr[i][j];
//            }
//            System.out.println("the sum of 2d array is : " + sum);
//        }


//        Find the Diagonal Sum in a Square Matrix
//        Example:
//        int[][] squareMatrix = {
//                {1, 2, 4},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int sum = 0;
//        int secondaryDiagonalSum = 0;
//        for (int i = 0; i < squareMatrix.length; i++) {
//            sum += squareMatrix[i][i];
//            secondaryDiagonalSum += squareMatrix[i][squareMatrix.length - 1 - i];
//        }
//        System.out.println("the sum of square matrix is: " + sum);
//        System.out.println("the secondaryDiagonalSum of square matrix is: " + secondaryDiagonalSum);
//    }

      //  In matrix of chars find the number of occurrences of char ‘e’.{
        //  {'a', 'b', 'c'},
        //  {'d', 'e', 'f'},
        //  {'g', 'h', 'i'}}
        char character = 'a';


        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int[] row :  myNumbers) {
            System.out.println(Arrays.toString(row));
        }



        char [] charArray = {'a','a', 'a', 'b', 'c', 'b'};
        System.out.println(Arrays.binarySearch(charArray, 'b'));





    }
}
