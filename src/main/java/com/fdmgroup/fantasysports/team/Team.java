package com.fdmgroup.fantasysports.team;

public class Team implements Comparable<Team>{
	
	private String name;
	private int numOfPlayers;
	private int wins;
	private int losses;
	private int draws;
	private int gamesPlayed;
	
	public Team(String name, int numOfPlayers) {
		super();
		this.name = name;
		this.numOfPlayers = numOfPlayers;
	}
	
	public void addWin() {
		wins++;
		gamesPlayed++;
	}
	
	public void addLosses() {
		losses++;
		gamesPlayed++;
	}
	
	public void addDraws() {
		draws++;
		gamesPlayed++;
	}

	@Override
	public int compareTo(Team team2) {
		return this.wins - team2.wins;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", numOfPlayers=" + numOfPlayers + ", wins=" + wins + ", losses=" + losses
				+ ", draws=" + draws + ", gamesPlayed=" + gamesPlayed + "]";
	}

	public String getName() {
		return name;
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getDraws() {
		return draws;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
	
	

}
