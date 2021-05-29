package connectfour;

import connectfour.Board.Checker;

public class ConnectFour {

	public static void RedMove(String[][] board)
	{
		//System.out.println("Red Move: Choose (0-6):");
		//scanner scan = new Scanner (System.in)
		
	//	int x = scan.nextInt()
	}
	
	public static void main(String[] args){
		Board myboard = new Board();
		myboard.createemptyboard();
//		myboard.taketurns(0,Checker.RED);
//		myboard.taketurns(0,Checker.RED);
//		myboard.taketurns(0,Checker.RED);
//		myboard.taketurns(0,Checker.RED);
//		myboard.taketurns(1,Checker.BLACK);
//		myboard.taketurns(1,Checker.BLACK);
//		myboard.taketurns(1,Checker.BLACK);
//		myboard.taketurns(1,Checker.BLACK);
		myboard.taketurns(0,Checker.RED);
		myboard.taketurns(1,Checker.RED);
		myboard.taketurns(2,Checker.RED);
		myboard.taketurns(3,Checker.RED);
		myboard.taketurns(0,Checker.BLACK);
		myboard.taketurns(1,Checker.BLACK);
		myboard.taketurns(2,Checker.BLACK);
		myboard.taketurns(3,Checker.BLACK);
		Checker winner=myboard.checkwinhorizontal();
		System.out.println(winner);
		//I know I need a while loop alternating between red and black
		//ask player for number and column
		//make turn and print board
		//check if win
		
		
		myboard.printboard();
	}
	
}
