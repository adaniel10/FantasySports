package com.fdmgroup.fantasysports.team;

import java.util.Set;
import java.util.TreeSet;

import com.fdmgroup.fantasysports.league.QuidditchLeague;
import com.fdmgroup.fantasysports.team.comparators.NameComparator;

public class TeamDEMO {

	public static void main(String[] args) {
		
		Team griffindor = new Team("Griffindor", 7);
		griffindor.addWin();
		griffindor.addWin();
		
		Team broomFleet = new Team("Broom Fleet", 7);
		broomFleet.addLosses();
		broomFleet.addLosses();
		
		Team quafflePunchers = new Team("Quaffle Punchers", 7);
		quafflePunchers.addWin();
		quafflePunchers.addLosses();
		
		Set<Team> teamSet = new TreeSet<Team>(new NameComparator());
		teamSet.add(quafflePunchers);
		teamSet.add(broomFleet);
		teamSet.add(griffindor);
		
		QuidditchTeam qt1 = new QuidditchTeam("Fox");
		QuidditchLeague ql = new QuidditchLeague();
		ql.addTeam(qt1);
		ql.removeTeam(qt1);
		
		
		//System.out.println(teamSet.toString());
		
		for(Team team : teamSet) {
			System.out.println(team.toString());
		}
	}

}
