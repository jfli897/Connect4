package connectfour;
public class Board {
	//define two players
	
	
	Checker [][] board = new Checker [6][7];
	
	
	enum Checker {
		RED,
		BLACK,
		EMPTY,
	
	}
	
	public void createemptyboard () {
		for (int r=0;r<6;r++) {
			for (int c=0;c<7;c++) {
				board[r][c]=Checker.EMPTY;
			
			}
		
		}
	
	
	}
	public void printboard () {
		for (int r=0;r<6;r++) {
			System.out.println();
			for (int c=0;c<7;c++) {
				if (board[r][c]==Checker.EMPTY) {
				System.out.print('_');
				System.out.print(" ");
				}
				if (board[r][c]==Checker.RED) {
					System.out.print('R');
					System.out.print(" ");
					}
				if (board[r][c]==Checker.BLACK) {
					System.out.print('B');
					System.out.print(" ");
					}
				
			
			}
		}
		System.out.println();
	}
	
		public void taketurns(int c,Checker p) {
			for (int r=5;r>=0;r--) {
				if(board[r][c]==Checker.EMPTY) {
					board[r][c]=p;
					break;
				}
			}
		}
		
		public Checker checkwinhorizontal() {
			for (int r = 0; r < 6; r++) {
				Checker previouschecker = Checker.EMPTY; 
				int streakcount=0;
				for (int c = 0; c < 7; c++) {
					Checker current = board[r][c];
					if (current==previouschecker) {
						streakcount++;
					}else {
						streakcount=0;
					}
					if (streakcount==3 && board[r][c]!= Checker.EMPTY) {
						return current;
					}
					
					previouschecker=current;
				}
				
			}
			return Checker.EMPTY;
				
			}
			
		}

