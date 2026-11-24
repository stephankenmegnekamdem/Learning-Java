import java.util.*;
public class ArrayExercises{
	static void printGrid(char[][] tile) {
		for (int i = 0; i < tile.length; i++) {
			for (int j = 0; j < tile[i].length; j++) {
				System.out.print(tile[i][j]);
			}
			System.out.println();
		}
	}
	static void main(String[] args) {

		// Way 1: declare, create, and let Java set the default values
		int[] a = new int[5];

		// Way 2: declare and initialize with an array literal
		int[] b = {0, 0, 0, 0, 0};

		// Way 3 (your loop version): declare and create, then fill each slot
		int[] c = new int[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = 0;
		}


		// Accessing values with for each loop but you cant modify the values
		for (int value : c) {
			System.out.println(value);
		}

		// Initialising a char array;
		char[] d = {'X', '0', '.'};
		for (int i = 0; i < d.length; i++) {
			System.out.println(i + ": " + d[i]);
		}
		//toChar, toString, toInteger, toDouble, toCharArray(), Array.toStringArray(d), Array.deepToString(d)


		//Swapping elements of an array
		String[] colours = {"red", "green", "blue"};
		String temp = colours[0];
		colours[0] = colours[2];
		colours[2] = temp;

		//Adding 10 to all elements of an int array
		int[] scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i] += 10;
		}

		//making a 3x3 grid
		char[][] grid = new char[3][3];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = '.';
			}
		}
		grid[1][1] = 'P';
		System.out.println(Arrays.deepToString(grid));
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}

		//making a grid through which the player moves;
		char[][] tile = new char[3][3];
		for (int i = 0; i < tile.length; i++) {
			for (int j = 0; j < tile[i].length; j++) {
				tile[i][j] = '.';
			}
		}

		int row = 1;
		int col = 1;
		tile[row][col] = 'P';
		printGrid(tile);

		Scanner sc = new Scanner(System.in);

		while (true) {
			char move = sc.next().charAt(0);

			if (move == 'q') {
				break;
			}

			// Work out where the player wants to go
			int newRow = row;
			int newCol = col;

			switch (move) {
				case 'w': newRow = row - 1; break;
				case 's': newRow = row + 1; break;
				case 'a': newCol = col - 1; break;
				case 'd': newCol = col + 1; break;
				default:
					System.out.println("Unknown key, use w, a, s, d, or q");
					continue;
			}

			// Check the destination before moving
			if (newRow < 0 || newRow > 2 || newCol < 0 || newCol > 2) {
				System.out.println("Invalid move out of grid");
				continue;
			}

			// Apply the move: clear the old cell, place P in the new one
			tile[row][col] = '.';
			row = newRow;
			col = newCol;
			tile[row][col] = 'P';
			printGrid(tile);
		}
	}
}
