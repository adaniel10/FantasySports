package com.fdmgroup.fantasysports.league;

import com.fdmgroup.fantasysports.team.Team;

public interface League<T extends Team> {
	
	int calculateTeamPoints(T team);
	void printLeague();
	void addTeam(T team);
	void removeTeam(T team);
	void calculateLeaguePoints();

}
