package com.chainsys.bestPractices.abstractDemo;

class TestScoreBoard {
	public static void main(String[] args) {
		// ScoreBoard firstScore=new ScoreBoard(); // cannot create invoke private
		// constructor
		ScoreBoard firstScore = ScoreBoard.createObject();
		System.out.println(firstScore.TargetScore);
		firstScore.TargetScore = 180;
		System.out.println(firstScore.TargetScore);
	}
}