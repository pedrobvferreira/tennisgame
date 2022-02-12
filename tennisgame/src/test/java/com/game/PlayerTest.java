package com.game;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import com.tg.entities.TennisPlayer;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerTest {
	@Test
	public void pointsCanBeAddedToEachPlayer() {
		TennisPlayer a = new TennisPlayer("A");
		TennisPlayer b = new TennisPlayer("B");
		IntStream.rangeClosed(1, 3).forEach((Integer) -> {
			a.makePoint();
		});
		IntStream.rangeClosed(1, 4).forEach((Integer) -> {
			b.makePoint();
		});
		assertThat(a, hasProperty("score", is(3)));
		assertThat(b, hasProperty("score", is(4)));
	}
}
