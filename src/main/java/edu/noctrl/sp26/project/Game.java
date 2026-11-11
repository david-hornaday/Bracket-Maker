package edu.noctrl.sp26.project;

public class Game {

    private Team teamA;
    private Team teamB;

     
    public Game( Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    /**
     * getter method for the name field
     *
     * @return the value of name field
     */
    public Team getTeamA() {
        return teamA;
    }

    /**
     * setter method for the name field
     *
     * @param newName the value to be assigned to name field
     */
    public void setTeamA (Team newTeam) {
        teamA = newTeam;
    }

    /**
     * getter method for the name field
     *
     * @return the value of name field
     */
    public Team getTeamB() {
        return teamB;
    }

    /**
     * setter method for the name field
     *
     * @param newName the value to be assigned to name field
     */
    public void setTeamB (Team newTeam) {
        teamB = newTeam;
    }

    @Override
    public String toString() {
        String nameA = teamA.getName();
        String nameB = teamB.getName();
        String result = "Game[ " + nameA + " vs " + nameB + " ]";
        return result;
    }
}