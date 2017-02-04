package tiktak;

/**
 *
 * @author reprise
 */
public class ComputerPlayer {
    //GLOBALS
    char[][] board;
    
    //Main Constructor
    ComputerPlayer(char[][] board){
        this.board = board;
    }
    
    public void showBoard(){
        System.out.println("this is computer Players copy of the board:");
        for (int b = 0; b < board.length; b++){
            System.out.println(board[b]);
        }
        
        
    }
    
    
}
