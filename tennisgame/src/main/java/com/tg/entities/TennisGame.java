package com.tg.entities;

/*
 * Author: pedro.ferreira
 * */
public class TennisGame {
	private TennisPlayer player1;
    private TennisPlayer player2;

    public TennisGame(TennisPlayer player1, TennisPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {	
        if (player1.getScore() >= 3 && player2.getScore() >= 3) {
            if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
				String winPlayer = getLeadPlayer().getName() + " Won";
				
				getLeadPlayer().winMatch();
				player1.setScore(0);
				player2.setScore(0);
				
                return winPlayer;
            } else if (player1.getScore() == player2.getScore()) {
            	String scoreDescr = player1.getScoreDescription() + "-" + player2.getScoreDescription();
                return scoreDescr;
            } else {
                return "40" + "-" + getLeadPlayer().getName();
            }
        } else {
			if (player1.getScore() > 3) {
				String winPlayer = getLeadPlayer().getName() + " Won";
				
				getLeadPlayer().winMatch();
				player1.setScore(0);
				player2.setScore(0);
				
				return winPlayer;
			} else if(player2.getScore() > 3) {
				String winPlayer = getLeadPlayer().getName() + " Won";
				
				getLeadPlayer().winMatch();
				player1.setScore(0);
				player2.setScore(0);
				
				return winPlayer;
			}
			else {
				String scoreDescr = player1.getScoreDescription() + "-" + player2.getScoreDescription();
				return scoreDescr;
			}
        }
    }
    
    public String getMatch() {
    	 return player1.getMatchDescription() + "-" + player2.getMatchDescription();
    }

    public TennisPlayer getLeadPlayer() {
        return (player1.getScore() > player2.getScore()) ? player1 : player2;
    }
}
