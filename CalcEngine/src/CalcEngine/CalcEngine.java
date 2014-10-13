package CalcEngine;

import java.util.Scanner;

public class CalcEngine{
	static Scanner input = new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.print("Enter investment amount: ");
	        double investmentAmount = input.nextDouble();
	        System.out.print("Enter years of investment: ");
	        double years = input.nextDouble();
	        System.out.print("Enter annual interest rate amount: ");
	        double yearlyInterestRate = input.nextDouble();
	        System.out.println("Future Value: " + futureInvestmentValue(
	                    investmentAmount, yearlyInterestRate, years));
	    }
	    public static double futureInvestmentValue(double investmentAmount,
	            double yearlyInterestRate, double years) {
	        double YearlyInterest = (investmentAmount * (Math.pow(1 +
	        		((yearlyInterestRate / 1200)), years * 12)));
	        return (YearlyInterest);
	    }
}