/*
 * This is the computer player to Tic-Tac-Toe.  it acts as player 2
 * Who plays Naughts.  There will be a 20% chance the COM will not move 
 * to block player 1.
 */

package tiktak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author reprise
 */
public class ComputerPlayer {
    //GLOBALS
    ArrayList<Character> pieces = new ArrayList<Character>(Arrays.asList('X','O'));
    Random randomGenerator = new Random();
    char[][] board;      //the internal gameboard
    int player;          //Who's turn it is.  0=Human, 1= Computer
    int ID;              //ID to return to the gameboard so it's tile can be flipped up.
    int randomNum;       //Random Num recieved from rollDice(), to help make a random move.
    private boolean done = false; //whether or not to done again (for playing random moves)
    
    //Main Constructor
    ComputerPlayer(char[][] board, int player){
        this.board = board;
        this.player = player;
    }
    
    public void showBoard(){
        System.out.println("this is computer Players copy of the board:");
        for (int b = 0; b < board.length; b++){
            System.out.println(board[b]);
        }                                   //     MY WORD! WE'RE ABOUT TO CRASH, CAP!
    }                                       //              (  ) (  )                           S  T  O  P
                                            //           ( )        ( )                         ---|##|---
    public int playTurn(char[][] board){    //                       ||\                           |##|
                                            //  [[  ]]_[[  ]]_[[  ]]<>|=\  CHOO CHOO ...AAAHHHH    |##|
                                            //   O  O  O   O  O   O --O =>                       <<#### 
        //Can I win?   /==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/=<<####
        if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == '-'){      //LEFT COL 
            board[2][0] = 'O';
            ID = 7;
        }
        else if(board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == '-'){ //LEFT COL 2
            board[1][0] = 'O';
            ID = 4;
        }
        else if(board[1][0] == 'O' && board[2][0] == 'O' && board[0][0] == '-'){ //LEFT COL 3
            board [0][0] = 'O';
            ID = 1;
        }
        else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == '-'){ //MIDD COL 1
            board [2][1] = 'O';
            ID = 8;
        }
        else if(board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] == '-'){ //MIDD COL 2
            board [1][1] = 'O';
            ID = 5;
        }
        else if(board[1][1] == 'O' && board[2][1] == 'O' && board[0][1] == '-'){ //MIDD COL 3
            board [0][1] = 'O';
            ID = 2;
        }
        else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == '-'){ //RIGT COL 1
            board [2][2] = 'O';
            ID = 9;
        }
        else if(board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == '-'){ //RIGT COL 2
            board [1][2] = 'O';
            ID = 6;
        }
        else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == '-'){ //RIGT COL 3
            board [2][2] = 'O';
            ID = 3;
        }
        else{
            //Should I block?
            if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == '-'){      //LEFT COL 1
                board[2][0] = 'O';
                ID = 7;
            }
            else if(board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == '-'){ //LEFT COL 2
                board[1][0] = 'O';
                ID = 4;
            }
            else if(board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == '-'){ //LEFT COL 3
                board [0][0] = 'O';        
                ID = 1;
            }
            else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == '-'){ //MIDD COL 1
                board [2][1] = 'O';
                ID = 8;
            }
            else if(board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == '-'){ //MIDD COL 2
                board [1][1] = 'O';
                ID = 5;
            }
            else if(board[1][1] == 'X' && board[2][1] == 'X' && board[0][1] == '-'){ //MIDD COL 3
                board [0][1] = 'O';
                ID = 2;
            }
            else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == '-'){ //RIGT COL 1       *
                board [2][2] = 'O';
                ID = 9;
            }
            else if(board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == '-'){ //RIGT COL 2
                board [1][2] = 'O';
                ID = 6;
            }
            else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == '-'){ //RIGT COL 3
                board [2][2] = 'O';
                ID = 3;
            }
            //----rows
            else if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == '-'){ //TOP  ROW 1
                board [0][2] = 'O';
                ID = 3;
            }
            else if(board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == '-'){ //TOP  ROW 2
                board [0][1] = 'O';
                ID = 2;
            }
            else if(board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == '-'){ //TOP  ROW 3
                board [0][0] = 'O';
                ID = 1;
            }
            else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == '-'){ //MIDL ROW 1
                board [1][2] = 'O';
                ID = 6;
            }
            else if(board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == '-'){ //MIDL ROW 2
                board [1][1] = 'O';
                ID = 5;
            }
            else if(board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == '-'){ //MIDL ROW 3
                board [1][0] = 'O';
                ID = 4;
            }
            else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == '-'){ //MIDL ROW 1
                board [2][2] = 'O';
                ID = 9;
            }
            else if(board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == '-'){ //MIDL ROW 2
                board [2][1] = 'O';
                ID = 8;
            }
            else if(board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == '-'){ //MIDL ROW 3
                board [2][0] = 'O';
                ID = 7;
            }
            else {
                //while false,
                    //pick random number
                    //put it through case
                        //can I move, True or False
                    //make that move
                //If true, loop again.
                
                /* SOO */

//                while(!done){
//                    randomNum = rollDice();
//                    switch(randomNum){
//                        case 0:
//                            //make move 1
//                            if(board[0][0] == '-'){
//                                board[0][0] = 'O';
//                                ID = 5;
//                                done = true;
//                            }
//                            break;
//                        case 1:
//                            //make move 
//                            break;
//                    } 
//                }                         << working on it.  :3
                
            //v v v v v v OLD CODE v v v v v v v v v v v OLD CODE v v v v v v v 
                if(board[0][0] == '-'){
                    board[0][0] = 'O';
                    ID = 1;  
                }
                else if(board[1][1] == '-'){
                    board[1][1] = 'O';
                    ID = 5;
                }
                else if(board[0][2] == '-'){
                    board[0][2] = 'O';
                    ID = 3;
                }
                else if(board[2][1] == '-'){
                    board[2][1] = 'O';
                    ID = 8;
                }
                else if(board[1][0] == '-'){
                    board[1][0] = 'O';
                    ID = 4;
                }
                
                
            }
        }
        
        showBoard();
        //System.out.println("Returning ID " + ID + ".");
        return ID;
    }
    private int rollDice(){
        int number = 0;
        //there are 9 possibilities for a move.
        number = randomGenerator.nextInt(8);
        return number;
    }
}
