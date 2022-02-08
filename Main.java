package Prework;

import java.util.Scanner;

public class Main {
    public static void checkPalindrome(){
        System.out.println("Enter an integer to check whether it is a palindrome:");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int rev= 0, n = num, rem;
        while(n>0){
            rem=n%10;
            n=n/10;
            rev= rev*10+rem;
        }
        if(num == rev){
            System.out.println("Number "+num+ " is a palindrome");
        }
        else{
            System.out.println("Number "+num+ " is not a palindrome");
        }
    }
    public static void printPattern(){
        System.out.println("Enter an integer to print pattern:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt() ;
        for(;n>0;n--){
            //Using nested loops
            for(int i = 0;i<n;i++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public  static void checkPrimeNumber(){
        System.out.println("Enter an integer to check whether it is Prime:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt() ;
        System.out.print("The Given number is divisible by 1");
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                prime = false;
                System.out.print(", "+i);
            }
        }
        System.out.println(" and "+ n+".");
        if (prime) System.out.println("Hence "+n +" is a prime number");
        else System.out.println("Hence "+n +" is not a prime number");

    }
    public static void printFibonacciSeries(){
        int n1 = 0, n2 =1, sum;
        System.out.println("Enter the required size of Fibonacci series:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt() ;
        if (n==1) System.out.println("The Fibonacci Series is: 0");
        else{
            System.out.print("The Fibonacci Series is: 0,1");
            for (int i = 2; i <n ; i++) {
                sum = n1+n2;
                n1=n2;
                n2 = sum;
                System.out.print(","+sum);
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    checkPalindrome();
                }
                break;
                case 2: {
                    printPattern();
                }
                break;
                case 3: {
                    checkPrimeNumber();
                }
                break;
                case 4: {
                    printFibonacciSeries();
                }
                break;
                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }


}
