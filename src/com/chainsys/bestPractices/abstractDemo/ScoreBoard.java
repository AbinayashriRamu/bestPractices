package com.chainsys.bestPractices.abstractDemo;

public class ScoreBoard {
	public int TargetScore = 215;

	private ScoreBoard() {
		System.out.println("Objected created for Score Board");
	}

	// create object for this class is called factory method
	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
}
