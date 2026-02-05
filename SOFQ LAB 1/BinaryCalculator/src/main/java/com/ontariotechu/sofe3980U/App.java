package com.ontariotechu.sofe3980U;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        LocalTime currentTime = new LocalTime();
//        System.out.println("The current local time is: " + currentTime);
//        Binary binary1=new Binary("00010001000");
//        System.out.println( "First binary number is "+binary1.getValue());
//        Binary binary2=new Binary("111000");
//        System.out.println( "Second binary number is "+binary2.getValue());
//        Binary sum= Binary.add(binary1,binary2);
//        System.out.println( "Their summation is "+sum.getValue());

        //Calling binary functions
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        Binary binary1 = new Binary(input.nextLine());

        System.out.print("Enter second binary number: ");
        Binary binary2 = new Binary(input.nextLine());

        System.out.println("First number:  " + binary1.getValue());
        System.out.println("Second number: " + binary2.getValue());

        Binary sum = Binary.add(binary1, binary2);
        Binary orResult = Binary.or(binary1, binary2);
        Binary andResult = Binary.and(binary1, binary2);
        Binary multiplyResult = Binary.Multiply(binary1, binary2);

        System.out.println("Add:          " + sum.getValue());
        System.out.println("OR:           " + orResult.getValue());
        System.out.println("AND:          " + andResult.getValue());
        System.out.println("Multiply: " + multiplyResult.getValue());
        input.close();
    }
}
