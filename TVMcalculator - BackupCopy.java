//package com.TVMcalculator;

import java.util.Scanner;

public class TVMcalculator{
    
    public static void main(String[] arguments){
        
        Formulae use1 = new Formulae();
        
        int userChoice = 0;
		int keepGoing = 1;
        
        System.out.println("Hello there! \nI was designed to calculate TVM...");
        
		while (keepGoing == 1) {
		
		System.out.println("Please enter the corresponding code to what you would like to calculate :)\nEnter; \n1. for Present Value(PV) \n2. for Future Value(FV) \n3. for Rate and \n4. for Time");
		Scanner reader = new Scanner(System.in);
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
		
            System.out.println("Would you like to continue calculation? :D (Press 1 if you wish to continue, or any other input if you wish to quit");
			reader = new Scanner(System.in);
            keepGoing = reader.nextInt();
		
		}
		
            System.out.println("Thanks for using the TVMcalculator! :D");
		
    }
    
    
    
    
}