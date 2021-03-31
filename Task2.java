package com.company;

import java.util.Scanner;
/* #38
Продемонстрируйте при перехопленні виключення ArithmeticException,   можливості усунути
помилку у даних та виконати завдання у повному обсязі.
 */
public class Task2 {
    public void exceptionCaster(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Here we can cause an [ArithmeticException]");
        System.out.print("Enter first number: ");
        int numerator= scan.nextInt();
        System.out.print("Enter second value(You can enter [0] for causing an exception):");
        int denominator = scan.nextInt();
        int result;
        try{
            result = numerator/denominator;
        }catch (ArithmeticException zero){
            result=0;
            System.out.println("Exception have caught: "+ "result of caching - "+ "["+result+"]");
        }
    }
}
