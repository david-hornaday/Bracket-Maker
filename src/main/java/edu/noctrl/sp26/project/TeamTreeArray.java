package edu.noctrl.sp26.project;


public class TeamTreeArray {
    private Team[] array;
    //private int length;


    public TeamTreeArray(int teams) {
        int total = 0;
        while (teams > 0) {
            total = total + teams;
            teams = teams/2;
        }
        

        this.array = new Team[total];

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = new Team("(_____)", 0);
        }
        //this.length = total;

    }

    public Team[] getArray() {
        return this.array;
    }

    public Team getTeam(int index) {
        return this.array[index];
    }

    public void setArray(Team[] array) {
        this.array = array;
    }




    public void add(Team team) {

    }

    public void add(Team team, int index){
        this.array[index] = team;

    }

    public Team remove() {
        Team team = null;
        return team;
    }

    public int length() {
        return this.array.length;
    }
    

    // prints bracket with matchups
    public String printArray() {

        String result = null;
        result = this.array[0].getName() + "\n" 
                + this.array[1].getName() + " vs " + this.array[2].getName() + "\n"; 
        if (this.array.length >= 4) {
            //System.out.println("yes");
            result = result + this.array[3].getName() + " vs " + this.array[4].getName() + "  |  " + this.array[5].getName() + " vs " + this.array[6].getName() + "\n";
        }
        if (this.array.length >= 8) {
            result = result + this.array[7].getName() + " vs " + this.array[8].getName() + "  |  " + this.array[9].getName() + " vs " + this.array[10].getName() + "  |  " +
                     this.array[11].getName() + " vs " + this.array[12].getName() + "  |  " + this.array[13].getName() + " vs " + this.array[14].getName() + "\n";
        }
        if (this.array.length >= 15) {
            result = result + this.array[15].getName() + " vs " + this.array[16].getName() + "  |  " + this.array[17].getName() + " vs " + this.array[18].getName() + "  |  " +
                     this.array[19].getName() + " vs " + this.array[20].getName() + "  |  " + this.array[21].getName() + " vs " + this.array[22].getName() + "  |  " + 
                     this.array[23].getName() + " vs " + this.array[24].getName() + "  |  " + this.array[25].getName() + " vs " + this.array[26].getName() + "  |  " +
                     this.array[27].getName() + " vs " + this.array[28].getName() + "  |  " + this.array[29].getName() + " vs " + this.array[30].getName() +"\n";
        }

        return result;
    }

    





}