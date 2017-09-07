//package com.TVMcalculator;

public class Formulae {
    
    //As this is a program to calculate the value of money in different times, i have entered the involved variables below. "double" is used instead of "int" as it has a wider range.
    
    private double PV = 0;
    private double FV = 0;
    private double Time = 0;
    private double Rate = 0; //Tell the user to enter value as a percentage ?
	private double R = 0;
	private double C = 0; //Represents cashflow for annuity
	private double APR = 0;
	private double m = 0; //Represents period (Number of compounding period)
	private double NPV = 0; //Perhaps later include the feature to tell if the NPV is positive or negative
	private double PVA = 0;
	private double FVA = 0;
	private double EAR = 0;
	private double E = 0;
	private double F = 0;
	private double G = 0;
	private double H = 0;
	
    
    public double calculatePV (double futureValue, double rate, double T){
        
		FV = futureValue;
		Rate = rate/100;
		Time = T;
		
        R = Math.pow((float)(1 + Rate), (int)Time);
        PV = FV/R;
		
		return PV;
    }
    
    public double calculateFV(double presentValue, double rate, double T){
        
		PV = presentValue;
		Rate = rate/100;
		Time = T;
		
        R = Math.pow((float)(1 + Rate), (int)Time);
        FV = PV * R;
        
		return FV;
    }
    
    public double calculateTime(double presentValue, double futureValue, double rate){
        
		PV = presentValue;
		FV = futureValue;
		Rate = rate/100;
		
        Time = (Math.log(FV/PV) / Math.log(1 + Rate));
        
		return Time;
    }
    
    public double calculateRate(double presentValue, double futureValue, double T){
        
		PV = presentValue;
		FV = futureValue;
		Time = T;
		
        Rate = (Math.pow((float)(FV/PV),(float)(1/Time)) - 1) * 100;
		
		return Rate;
    }
    
    public void showValues(){
        System.out.println("The Present value is: " + PV);
        System.out.println("The Future value is: " + FV);
        System.out.println("The Time involved is: " + Time + " Years");
        System.out.println("The Rate used is: " + Rate);
    }
    // The addition of other features began here
	public double calculatePVA(double cashFlow, double rRate, double T){
		Rate = rRate/100;
		Time = T;
		C = cashFlow;
		
		R =  Math.pow((float)(1 + Rate), (int)Time);
		PVA = (C/Rate)* (1 - (1/R));
		
		return PVA;
	}
	
	public double calculateFVA(double cashFlow, double rRate, double T){
		Rate = rRate/100;
		Time = T;
		C = cashFlow;
		
		R = Math.pow((float)(1 + Rate), (int)Time);
		FVA = C * ((R - 1)/Rate);
		
		return FVA;
	}
	
	public double calculateC(double presentValueAnnuity, double rRate, double T){
		Rate = rRate/100;
		Time = T;
		PVA = presentValueAnnuity;
		
		R =  Math.pow((float)(1 + Rate), (int)Time);
		C = (PVA * Rate) / (1 - (1/R));
		
		return C;
	}
	
	public void calculateAT(){  				 //Means calculate annuity time
		G = (1 - ((PVA * Rate)/C));
		H = Math.pow((float)G , -1);
		
		Time = (Math.log(H) / Math.log(1 + Rate));
	}
	
	/*
	void calculateIRR(){
		Internal Rate of returns;
	}
	*/
	public double calculateEAR(double aprReceived, double period){
		APR = aprReceived/100;
		m = period;
		
		EAR = (Math.pow((float)(1 + (APR/m)), (int)m) - 1);
		APR = APR * 100;
		EAR = EAR * 100;
		
		return EAR;
	}
	
	public double calculateAPR(double earReceived, double period){
		EAR = earReceived/100;
		m = period;
		
		F = (1/m);
		E = Math.pow((double)(EAR + 1), (double)F);
		APR = m * (E - 1);
		APR = APR * 100;
		EAR = EAR * 100;
		
		return APR;
	}
	
	public void showValuesB () {
		System.out.println("The Present value of Annuity is: " + PVA);
        System.out.println("The Future value of Annuity is: " + FVA);
		System.out.println("The CashFlow is: " + C);
        System.out.println("The Time/Period involved is: " + Time);
        System.out.println("The Rate used is: " + Rate);
	}
	
	public void showValuesC () {
		System.out.println("The APR is: " + APR);
        System.out.println("The EAR is: " + EAR);
        System.out.println("The number of compounding period is: " + m);
	}
	
}