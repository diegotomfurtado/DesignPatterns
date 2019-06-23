package StrategyPatterns.notUsing;

import StrategyPatterns.Budget;

public class ISS {

	public double calculation_ISS(Budget budget) {

		return budget.getValue() * 0.06;
	}
}
