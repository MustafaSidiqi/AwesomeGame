/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awesomegame;

import java.util.ArrayList;

/**
 *
 * @author Kunoh
 */
public class Team {

    String name;
    ArrayList<Player> players = new ArrayList();
    boolean gotManager = false;
    int goalDifference = 0;
    int goalFor = 0;
    int goalAgainst = 0;
    int points = 0;

    public Team() {
        for (int i = 0; i < 15; i++) {
            Player player = new Player();
            players.add(player);
        }
    }
}
