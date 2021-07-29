package com.igorJovanovic;

public class Main {

    public static void main(String[] args) {
	BasketBall a=new BasketBall("Radja");
	Soccer soccer=new Soccer("Prosinecki");
	FootBall footBall=new FootBall("Era");

	Team<Soccer> soccerTeam=new Team<>("Radnicki");
	Team<Soccer> basketBallTeam=new Team<>("DeliskiVis");
	Team<Soccer> nov=new Team<>("Blesavi");

	soccerTeam.addPlayer(soccer);
	soccerTeam.addPlayer(soccer);
	League<Team <Soccer>> lopta=new League<>("Prva liga");
	lopta.addTeam(soccerTeam);
	lopta.addTeam(basketBallTeam);
	lopta.addTeam(nov);

	soccerTeam.matchResult(basketBallTeam,6,1);
	soccerTeam.matchResult(nov,5,3);
	nov.matchResult(basketBallTeam,2,1);
	int count=1;
	for (Team t:lopta.getTeams()){
		System.out.println(count++);
	}

     lopta.printTeamRank();








    }
}
