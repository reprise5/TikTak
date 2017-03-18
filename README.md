# TikTak

## Screenshot 

From Feb 3, 2017

![alt tag](https://github.com/reprise5/TikTak/blob/master/screenshot-TikTak.png)

## TASKS:
* ~~icons change with whoever's turn it is~~
* ~~turns change over~~
* ~~Buttons Have ID's (they know who they are)~~
* ~~After placing a move the icon disables (and keeps its color). yayay~~
* ~~Functional Reset button~~
* ~~Score boxes are there and keep track of wins~~
* ~~Post button is there but doesn't connect to the database yet.~~
* ~~Can determine wins and tie games~~
* Player 2 (COM) logic needs to be written
  * ~~Study board array input~~
  * ~~if COM has a winning move, take it.~~
  * ~~If opponent has a winning move, block it.~~
  * if this move creates fork after move, it's important. (2 possibilities for winning)
  * block opponent forks
  * Finish remaining move possibilities for computerPlayer
  * count possibilities for winning for each possibility. move with highest score is the next move
  * ~~make move in array.  it keeps track internally.~~
  * ~~get button ID for desired move, and run changeIcon(); and nextPlayer();~~
* Create Database.
* Get Post button to connect to the database.
* ~~Finish Player 2 delay.  (Getting there)~~
* ~~Oh yeah, and delete unused classes and code.  JEEZ.~~
* ~~Randomize Guess if there's no win/block to be made.  Makes player2 less predictable.  Or look ahead 2 turns.~~
* other stuff too but it's 2am and I'm tired.


## Combinations & Move possibilities (ComputerPlayer)

### Winning Possibilities
```
L.col       MidCol      R.Col       RDiag
 x--  	     -x-  		 --x	 	 x--
 x--  	     -x-  	     --x 		 -x-
 x--  	     -x-  	     --x		 --x
[0][0]		[0][1]		[0][2]		[0][0]
[1][0]		[1][1]		[1][2]		[1][1]	
[2][0]		[2][1]		[2][2]		[2][2]	

TopRow      MidRow      BtmRow      LDiag
 xxx		 ---		 ---		 --x
 ---		 xxx	     ---	   	 -x-
 ---		 ---	     xxx	   	 x--
[0][0]		[1][0]		[2][0]		[0][2]
[0][1]		[1][1]		[2][1]		[1][1]
[0][2]		[1][2]		[2][2]		[2][0]
```
### Combos that Warrant a block (if X) or Win (if O)
```
LCol1       MidCol1     RCol1       RDiag1      LDiag1
 x--  		 -x-  		 --x		 x--		 --x
 x--  		 -x-  		 --x 		 -x-		 -x-
 ---  		 ---  		 ---		 ---		 ---
[0][0]		[0][1]		[0][2]		[0][0]		[0][2]
[1][0]		[1][1]		[1][2]		[1][1]		[1][1]
[2][0]		[2][1]		[2][2]		[2][2]		[2][0]

LCol2       MidCol2     RCol2       RDiag2      LDiag2
 x--  		 -x-  		 --x		 x--		 --x
 ---  		 ---  		 --- 		 ---		 ---
 x--  		 -x-  		 --x		 --x		 x--
[0][0]		[0][1]		[0][2]		[0][0]		[0][2]
[1][0]		[1][1]		[1][2]		[1][1]		[1][1]
[2][0]		[2][1]		[2][2]		[2][2]		[2][0]

LCol3       MidCol3     RCol3       RDiag3      LDiag3
 ---  		 ---  		 ---		 ---		 ---
 x--  		 -x-  		 --x 		 -x-		 -x-
 x--  		 -x-  		 --x		 --x		 x--
[0][0]		[0][1]		[0][2]		[0][0]		[0][2]
[1][0]		[1][1]		[1][2]		[1][1]		[1][1]
[2][0]		[2][1]		[2][2]		[2][2]		[2][0]

TopRow1     MidRow1     BtmRow1     TopRow2     MidRow2
 xx-		 ---		 ---		 x-x		 ---
 ---		 xx-		 ---		 ---		 x-x
 ---		 ---		 xx-		 ---		 ---
[0][0]		[1][0]		[2][0]		[0][0]		[1][0]
[0][1]		[1][1]		[2][1]		[0][1]		[1][1]
[0][2]		[1][2]		[2][2]		[0][2]		[1][2]

BtmRow2     TopRow3     MidRow3     BtmRow3
 ---		 -xx		 ---		 ---
 ---		 ---		 -xx		 ---
 x-x		 ---		 ---		 -xx
[2][0]		[0][0]		[1][0]		[2][0]
[2][1]		[0][1]		[1][1]		[2][1]
[2][2]		[0][2]		[1][2]		[2][2]
```
### Forks
```                ```

