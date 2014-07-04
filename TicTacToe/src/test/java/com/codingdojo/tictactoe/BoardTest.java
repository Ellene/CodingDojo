package com.codingdojo.tictactoe;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BoardTest {

	@Test
	public void when_board_is_empty_then_game_is_ongoing() {
		// Given
		Board board = new Board();
		
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isTrue();
	}
	
	@Test
	public void when_board_is_full_then_the_game_is_stopped() {
		// Given
		Board board = new Board(
				  "OXO\n"
				+ "XOX\n"
				+ "OXO");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
	@Test
	public void when_O_wins_then_the_game_is_stopped() {
		// Given
		Board board = new Board(
				  "OOO\n"
				+ "_XX\n"
				+ "___");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
	@Test
	public void when_O_wins_with_diagonal_then_the_game_is_stopped() {
		// Given
		Board board = new Board(
				  "OXX\n"
				+ "_OX\n"
				+ "__O");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
	@Test
	public void when_X_wins_with_diagonal2_then_the_game_is_stopped() {
		// Given
		Board board = new Board(
				  "OOX\n"
				+ "_XX\n"
				+ "X_O");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
	@Test
	public void when_O_wins_with_column1_then_the_game_is_stopped() {
		// Given
		Board board = new Board(
				  "OXX\n"
				+ "OXX\n"
				+ "O_O");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
	@Test
	public void when_X_wins_then_the_game_is_stopped() {
		// Given
		Board board = new Board(
				  "XXX\n"
				+ "_OO\n"
				+ "___");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
	@Test
	public void when_board_is_full_then_the_game_is_stopped_2() {
		// Given
		Board board = new Board(
				  "XOX\n"
				+ "OXX\n"
				+ "OXO");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
	@Test
	public void when_board_is_full_then_the_game_is_stopped_3() {
		// Given
		Board board = new Board(
				  "XOX\n"
				+ "OXO\n"
				+ "OXO");
		// When
		boolean ongoing = board.isOngoing();
		
		// Then
		assertThat(ongoing).isFalse();
	}
	
}
