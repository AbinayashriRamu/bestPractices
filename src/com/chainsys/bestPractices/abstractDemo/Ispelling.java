package com.chainsys.bestPractices.abstractDemo;

public interface Ispelling {
	void spellCheck(String word);

	void checkGrammer(String sentence);

	int wordCount(String sentence);
}

abstract class Language implements Ispelling {
	@Override
	public int wordCount(String sentence) {
		String[] sen = sentence.split(" ");
		return sen.length;
	}
}

class Englishlanguage implements Ispelling {
	public void spellCheck(String word) {
		System.out.println("English SpellChecker");
	}

	public void checkGrammer(String sentence) {
		System.out.println("English GrammerCheck");
	}

	public int wordCount(String sentence) {
		String[] sen = sentence.split(" ");
		return sen.length;
	}
}