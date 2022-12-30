import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

// Created by Abhinav Pillai 
// Version 1.0.0 - 12/22/2022
public class Board {
	List<String> row1;
	List<String> row2;
	List<String> row3;
	List<String> row4;
	List<String> row5;
	List<String> row6;
	List<String> row7;
	List<String> row8;
	List<String> row9;
	
	int[][] board;
	
	private static final int GRID_SIZE = 9;
	
	public Board() {
		
	}
	
	
	// Features the prompts to the user for the solver, and sends the inputs in the solveBoard method.
	public void boardBuilder() {
		System.out.println("----~(+{Board}+)~----");
		System.out.println(". . . | . . . | . . .");
		System.out.println(". . . | . . . | . . .");
        System.out.println(". . . | . . . | . . .");
        System.out.println("------+-------+------");
        System.out.println(". . . | . . . | . . .");
        System.out.println(". . . | . . . | . . .");
        System.out.println(". . . | . . . | . . .");
        System.out.println("------+-------+------");
        System.out.println(". . . | . . . | . . .");
        System.out.println(". . . | . . . | . . .");
        System.out.println(". . . | . . . | . . .");
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter numbers for row 1(Seperate with a space, and if there is no number, put 0): ");
        String inp1 = myObj.nextLine();
        System.out.println("Enter numbers for row 2(Seperate with a space, and if there is no number, put 0): ");
        String inp2 = myObj.nextLine();
        System.out.println("Enter numbers for row 3(Seperate with a space, and if there is no number, put 0): ");
        String inp3 = myObj.nextLine();
        System.out.println("Enter numbers for row 4(Seperate with a space, and if there is no number, put 0): ");
        String inp4 = myObj.nextLine();
        System.out.println("Enter numbers for row 5(Seperate with a space, and if there is no number, put 0): ");
        String inp5 = myObj.nextLine();
        System.out.println("Enter numbers for row 6(Seperate with a space, and if there is no number, put 0): ");
        String inp6 = myObj.nextLine();
        System.out.println("Enter numbers for row 7(Seperate with a space, and if there is no number, put 0): ");
        String inp7 = myObj.nextLine();
        System.out.println("Enter numbers for row 8(Seperate with a space, and if there is no number, put 0): ");
        String inp8 = myObj.nextLine();
        System.out.println("Enter numbers for row 9(Seperate with a space, and if there is no number, put 0): ");
        String inp9 = myObj.nextLine();
        row1 = Arrays.asList(inp1.split(" "));
        row2 = Arrays.asList(inp2.split(" "));
        row3 = Arrays.asList(inp3.split(" "));
        row4 = Arrays.asList(inp4.split(" "));
        row5 = Arrays.asList(inp5.split(" "));
        row6 = Arrays.asList(inp6.split(" "));
        row7 = Arrays.asList(inp7.split(" "));
        row8 = Arrays.asList(inp8.split(" "));
        row9 = Arrays.asList(inp9.split(" "));
        int[][] board1 = {
        		{Integer.parseInt(row1.get(0)), Integer.parseInt(row1.get(1)), Integer.parseInt(row1.get(2)), Integer.parseInt(row1.get(3)), Integer.parseInt(row1.get(4)), Integer.parseInt(row1.get(5)), Integer.parseInt(row1.get(6)), Integer.parseInt(row1.get(7)), Integer.parseInt(row1.get(8))},
        		{Integer.parseInt(row2.get(0)), Integer.parseInt(row2.get(1)), Integer.parseInt(row2.get(2)), Integer.parseInt(row2.get(3)), Integer.parseInt(row2.get(4)), Integer.parseInt(row2.get(5)), Integer.parseInt(row2.get(6)), Integer.parseInt(row2.get(7)), Integer.parseInt(row2.get(8))},
        		{Integer.parseInt(row3.get(0)), Integer.parseInt(row3.get(1)), Integer.parseInt(row3.get(2)), Integer.parseInt(row3.get(3)), Integer.parseInt(row3.get(4)), Integer.parseInt(row3.get(5)), Integer.parseInt(row3.get(6)), Integer.parseInt(row3.get(7)), Integer.parseInt(row3.get(8))},
        		{Integer.parseInt(row4.get(0)), Integer.parseInt(row4.get(1)), Integer.parseInt(row4.get(2)), Integer.parseInt(row4.get(3)), Integer.parseInt(row4.get(4)), Integer.parseInt(row4.get(5)), Integer.parseInt(row4.get(6)), Integer.parseInt(row4.get(7)), Integer.parseInt(row4.get(8))},
        		{Integer.parseInt(row5.get(0)), Integer.parseInt(row5.get(1)), Integer.parseInt(row5.get(2)), Integer.parseInt(row5.get(3)), Integer.parseInt(row5.get(4)), Integer.parseInt(row5.get(5)), Integer.parseInt(row5.get(6)), Integer.parseInt(row5.get(7)), Integer.parseInt(row5.get(8))},
        		{Integer.parseInt(row6.get(0)), Integer.parseInt(row6.get(1)), Integer.parseInt(row6.get(2)), Integer.parseInt(row6.get(3)), Integer.parseInt(row6.get(4)), Integer.parseInt(row6.get(5)), Integer.parseInt(row6.get(6)), Integer.parseInt(row6.get(7)), Integer.parseInt(row6.get(8))},
        		{Integer.parseInt(row7.get(0)), Integer.parseInt(row7.get(1)), Integer.parseInt(row7.get(2)), Integer.parseInt(row7.get(3)), Integer.parseInt(row7.get(4)), Integer.parseInt(row7.get(5)), Integer.parseInt(row7.get(6)), Integer.parseInt(row7.get(7)), Integer.parseInt(row7.get(8))},
        		{Integer.parseInt(row8.get(0)), Integer.parseInt(row8.get(1)), Integer.parseInt(row8.get(2)), Integer.parseInt(row8.get(3)), Integer.parseInt(row8.get(4)), Integer.parseInt(row8.get(5)), Integer.parseInt(row8.get(6)), Integer.parseInt(row8.get(7)), Integer.parseInt(row8.get(8))},
        		{Integer.parseInt(row9.get(0)), Integer.parseInt(row9.get(1)), Integer.parseInt(row9.get(2)), Integer.parseInt(row9.get(3)), Integer.parseInt(row9.get(4)), Integer.parseInt(row9.get(5)), Integer.parseInt(row9.get(6)), Integer.parseInt(row9.get(7)), Integer.parseInt(row9.get(8))}
        };
        board = board1;
        setBoard();
        if(solveBoard(board)) {
        	System.out.println("Solved succesfully!");
        	setBoard();
        } else {
        	System.out.println("Unsolvable Soduku");
        }
	}
	// Prints out the Current board 
	public void setBoard() {
		System.out.println();
		System.out.println("----~(+{Board}+)~----");
		System.out.println(" " + board[0][0] + " " + board[0][1] + " " + board[0][2] + " | " + board[0][3] + " " + board[0][4] + " " + board[0][5] + " | " + board[0][6] + " " + board[0][7] + " " + board[0][8]);
		System.out.println(" " + board[1][0] + " " + board[1][1] + " " + board[1][2] + " | " + board[1][3] + " " + board[1][4] + " " + board[1][5] + " | " + board[1][6] + " " + board[1][7] + " " + board[1][8]);
		System.out.println(" " + board[2][0] + " " + board[2][1] + " " + board[2][2] + " | " + board[2][3] + " " + board[2][4] + " " + board[2][5] + " | " + board[2][6] + " " + board[2][7] + " " + board[2][8]);
		System.out.println(" ------+-------+------");
		System.out.println(" " + board[3][0] + " " + board[3][1] + " " + board[3][2] + " | " + board[3][3] + " " + board[3][4] + " " + board[3][5] + " | " + board[3][6] + " " + board[3][7] + " " + board[3][8]);
		System.out.println(" " + board[4][0] + " " + board[4][1] + " " + board[4][2] + " | " + board[4][3] + " " + board[4][4] + " " + board[4][5] + " | " + board[4][6] + " " + board[4][7] + " " + board[4][8]);
		System.out.println(" " + board[5][0] + " " + board[5][1] + " " + board[5][2] + " | " + board[5][3] + " " + board[5][4] + " " + board[5][5] + " | " + board[5][6] + " " + board[5][7] + " " + board[5][8]);
		System.out.println(" ------+-------+------");
		System.out.println(" " + board[6][0] + " " + board[6][1] + " " + board[6][2] + " | " + board[6][3] + " " + board[6][4] + " " + board[6][5] + " | " + board[6][6] + " " + board[6][7] + " " + board[6][8]);
		System.out.println(" " + board[7][0] + " " + board[7][1] + " " + board[7][2] + " | " + board[7][3] + " " + board[7][4] + " " + board[7][5] + " | " + board[7][6] + " " + board[7][7] + " " + board[7][8]);
		System.out.println(" " + board[8][0] + " " + board[8][1] + " " + board[8][2] + " | " + board[8][3] + " " + board[8][4] + " " + board[8][5] + " | " + board[8][6] + " " + board[8][7] + " " + board[8][8]);
		System.out.println();
	}
	
	// Solves the board by looping through to each element of the board that has a 0, 
	// and tests numbers 1-9 to find valid placement. This method recursively checks if the board
	// is correct, to make sure that numbers aren't placed in the wrong places, as some numbers
	// may seem correct when placed first, but after placing more numbers, are wrong.
	public static boolean solveBoard(int[][] board) {
		for(int row = 0; row < GRID_SIZE; row++) {
			for(int collumn = 0; collumn < GRID_SIZE; collumn++) {
				if(board[row][collumn] == 0) {
					for(int i = 1; i <= GRID_SIZE;i++) {
						if(isValidPlacement(board, i, row, collumn)) {
							board[row][collumn] = i;
							if(solveBoard(board)) {
								return true;
							} else {
								board[row][collumn] = 0;
								
							}
						}
					} 
					return false;
				}
				
			}
		}
		return true;
	}
	
	// Tests if the number that is to be place in the block is valid to be placed there
	// based on if the number is already in the row, column, or box.
	public static boolean isValidPlacement(int[][] board, int num, int row, int collumn) {
		return !isInRow(board, num, row) &&
			!isInCollumn(board, num, collumn) &&
			!isInBox(board, num, row, collumn); 
	}
	
	// Checks if the number to be added is already in the row
	public static boolean isInRow(int[][] board, int num, int row) {
		for(int i = 0; i < GRID_SIZE; i++) {
			if(board[row][i] == num) {
				return true;
			}
		}
		return false;
	}
	// Checks if the number to be added is already in the column
	public static boolean isInCollumn(int[][] board, int num, int collumn) {
		for(int i = 0; i < GRID_SIZE; i++) {
			if(board[i][collumn] == num) {
				return true;
			}
		}
		return false;
	}
	
	// Checks if the number to be added is already in the box
	public static boolean isInBox(int[][] board, int num, int row, int collumn) {
		int boxRow = row - row % 3;
		int boxCollumn = collumn - collumn % 3;
		
		for(int i = boxRow; i < boxRow + 3; i++) {
			for(int j = boxCollumn; j < boxCollumn + 3; j++) {
				if(board[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("Sudoku Solver - Created by Abhinav Pillai 12/22/2022 \n"
				         + "    ~ Currently only Solves 3x3");
		System.out.println("====================================================");
		System.out.println();
		
		Board board = new Board();
		board.boardBuilder();
	}
}
