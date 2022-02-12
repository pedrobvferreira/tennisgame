package com.app;

import java.util.ArrayList;
import java.util.List;

import com.tg.entities.TennisGame;
import com.tg.entities.TennisPlayer;
import com.tg.enumerations.PlayerEnum;
import com.tg.helper.FileConvertHelper;

/*
 * Author: pedro.ferreira
 * */
public class PlayTennisGame {
	
	public static void main(String args[]) throws Exception {
		TennisPlayer playerA = new TennisPlayer(PlayerEnum.PLAYER_A.getVal());
	    TennisPlayer playerB = new TennisPlayer(PlayerEnum.PLAYER_B.getVal());
	    TennisGame game = new TennisGame(playerA, playerB);
	    List<String> lstResult = new ArrayList<>();
	    String result = game.getMatch();
	    lstResult.add(result);
	    System.out.println(result);
	    
	    List<String> lstData = FileConvertHelper.readFileInList("\\Desktop\\tennisScore\\input.txt");
	    for (String data: lstData) {
	    	for (int i = 0; i < data.length(); i++) {
	    		char ch = data.charAt(i);
				if (ch == 'A') {
					playerA.makePoint();
					result = game.getMatch() + " " + game.getScore();
					lstResult.add(result);
					System.out.println(result);
				} else if(ch == 'B') {
					playerB.makePoint();
					result = game.getMatch() + " " + game.getScore();
					lstResult.add(result);
					System.out.println(result);
				}
	    	}
	    }
	    
	    FileConvertHelper.writeFileList("\\Desktop\\tennisScore\\tennisgame.txt", lstResult);
	}
}
