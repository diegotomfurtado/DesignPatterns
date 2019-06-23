package StrategyPatterns.using;

import StrategyPatterns.Budget;

public class ISS_AfterStrategy implements Tax{

	@Override
	public double calculation(Budget budget) {

		return budget.getValue() * 0.06;
	}
}
