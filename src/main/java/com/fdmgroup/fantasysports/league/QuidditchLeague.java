package com.fdmgroup.fantasysports.league;

import java.util.TreeMap;
import org.apache.log4j.Logger;
import com.fdmgroup.fantasysports.team.QuidditchTeam;

public class QuidditchLeague implements League<QuidditchTeam>{
	
	private TreeMap<QuidditchTeam, Integer> quidditchLeagueTeams;
	private static final Logger LOG = Logger.getLogger(QuidditchLeague.class.getName());
	
	public QuidditchLeague() {
		this.quidditchLeagueTeams = new TreeMap<>();
	}

	@Override
	public int calculateTeamPoints(QuidditchTeam team) {
		return team.getWins() * 3 + team.getDraws();
	}

	@Override
	public void printLeague() {
		for(QuidditchTeam team : quidditchLeagueTeams.keySet()) {
			LOG.debug(String.format("Team : %s, Points : %d", 
					team.getName(), quidditchLeagueTeams.get(team)));
		}
	}

	@Override
	public void addTeam(QuidditchTeam team) {
		quidditchLeagueTeams.put(team, 0);
		LOG.debug(team + " added to league");
	}

	@Override
	public void removeTeam(QuidditchTeam team) {
		quidditchLeagueTeams.remove(team);
		LOG.debug(team + " removed from league");
	}

	@Override
	public void calculateLeaguePoints() {
		for(QuidditchTeam team : quidditchLeagueTeams.keySet()) {
			int teamPoints = calculateTeamPoints(team);
			quidditchLeagueTeams.put(team, teamPoints);
			LOG.debug(String.format("Team %s scores %d points", 
					team.getName(), teamPoints));
		}
	}

}
