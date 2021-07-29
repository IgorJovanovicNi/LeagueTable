package com.igorJovanovic;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private  String nameLeague;
    private ArrayList<T> teams;

    public League(String nameLeague) {
        this.nameLeague = nameLeague;
        this.teams=new ArrayList<>();
    }

    private boolean findTeam(T team){
        if (teams.contains(team)){
            System.out.println("Team is in the league!");
        return true;
        }
        return false;
    }

     public boolean addTeam(T team) {
         if (!findTeam(team)) {
             teams.add(team);
             return true;
         }
         return false;
     }

      public void printTeamRank(){

         Collections.sort(teams);
         for (T t:teams){
             System.out.println(t.getName()+t.toString());
         }
      }


    public String getNameLeague() {
        return nameLeague;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }
}
