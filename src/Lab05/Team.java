package Lab05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Name: Aditya Verma
 * Date: Feb 22, 2022
 * Description: Lab 05 "Midterm Review with Iterators" Submission for CS321.
 */
public class Team {

    //private instance variables for the Team Object
    private String name;
    private ArrayList<Player> team;
    private int maxPlayers;

    //Default Constructor, no args
    public Team() {
        this.name = "";
        this.team = new ArrayList<>();
        this.maxPlayers = 0;
    }

    /**
     * Constructor Team initialising the instance variables
     *
     * @param name ; a String value ; the Team's Name
     */
    public Team(String name) {
        this.name = name;
        this.team = new ArrayList<>();
        this.maxPlayers = 0;
    }

    /**
     * Getter method for the team name
     *
     * @return a String value ; name of the team
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for the name instance variable
     *
     * @param name; name of the team
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for the team
     *
     * @return an ArrayList ; an ArrayList of Player Objects
     */
    public ArrayList<Player> getTeam() {
        return team;
    }

    /**
     * Setter method for the team instance variable
     *
     * @param team; an ArrayList of Player Objects
     */
    public void setTeam(ArrayList<Player> team) {
        this.team = team;
    }

    /**
     * Getter method for the maxPlayers variable
     *
     * @return an integer; the max number of players allowed onto the team
     */
    public int getMaxPlayers() {
        return maxPlayers;
    }

    /**
     * Setter method for the maxPlayers instance variable
     *
     * @param maxPlayers; the max number of players allowed onto the team
     */
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    /**
     * A public method to expose the iterator for the roster of players.
     */
    public Iterator iterator() {
        return new InnerIterator();
    }

    /**
     * An inner iterator class, implementing te iterator behaviour
     */
    private class InnerIterator implements Iterator {

        //private instance variables
        private int index;

        //Default Constructor, no args
        public InnerIterator() {
            this.index = 0;
        }

        //Overriding the iterator functions specific to iterating the teams

        /**
         * Checks if there is a next player in the roster.
         *
         * @return a boolean value ; true if there is a next player, false if there is no next player
         */
        @Override
        public boolean hasNext() throws NoSuchElementException {
            // check if a current element is the last in the arraylist
            return (index <= team.size() - 1);
        }

        @Override
        /**
         * Returns the next player in the roster
         *
         * @return a boolean value ; true if there is a next player, false if there is no next player
         */
        public Player next() {
            Player player = team.get(index);
            index++;
            return player;
        }

        /**
         * Removes a player, but for this task, this operation is considered invalid.
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException(
                    "remove() not supported by Team");
        }
    }

    /**
     * Checks if a Player is in the roster.
     *
     * @return a boolean value ; true if player is in the roster, false if player not found in roster
     */
    public boolean contains(Player player) {
        //declaring iterator object to iterate through the team
        Iterator iterator = team.iterator();


        int i = 0;
        while (i < team.size()) {
            Player p = (Player) iterator.next();
            if (p.equals(player)) {
                return true; //when player found
            }
            i++;
        }
        return false; //when player not found in roster
    }

    /**
     * Adds a player in the roster
     * Throws an exception if a duplicate player is inserted or
     * if the roster is full and there is no room for adding another player.
     *
     * @param player ; a Player object
     */
    public void insert(Player player) throws Exception {
        if ((!contains(player)) && (team.size() < maxPlayers)) {
            team.add(player);
        } else {
            throw new Exception("Either trying to add duplicate player or the team is already full!");
        }
    }
}

