package lv.alina.module;

import java.util.ArrayList;

public class League {
	private String nameLeague;
	private ArrayList<Team> nameOfTeams;
	
	
	public League(String leagueName){
		this.nameLeague=leagueName;
		this.nameOfTeams=new ArrayList<>();
	
	}
	public String getName() {
		return nameLeague;
	}
	public void setName(String name) {
		this.nameLeague = name;
	}
	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}
	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}
	public void recordWinAndLoss(Team winner, Team loser){
		winner.setWins(1);
		loser.setLosses(1);
	}
	
	
	@Override
	public String toString() {
		return "League [nameLeague=" + nameLeague + ", nameOfTeams=" + nameOfTeams + "]";
	}
 
	
	
}
