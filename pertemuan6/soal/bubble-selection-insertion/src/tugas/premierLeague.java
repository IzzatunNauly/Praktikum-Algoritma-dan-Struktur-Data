/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class premierLeague {
    public String team;
    public int play;
    public int goal;
    public int points;
    
    premierLeague(String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        points = pt;
    }
    void tampil() {
        System.out.println("Team : "+team);
        System.out.println("Play : "+play);
        System.out.println("goal : "+goal);
        System.out.println("points : "+points);

   
    }
}
