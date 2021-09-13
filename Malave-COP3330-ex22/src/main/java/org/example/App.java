package org.example;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Jose Malave
 */
public class App {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String num1In = sc.nextLine();

        System.out.println("Enter the second number: ");
        String num2In = sc.nextLine();

        System.out.println("Enter the third number: ");
        String num3In = sc.nextLine();

        int num1 = Integer.parseInt(num1In);
        int num2 = Integer.parseInt(num2In);
        int num3 = Integer.parseInt(num3In);

        int bigNum;

        if (num1 > num2)
        {
            bigNum = num1;
        }
        else
        {
            bigNum = num2;
        }


        if (bigNum > num3)
        {
            System.out.println("The largest number is " + bigNum);
        }
        else if (bigNum < num3)
        {
            bigNum = num3;
            System.out.println("The largest number is " + bigNum);
        }

    }



    }



