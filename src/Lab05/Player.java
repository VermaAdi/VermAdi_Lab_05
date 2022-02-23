package Lab05;

/**
 * Name: Aditya Verma
 * Date: Feb 22, 2022
 * Description: Lab 05 "Midterm Review with Iterators" Submission for CS321.
 */
public class Player {

    //private instance variables for the Player Object
    private String name;
    private int position;

    //Default Constructor, no args
    public Player() {
        this.name = "";
        this.position = 0;
    }

    /**
     * Getter method for the name
     *
     * @return a String value ; name of the Player
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for the position
     *
     * @return an integer value ; position of the Player
     */
    public int getPosition() {
        return position;
    }

    /**
     * Setter method for the name instance variable
     *
     * @param name; name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method for the position instance variable
     *
     * @param position; position of the player
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Checks if two Player objects are equal.
     *
     * @param p A Player object.
     * @return true; a boolean value; if the two objects are equal.
     * @return false; a boolean value; if the two objects are not equal.
     */
    public boolean equals(Player p) {
        if (!(this.name.equals(p.name)) || (this.position != p.position)) {
            return false;
        }
        return true;
    }

    /**
     * Prints the players in the team in order of their entry.
     */
    @Override
    public String toString() {
        return "name:'" + name + '\'' +
                ", position:" + position;
    }
}
