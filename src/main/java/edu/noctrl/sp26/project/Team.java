package edu.noctrl.sp26.project;

public class Team {

    private String name;
    private int rating;

    /**
     * class constructor to initialize name and rating fields
     *
     * @param name: team name
     * @param salary: team rating
     */
    public Team(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    /**
     * getter method for the name field
     *
     * @return the value of name field
     */
    public String getName() {
        return name;
    }

    /**
     * setter method for the name field
     *
     * @param newName the value to be assigned to name field
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * getter method for the salary field
     *
     * @return the value of salary field
     */
    public int getRating() {
        return rating;
    }

    /**
     * setter method for the salary field
     *
     * @param newSalary the value to be assigned to salary field
     */
    public void setRating(int newRating) {
        rating = newRating;
    }

    @Override
    public String toString() {
        return "Team[name=" + name + ", rating=" + rating + "]";
    }
}
