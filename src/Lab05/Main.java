package Lab05;

import java.util.Iterator;

/**
 * Name: Aditya Verma
 * Date: Feb 22, 2022
 * Description: Lab 05 "Midterm Review with Iterators" Submission for CS321.
 */
public class Main {

    /**
     * Tests the functioning of the Player and Team Classes using Iterators .
     *
     * @param args A string array containing the command line arguments
     */
    public static void main(String[] args) throws Exception {

        //creating both teams
        Team team = new Team("Tigers");
        Team team1 = new Team();

        //setting macplayers for the teams
        team.setMaxPlayers(17);
        team1.setMaxPlayers(17);

        //Testing Instruction 2 (Exception Handling for duplicate player insertions)
        Player playerA = new Player();
        Player playerB = new Player();

        //inserting duplicate players in team roster
        try {
            team.insert(playerA);
            team.insert(playerB);
        } catch (Exception e) {
            System.out.println("\n--------------------------------------------------------------------");
            System.out.println("DUPLICATE ENTRY EXCEPTION: " + e.getMessage());
            e.printStackTrace();
        }

        //creating all the players to be added to the teams
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player player7 = new Player();
        Player player8 = new Player();
        Player player9 = new Player();
        Player player10 = new Player();
        Player player11 = new Player();
        Player player12 = new Player();
        Player player13 = new Player();
        Player player14 = new Player();
        Player player15 = new Player();
        Player player16 = new Player();
        Player player17 = new Player();

        //setting names of the players
        player1.setName("Bryan");
        player2.setName("Adam");
        player3.setName("Cindy");
        player4.setName("Frank");
        player5.setName("Katherine");
        player6.setName("Bella");
        player7.setName("Elizabeth");
        player8.setName("Dahria");
        player9.setName("McKayla");
        player10.setName("Indira");
        player11.setName("Gunther");
        player12.setName("Heidi");
        player13.setName("Trixie");
        player14.setName("Cardi");
        player15.setName("Praveen");
        player16.setName("Russo");
        player17.setName("Pallavi");

        //setting positions of the players.
        player1.setPosition(12);
        player2.setPosition(9);
        player3.setPosition(44);
        player4.setPosition(55);
        player5.setPosition(53);
        player6.setPosition(3);
        player7.setPosition(4);
        player8.setPosition(5);
        player9.setPosition(22);
        player10.setPosition(76);
        player11.setPosition(17);
        player12.setPosition(19);
        player13.setPosition(21);
        player14.setPosition(30);
        player15.setPosition(0);
        player16.setPosition(2);
        player17.setPosition(11);

        //Testing Instruction 3 and 4, inserting more players in team roster than max players
        try {
            team.insert(player1);
            team.insert(player2);
            team.insert(player3);
            team.insert(player4);
            team.insert(player5);
            team.insert(player6);
            team.insert(player7);
            team.insert(player8);
            team.insert(player9);
            team.insert(player10);
            team.insert(player11);
            team.insert(player12);
            team.insert(player13);
            team.insert(player14);
            team.insert(player15);
            team.insert(player16);
            team.insert(player17);

        } catch (Exception e) {
            System.out.println("\n--------------------------------------------------------------------");
            System.out.println("TEAM FULL EXCEPTION: " + e.getMessage());
            e.printStackTrace();
        }

        //inserting players in team1 roster
        try {
            team1.insert(player1);
            team1.insert(player2);
            team1.insert(player3);
            team1.insert(player4);
            team1.insert(player5);
            team1.insert(player6);
            team1.insert(player7);
            team1.insert(player8);
            team1.insert(player9);
            team1.insert(player10);
            team1.insert(player11);
            team1.insert(player12);
            team1.insert(player13);
            team1.insert(player14);
            team1.insert(player15);
            team1.insert(player16);
            team1.insert(player17);

        } catch (Exception e) {
            System.out.println("\n--------------------------------------------------------------------");
            System.out.println("EXCEPTION: " + e.getMessage());
            e.printStackTrace();
        }

        //Testing Instruction 5, Checking the functioning of contains()
        Player playerX = new Player();
        playerX.setName("NoName");
        playerX.setPosition(100);
        System.out.println("\n--------------------------------------------------------------------");

        System.out.println("Team contains player2: " + team.contains(player2));
        System.out.println("Team1 contains playerX: " + team1.contains(playerX));

        //declaring two different iterator functions for the two team rosters.
        Iterator iterator = team.iterator();
        Iterator iterator1 = team1.iterator();

        //Testing Instruction 6, printing out all the players in both the team rosters
        System.out.println("\n--------------------------------------------------------------------");
        try {
            System.out.println("Team:");
            //printing out all the players in the team roster
            int count = 1;
            while (iterator.hasNext()) {
                System.out.print(count + ") ");
                System.out.println(iterator.next());
                count++;
            }
        } catch (Exception NoSuchElementException) {
            System.out.println("hasNext returned false, there are no players remaining in the roster");
        }

        System.out.println("\n--------------------------------------------------------------------");
        try {
            System.out.println("Team1: \n");
            //printing out all the players in the team roster
            int count = 1;
            while (iterator1.hasNext()) {
                System.out.print(count + ") ");
                System.out.println(iterator1.next());
                count++;
            }
        } catch (Exception NoSuchElementException) {
            System.out.println("hasNext returned false, there are no players remaining in the roster");
        }

        System.out.println("\n--------------------------------------------------------------------");

    }
}
