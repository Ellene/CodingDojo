package com.codingdojo.tictactoe;

public class Board {

	public String game="___\n___\n___";
	
	public Board(String string) {
		game = string;
	}

	public Board() {

	}

	public boolean isOngoing() {		
		return !someWins() && hasMoreMoves();
	}

	private boolean someWins() {
		if (isSameAndFull(0, 5, 10)) {
			return true;
		}
		
		if (isSameAndFull(2, 5, 8)) {
			return true;
		}
		
		for (int i = 0; i<3 ; i++) {
			if (isSameAndFull(i, i+4, i+8)) {
				return true;
			}
			
		}
		
		return game.contains("OOO") || game.contains("XXX");
	}

	private boolean isSameAndFull(int a, int b, int c) {
		return game.charAt(a) != '_' && game.charAt(a) == game.charAt(b) && game.charAt(b) == game.charAt(c);
	}
	
	private boolean hasMoreMoves() {
		return game.contains("_");
	}
	
	
}