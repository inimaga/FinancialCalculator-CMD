//package com.FinancialCalculator;

import java.util.Scanner;

public class FinancialCalculator{
    
    public static void main(String[] arguments){
        
        Formulae use1 = new Formulae();
        
        int userChoice = 0;
		int keepGoing = 1;
		String scf = "Single cash flow! :)";
		Scanner reader;
        
        System.out.println("Hello there! \nI was designed to be a financial calculator =D");
		
		while (keepGoing == 1) {
		
		System.out.println("Please choose what you wanna calculate from the list of options below:");
		System.out.println("Enter; \n1.For single cash flow Calculations, \n2.For Annuity Caculations and \n3.For Rate(APR & EAR).");
		reader = new Scanner(System.in);
		userChoice = reader.nextInt();
			
		if (userChoice == 1) {
		
		System.out.println("Nice! We shall be calculating "+ scf );
		while (keepGoing == 1) {
		
		System.out.println("Please enter the corresponding code to what you would like to calculate :)\nEnter; \n1. for Present Value(PV) \n2. for Future Value(FV) \n3. for Rate and \n4. for Time");
		reader = new Scanner(System.in);
        userChoice = reader.nextInt();
		
        if (userChoice == 1) {
            System.out.println("Hmmm... I see you want me to calculate the Present value! Well, I would first need to collect data for Future Value, Rate and Time");
            System.out.println("Please enter the value for Future Value(FV)");
            reader = new Scanner(System.in);
            use1.FV = reader.nextDouble();
            System.out.println("Now, Please enter the value for Rate");
            reader = new Scanner(System.in);
            use1.Rate = (reader.nextDouble())/100;
            System.out.println("Finally, Please enter the value for Time");
            reader = new Scanner(System.in);
            use1.Time = reader.nextInt();
            use1.calculatePV();
            use1.showValues();
        }
        else if (userChoice == 2){
            System.out.println("Hmmm... I see you want me to calculate the Future value! Well, I would first need to collect data for Present Value, Rate and Time");
            System.out.println("Please enter the value for Present Value(PV)");
            reader = new Scanner(System.in);
            use1.PV = reader.nextDouble();
            System.out.println("Now, Please enter the value for Rate");
            reader = new Scanner(System.in);
            use1.Rate = (reader.nextDouble())/100;
            System.out.println("Finally, Please enter the value for Time");
            reader = new Scanner(System.in);
            use1.Time = reader.nextInt();
            use1.calculateFV();
            use1.showValues();
            
        }
        else if (userChoice == 3){
            System.out.println("Hmmm... I see you want me to calculate the Rate! Well, I would first need to collect data for Present Value, Future Value and Time");
            System.out.println("Please enter the value for Present Value(PV)");
            reader = new Scanner(System.in);
            use1.PV = reader.nextDouble();
            System.out.println("Now, Please enter the value for Future Value(FV)");
            reader = new Scanner(System.in);
            use1.FV = reader.nextDouble();
            System.out.println("Finally, Please enter the value for Time");
            reader = new Scanner(System.in);
            use1.Time = reader.nextInt();
            use1.calculateRate();
            use1.showValues();
        }
        else if (userChoice == 4){
            System.out.println("Hmmm... I see you want me to calculate the Time! Well, I would first need to collect data for Present Value, Future Value and Rate");
            System.out.println("Please enter the value for Present Value(PV)");
            reader = new Scanner(System.in);
            use1.PV = reader.nextDouble();
            System.out.println("Now, Please enter the value for Future Value(FV)");
            reader = new Scanner(System.in);
            use1.FV = reader.nextDouble();
            System.out.println("Now, Please enter the value for Rate");
            reader = new Scanner(System.in);
            use1.Rate = (reader.nextDouble())/100;
            use1.calculateTime();
            use1.showValues();
            
        }
        else {
            System.out.println("Oops, you goofed... That is not a valid input.\n");
        }
		
            System.out.println("Would you like to continue calculation of "+scf+"? :D (Press 1 if you wish to continue, or any other input if you wish to quit "+scf+" calculations)");
			reader = new Scanner(System.in);
            keepGoing = reader.nextInt();
		
		}
		
		}
		else if (userChoice == 2) {
		
		
		System.out.println("Nice! We shall be calculating Annuity! :)");
		while (keepGoing == 1) {
		
		System.out.println("Please enter the corresponding code to what you would like to calculate :)\nEnter; \n1. for Present Value of Annuity \n2. for Future Value Annuity\n3. for Cash Flows");// and\n4. for Time/Period required
		reader = new Scanner(System.in);
        userChoice = reader.nextInt();
		
        if (userChoice == 1) {
            System.out.println("Hmmm... I see you want me to calculate the Present value of Annuity! Well, I would first need to collect data for Cash Flow, Rate and Time");
            System.out.println("Please enter the value for Cash Flow");
			reader = new Scanner(System.in);
            use1.C = reader.nextDouble();
			System.out.println("Now, Please enter the value for Rate");
            reader = new Scanner(System.in);
            use1.Rate = (reader.nextDouble())/100;
            System.out.println("Finally, Please enter the value for Time");
            reader = new Scanner(System.in);
            use1.Time = reader.nextInt();
			use1.calculatePVA();
			use1.showValuesB();
        }
        else if (userChoice == 2){
            System.out.println("Hmmm... I see you want me to calculate the Future value of Annuity! Well, I would first need to collect data for Cash Flow, Rate and Time");
            System.out.println("Please enter the value for Cash Flow");
			reader = new Scanner(System.in);
            use1.C = reader.nextDouble();
			System.out.println("Now, Please enter the value for Rate");
            reader = new Scanner(System.in);
            use1.Rate = (reader.nextDouble())/100;
            System.out.println("Finally, Please enter the value for Time");
            reader = new Scanner(System.in);
            use1.Time = reader.nextInt();
			use1.calculateFVA();
			use1.showValuesB();
        }
        else if (userChoice == 3){
            System.out.println("Hmmm... I see you want me to calculate the Cash Flows! Well, I would first need to collect data for Present Value of Annuity, Rate and Time");
            System.out.println("Please enter the value for Present Value of Annuity");
			reader = new Scanner(System.in);
            use1.PVA = reader.nextDouble();
			System.out.println("Now, Please enter the value for Rate");
            reader = new Scanner(System.in);
            use1.Rate = (reader.nextDouble())/100;
            System.out.println("Finally, Please enter the value for Time");
            reader = new Scanner(System.in);
            use1.Time = reader.nextInt();
			use1.calculateC();
			use1.showValuesB();
        }
		
        else if (userChoice == 4){
            System.out.println("Hmmm... I see you want me to calculate the Time required! Well, I would first need to collect data for Present Value of Annuity, Cash flows and rate");
            System.out.println("Please enter the value for Present Value of Annuity");
			reader = new Scanner(System.in);
            use1.PVA = reader.nextDouble();
			System.out.println("Now, Please enter the value for Cash Flow");
			reader = new Scanner(System.in);
            use1.C = reader.nextDouble();
            System.out.println("Finally, Please enter the value for Rate");
            reader = new Scanner(System.in);
            use1.Rate = reader.nextDouble();
			use1.calculateAT();
			use1.showValuesB();
        }
		
		/*
        else if (userChoice == 5){
            System.out.println("Hmmm... I see you want me to calculate the Internal Rate of Return! Well, I would first need to collect data for Present Value of Annuity, Cash flows and Time");
            System.out.println("Please enter the value for Present Value of Annuity");
			reader = new Scanner(System.in);
            use1.PVA = reader.nextDouble();
			System.out.println("Now, Please enter the value for Cash Flow");
			reader = new Scanner(System.in);
            use1.C = reader.nextDouble();
            System.out.println("Finally, Please enter the value for Time");
            reader = new Scanner(System.in);
            use1.Time = reader.nextInt();
			use1.calculateIRR();
			use1.showValuesB();
        }
        */
        else {
            System.out.println("Oops, you goofed... That is not a valid input.\n");
        }
		
            System.out.println("Would you like to continue calculation of Annuity? :D (Press 1 if you wish to continue, or any other input if you wish to quit Annuity calculations)");
			reader = new Scanner(System.in);
            keepGoing = reader.nextInt();
		
		}
		
		}
		else if (userChoice == 3) {
		
		System.out.println("Nice! We shall be calculating Rate(APR & EAR)");
		while (keepGoing == 1) {
		
		System.out.println("Please enter the corresponding code to what you would like to calculate :)\nEnter; \n1. for Annual Percentage Rate (APR) or \n2. for Effective Annual Rate(EAR)");
		reader = new Scanner(System.in);
        userChoice = reader.nextInt();
		
        if (userChoice == 1) {
            System.out.println("Hmmm... I see you want me to calculate the Annual Percentage Rate (APR)! Well, I would first need to collect data for EAR and Number of Periods");
            System.out.println("Please enter the value for EAR");
			reader = new Scanner(System.in);
            use1.EAR = (reader.nextDouble())/100;
			System.out.println("Now, Please enter the value for Number of Periods");
            reader = new Scanner(System.in);
            use1.m = reader.nextDouble();
			use1.calculateAPR();
			use1.showValuesC();
        }
        else if (userChoice == 2){
            System.out.println("Hmmm... I see you want me to calculate the Effective Annual Rate(EAR)! Well, I would first need to collect data for Quoted rate(APR) and Number of Periods");
		System.out.println("Please enter the value for Quoted Rate(APR) [Important Note: This value should be for the year!]");
			reader = new Scanner(System.in);
            use1.APR = (reader.nextDouble())/100;
			System.out.println("Now, Please enter the value for Number of Periods");
            reader = new Scanner(System.in);
            use1.m = reader.nextDouble();
			use1.calculateEAR();
			use1.showValuesC();
            
        }
        else {
            System.out.println("Oops, you goofed... That is not a valid input.\n");
        }
		
            System.out.println("Would you like to continue calculation of Rates? :D (Press 1 if you wish to continue, or any other input if you wish to quit Rates calculations)");
			reader = new Scanner(System.in);
            keepGoing = reader.nextInt();
		
		}
		
		
		}
		else {
            System.out.println("Oops, you goofed... That is not a valid input.\n");
		}
		
			System.out.println("Would you like to continue using the Financial Calculator? :D (Press 1 if you wish to continue, or any other input if you wish to quit)");
			reader = new Scanner(System.in);
            keepGoing = reader.nextInt();
		}
		
            System.out.println("Thanks for using the Financial calculator! See ya later! :D");
    }
    
}