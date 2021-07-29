package com.igorJovanovic;

import java.util.ArrayList;

public class Team<T extends  Player> implements Comparable<Team<T>>{
    private String name;
    private int machePlayed=0,wonMache=0,lostMache=0,tied=0;
    private ArrayList<T> playerList;

    public Team(String name) {
        this.name = name;
        this.playerList=new ArrayList();
    }

    private int findPlayer(T player){
        int index=playerList.indexOf(player);
        if (index<0){
            System.out.println(" Player not found!");
        return -1;
        }
        return index;
    }

    public boolean addPlayer(T newPlayer){
        if (findPlayer(newPlayer)>-1){
            System.out.println("Player is all ready in team!");
            return false;
        }
        playerList.add(newPlayer);
        System.out.println(" New player added "+newPlayer.getName());
        return true;
    }

    public void matchResult(Team teamThere,int our,int there){
        machePlayed++;
        if (our>there){
            wonMache++;
//            teamThere.setLostMache();
        }else if (there>our){
            lostMache++;
        }else {
            tied++;
        }
        if (teamThere!=null){
            teamThere.matchResult(null,there,our);
        }

    }
    private int points(){
        return (wonMache*3)+tied;
    }


    public void setMachePlayed() {
        this.machePlayed = machePlayed;
    }

    public void setWonMache() {
        this.wonMache += 1;
    }

    public void setLostMache() {
        this.lostMache +=1;
    }

    public void setTied() {
        this.tied +=1;
    }

    public String getName() {
        return name;
    }

    public int getMachePlayed() {
        return machePlayed;
    }

    public int getWonMache() {
        return wonMache;
    }

    public int getLostMache() {
        return lostMache;
    }

    public int getTied() {
        return tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if (this.points()>team.points()){
            return -1;
        }else if (this.points()<team.points()){
            return 1;
        }else {
            return 0;
        } }

    @Override
    public String toString() {
        return "Team{" +
                "machePlayed=" + machePlayed +
                ", wonMache=" + wonMache +
                ", lostMache=" + lostMache +
                ", tied=" + tied +
                '}';
    }
}
