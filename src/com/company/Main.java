package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String answer;

        do {

            System.out.println("Please Enter Customer Number: ");
            int CustomerId = Keyboard.nextInt();

            System.out.println("Please Enter Customer Name: ");
            String CustomerName = Keyboard.next();
            Keyboard.nextLine();

            System.out.println("Please Enter Sales Amount: ");
            double SalesAmount = Keyboard.nextDouble();

            System.out.println("Please Enter Tax Code: NRM (6%), NPF (0%), BIZ (4.5%): ");
            String TaxCode = Keyboard.next();

            // Calling the method to calculate tax and total amount
            CalculateTax(CustomerId, CustomerName, SalesAmount, TaxCode);

            System.out.println("Do You Want to Enter Another Record? (Y/N)");
            Keyboard.nextLine();
            answer = Keyboard.next();
            }
        while (answer.equalsIgnoreCase("Y"));
}
    private static void CalculateTax (int number, String name, double sale, String Taxcode) {
        double SalesTax=0.0;
        double TotalAmount;

        if (Taxcode.equalsIgnoreCase("NRM"))
            SalesTax = sale*.06;
        if (Taxcode.equalsIgnoreCase("NPF"))
            SalesTax = sale*0;
        if (Taxcode.equalsIgnoreCase("BIZ"))
            SalesTax = sale*.045;

        TotalAmount= sale + SalesTax;

        System.out.println("Customer ID: "+ number);
        System.out.println("Customer Name: "+name);
        System.out.println("Sales Amount: $"+sale);
        System.out.println("Tax Code: "+Taxcode);
        System.out.println("Total Amount Due: $"+TotalAmount);
        System.out.println();
    }
}
