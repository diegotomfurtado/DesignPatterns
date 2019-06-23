package StrategyPatterns.notUsing;

import StrategyPatterns.Budget;

public class ICMS {

	public double calculation_ICMS(Budget budget) {

		return budget.getValue() * 0.1;
	}
}
