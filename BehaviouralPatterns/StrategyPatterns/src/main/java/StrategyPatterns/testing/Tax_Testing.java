package StrategyPatterns.testing;

import StrategyPatterns.Budget;
import StrategyPatterns.TaxCalculator;
import StrategyPatterns.notUsing.ICMS;
import StrategyPatterns.notUsing.ISS;
import StrategyPatterns.using.ICMS_AfterStrategy;
import StrategyPatterns.using.ISS_AfterStrategy;
import StrategyPatterns.using.Tax;

public class Tax_Testing {
	
	public static void main(String[] args) {
		
		Budget budget = new Budget(500.0);
		TaxCalculator calculation = new TaxCalculator();
		
		/*
		 * Strategy 01
		 * 
		 * */
		
		String tax_icms = "ICMS";
		String tax_iss = "ISS";
		
		System.out.println
		(
				"ISS: " + 
				calculation.performCalculation(budget, tax_iss)
		);
		
		System.out.println
		(
				"ICMS: " + 
				calculation.performCalculation(budget, tax_icms)
		);
		
		
		/*
		 * Strategy 02
		 * 
		 * */
		
		System.out.println
		(
				"ISS: " + 
				calculation.performCalculation_ISS(budget)
		);
		
		System.out.println
		(
				"ICMS: " +
				calculation.performCalculation_ICMS(budget)
		);
		
		
		/*
		 * Strategy 03 - Design Patterns (Strategy)
		 * 
		 * */
		
		
		Tax iss_using = new ISS_AfterStrategy();
		Tax icms_using = new ICMS_AfterStrategy();
		
		System.out.println
		(
				"ISS (with Strategy Patterns): " + 
				calculation.performCalculation_strategyPatterns(budget, iss_using)
		);
		
		System.out.println
		(
				"ICMS (with Strategy Patterns): " +
				calculation.performCalculation_strategyPatterns(budget, icms_using) 
		);
		
	
	}
}
