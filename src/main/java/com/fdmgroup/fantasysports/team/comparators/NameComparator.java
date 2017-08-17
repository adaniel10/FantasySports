package com.fdmgroup.fantasysports.team.comparators;

import java.util.Comparator;

import com.fdmgroup.fantasysports.team.Team;

public class NameComparator implements Comparator<Team>{

	@Override
	public int compare(Team team1, Team team2) {
		return team1.getName().compareTo(team2.getName());
	}	

}

