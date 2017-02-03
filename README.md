# TikTak

###Screenshot 

Feb 3, 2017

![alt tag](https://github.com/reprise5/TikTak/blob/master/screenshot-TikTak.png)

###DONE
* icons change with whoever's turn it is
* turns change over
* Buttons Have ID's (they know who they are, so when the bot is being made, bot can make turn.)
* After placing a move the icon disables (and keeps its color). yayay
* Reset button functions (resets icons, enabled boolean, turns to player1 and updates the label
* Score boxes are there but aren't hooked up yet.
* Post button is there but doesn't connect to the database yet.

###NOT DONE
* Player 2 (COM) logic needs to be written
  * Study board array input
  * if COM has a winning move, take it.
  * If opponent has a winning move, block it.
  * if this move creates fork after move, it's important. (2 possibilities for winning)
  * block opponent forks
  * count possibilities for winning for each possibility. move with highest score is the next move
  * make move in array.  it keeps track internally.
  * get button ID for desired move, and run changeIcon(); and nextPlayer();
* Write a subroutine that determines whether or not anyone won.  and give a point to the player who won.
* Create Database.
* Get Post button to connect to the database.
* other stuff too but it's 2am and I'm tired.
