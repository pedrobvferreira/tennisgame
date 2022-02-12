package com.tg.entities;

import com.tg.enumerations.PointsEnum;

/*
 * Author: pedro.ferreira
 * */
public class TennisPlayer {
	
	private int score = 0;
	private int match = 0;
	private String name = "";
	
	public TennisPlayer() {
	}
	
	public TennisPlayer(String name) {
        this.name = name;
    }
	
	public TennisPlayer(String name, int score) {
        this.name = name;
        this.score = score;
    }
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getMatch() {
		return match;
	}

	public void setMatch(int match) {
		this.match = match;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void makePoint() {
        this.score = this.score + 1;
    }
	
	public void winMatch() {
		 this.match = this.match + 1;
	}
	
	public String getScoreDescription(){
        return PointsEnum.getTennisPoints().get(score);
    }
	
	public String getMatchDescription() {
		return String.valueOf(match);
	}

}
