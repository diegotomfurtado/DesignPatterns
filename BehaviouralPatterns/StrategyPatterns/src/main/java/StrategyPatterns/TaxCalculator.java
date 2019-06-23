package StrategyPatterns;

import StrategyPatterns.notUsing.ICMS;
import StrategyPatterns.notUsing.ISS;
import StrategyPatterns.using.Tax;

public class TaxCalculator {

	/*
	 * This first method/strategy PerformCalculation could grow if more type of TAX
	 * shown. Because of that, we can't predict the numbers of if/else/for
	 * (conditions) could be implemented.
	 * 
	 */

	public double performCalculation(Budget budget, String tax) {

		if (tax.equals("ICMS")) {
			return budget.getValue() * 0.1;

		} else if (tax.equals("ISS")) {
			return budget.getValue() * 0.06;

		}
		return 0;
	}

	/*
	 * The second strategy on PerformCalculation was split each condition in one
	 * specific method. However, we still have multiples rules into the same class,
	 * and with the same problem on our first strategy.
	 * 
	 */

	public double performCalculation_ICMS(Budget budget) {

		return new ICMS().calculation_ICMS(budget);
	}

	public double performCalculation_ISS(Budget budget) {

		return new ISS().calculation_ISS(budget);
	}

	/*
	 * How to deal with multiples conditionals (if/else/for) or multiples methods
	 * into the same class (in special when there is anything (business rules) in common)? 
	 * 
	 * Strategy Patterns
	 * 
	 * According to GoF "Defines a set of encapsulated algorithms that can be
	 * swapped to carry out a specific behaviour."
	 * 
	 * Technically speaking:
	 * 
	 * It's mean that, use to manage algorithms, relationships and
	 * responsibilities between objects.
	 * 
	 * 1. Both of those TAXes have one thing in common: receiving budget and performing the
	 * budget; 
	 * 
	 * 2. When multiple class contains something in common, we could define
	 * a Contract: Interface;
	 * 
	 * 3. Then, we need transform TAX in a Interface;
	 * 
	 */
	
	public double performCalculation_strategyPatterns(Budget budget, Tax anyTax){

		return anyTax.calculation(budget);
	}
}
