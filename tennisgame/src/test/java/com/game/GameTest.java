package com.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tg.entities.TennisGame;
import com.tg.entities.TennisPlayer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.stream.IntStream;

public class GameTest {
	TennisPlayer playerA;
    TennisPlayer playerB;
    TennisGame game;

    @BeforeEach
    public void beforeGameTest() {
        playerA = new TennisPlayer("A");
        playerB = new TennisPlayer("B");
        game = new TennisGame(playerA, playerB);
    }

    @Test
    public void descriptionForScore0() {
        TennisGame game = new TennisGame(playerA, playerB);
        assertThat(game, hasProperty("score", is("0-0")));
    }

    @Test
    public void descriptionForScore1() {
        playerB.makePoint();
        assertThat(game, hasProperty("score", is("0-15")));
    }

    @Test
    public void descriptionForScore2() {
        playerA.makePoint();
        playerA.makePoint();
        playerB.makePoint();
        assertThat(game, hasProperty("score", is("30-15")));
    }

    @Test
    public void descriptionForScore3() {
		IntStream.rangeClosed(1, 3).forEach((Integer) -> {
			playerA.makePoint();
		});
        assertThat(game, hasProperty("score", is("40-0")));
    }

    @Test
    public void advantageWhenThreePointsScoredByAndPlayerHasOnePointThanHisOpponent() {
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            playerA.makePoint();
        });
        IntStream.rangeClosed(1, 4).forEach((Integer) -> {
            playerB.makePoint();
        });
        assertThat(game, hasProperty("score", is("40-B")));
    }

    @Test
    public void deuceWhenAtLeastThreePointsHaveBeenScoredByEachPlayerAndTheScoresAreEqual() {
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            playerA.makePoint();
        });
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            playerB.makePoint();
        });
        assertThat(game, hasProperty("score", is("40-40")));
    }

    @Test
    public void gameWonByTheFirstPlayerToHaveWonAtLeastFourPoints() {
        IntStream.rangeClosed(1, 4).forEach((Integer) -> {
            playerA.makePoint();
        });
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            playerB.makePoint();
        });
        assertThat(game, hasProperty("score", is(not("A Won"))));
        assertThat(game, hasProperty("score", is(not("B Won"))));
        playerA.makePoint();
        assertThat(game, hasProperty("score", is("A Won")));
    }
}
