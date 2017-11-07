package com.libertymutual.goforcode.hello_world_again.models;

public class SurveyResults {

	// Instance variables - accessible by the whole class
	// Private variables, no not available outside of this class
	// Encapsulation - ensure variables are private and
	// can only be changed by methods within classes

	private int russetCount;
	private int goldenCount;
	private int sweetCount;

	// methods to register the potato votes

	public void registerRussetVote() {
		russetCount += 1;
	}

	public void registerGoldenVote() {
		goldenCount += 1;
	}

	public void registerSweetVote() {
		sweetCount += 1;
	}

	// methods to return the potato votes

	public int returnRussetVotes() {
		return russetCount;
	}

	public int returnGoldenVotes() {
		return goldenCount;
	}

	public int returnSweetVotes() {
		return sweetCount;
	}

	// methods to return the potato votes to zero

	public void eraseAllVotes() {
		russetCount = 0;
		goldenCount = 0;
		sweetCount = 0;
	}
}
