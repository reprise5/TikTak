/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktak;

import java.util.ArrayList;
import java.util.Set;
import javax.swing.ImageIcon;

/**
 *
 * @author reprise
 */
public class TikTakForm extends javax.swing.JFrame {


  public TikTakForm() {
        initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        stickerLabel = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();
        tile11 = new javax.swing.JButton();
        tile12 = new javax.swing.JButton();
        tile13 = new javax.swing.JButton();
        tile21 = new javax.swing.JButton();
        tile22 = new javax.swing.JButton();
        tile23 = new javax.swing.JButton();
        tile31 = new javax.swing.JButton();
        tile32 = new javax.swing.JButton();
        tile33 = new javax.swing.JButton();
        resetBoardButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        p2_score_screen = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        p1_score_screen = new javax.swing.JTextPane();
        p1_score_label = new javax.swing.JLabel();
        p2_score_label = new javax.swing.JLabel();
        postScoreButton = new javax.swing.JButton();
        informationLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIK-TAK (Tic-Tac-Toe Game)");

        stickerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/BoardSticker.png"))); // NOI18N

        tile11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile11ActionPerformed(evt);
            }
        });

        tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile12ActionPerformed(evt);
            }
        });

        tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile13ActionPerformed(evt);
            }
        });

        tile21.setToolTipText("");
        tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile21ActionPerformed(evt);
            }
        });

        tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile22ActionPerformed(evt);
            }
        });

        tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile23ActionPerformed(evt);
            }
        });

        tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile31ActionPerformed(evt);
            }
        });

        tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile32ActionPerformed(evt);
            }
        });

        tile33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addComponent(tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tile11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stickerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(stickerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(stickerLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(boardPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        resetBoardButton.setText("Reset");
        resetBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBoardButtonActionPerformed(evt);
            }
        });

        p2_score_screen.setEditable(false);
        p2_score_screen.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        p2_score_screen.setText("0");
        jScrollPane2.setViewportView(p2_score_screen);

        jScrollPane3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        p1_score_screen.setEditable(false);
        p1_score_screen.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        p1_score_screen.setText("0");
        jScrollPane3.setViewportView(p1_score_screen);

        p1_score_label.setText("Player1");
        p1_score_label.setRequestFocusEnabled(false);

        p2_score_label.setText("Player2");

        postScoreButton.setText("Post");

        informationLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        informationLabel.setText("YOUR TURN");
        informationLabel.setFocusable(false);
        informationLabel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(postScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p1_score_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2_score_label)
                .addGap(57, 57, 57)
                .addComponent(resetBoardButton)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1_score_label)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(resetBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(p2_score_label))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Tile 1,1 | ID 1
    private void tile11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile11ActionPerformed
        int ID = 1;

        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile11.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile11ActionPerformed

    //Tile 1,2 | ID 2
    private void tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile12ActionPerformed
        int ID = 2;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile12.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile12ActionPerformed

    //Tile 1,3 | ID 3
    private void tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile13ActionPerformed
        int ID = 3;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile13.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile13ActionPerformed

    //Tile 2,1 | ID 4
    private void tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile21ActionPerformed
        int ID = 4;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile21.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile21ActionPerformed

    //Tile 2,2 | ID 5
    private void tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile22ActionPerformed
        int ID = 5;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile22.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile22ActionPerformed

    //Tile 2,3 | ID 6
    private void tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile23ActionPerformed
        int ID = 6;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile23.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile23ActionPerformed

    //Tile 3,1 | ID 7
    private void tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile31ActionPerformed
        int ID = 7;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile31.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile31ActionPerformed

    //Tile 3,2 | ID 8
    private void tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile32ActionPerformed
        int ID = 8;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile32.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile32ActionPerformed

    //Tile 3,3 | ID 9
    private void tile33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile33ActionPerformed
        int ID = 9;
        
        if (player == 0){
            changeIcon(ID,0);
        }
        else if (player == 1){
            changeIcon(ID, 1);
        }
        tile33.setEnabled(false);
        nextPlayer();
    }//GEN-LAST:event_tile33ActionPerformed

    //Clear the board to play again.  leave the scores alone.
    private void resetBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBoardButtonActionPerformed

        tile11.setEnabled(true);
        tile12.setEnabled(true);
        tile13.setEnabled(true);
        tile21.setEnabled(true);
        tile22.setEnabled(true);
        tile23.setEnabled(true);
        tile31.setEnabled(true);
        tile32.setEnabled(true);
        tile33.setEnabled(true);
        
        tile11.setIcon(null);
        tile12.setIcon(null);
        tile13.setIcon(null);
        tile21.setIcon(null);
        tile22.setIcon(null);
        tile23.setIcon(null);
        tile31.setIcon(null);
        tile32.setIcon(null);
        tile33.setIcon(null);
        
        player = 0;
        informationLabel.setText("YOUR TURN");
    }//GEN-LAST:event_resetBoardButtonActionPerformed

    //the logic to the computer player, player 2, who plays Noughts.
    public void COM (char[][] board){
        //Study board array input,
            //COM winning move, take it
            //opponant winning move, block it.
            //creates fork after move
            //block opponent forks
            /*count winning possibilities for each possibility.  
            move with highest score is the next move. */
        //make move in array.
            //get button id for the button coords (subroutine)
        //change the icon to NAUGHT.
    }
    
    /*Pass player number, and Tile ID.
     *Player (either 1 or 2), which decides if it's a nought or cross, 
     *And ID is WHICH tile to change to a nought or cross. */
    private void changeIcon(int ID, int player){
        ArrayList<ImageIcon> pieces = new ArrayList();
        pieces.add(cross);      //Player 1's piece  HUMAN
        pieces.add(nought);     //Player 2's piece  COM
        
        System.out.print("Player: " + player + " at Tile " + ID + ".   ");
        
        switch(ID){
            case 1:
                tile11.setIcon(pieces.get(player));
                tile11.setDisabledIcon(pieces.get(player));
                break;
            case 2:
                tile12.setIcon(pieces.get(player));
                tile12.setDisabledIcon(pieces.get(player));
                break;
            case 3:
                tile13.setIcon(pieces.get(player));
                tile13.setDisabledIcon(pieces.get(player));
                break;
            case 4:
                tile21.setIcon(pieces.get(player));
                tile21.setDisabledIcon(pieces.get(player));
                break;
            case 5:
                tile22.setIcon(pieces.get(player));
                tile22.setDisabledIcon(pieces.get(player));
                break;
            case 6:
                tile23.setIcon(pieces.get(player));
                tile23.setDisabledIcon(pieces.get(player));
                break;
            case 7:
                tile31.setIcon(pieces.get(player));
                tile31.setDisabledIcon(pieces.get(player));
                break;
            case 8:
                tile32.setIcon(pieces.get(player));
                tile32.setDisabledIcon(pieces.get(player));
                break;
            case 9:
                tile33.setIcon(pieces.get(player));
                tile33.setDisabledIcon(pieces.get(player));
                break;     
        }
    }

    //pass the baton to next player.
    private void nextPlayer(){
        if (player == 0){
            player = 1;
            System.out.println("Now it's player " + (player + 1) + "'s turn!");
            informationLabel.setText("MY TURN");
        }
        else {
            player = 0;
            System.out.println("Now it's player " + (player + 1) + "'s turn!");
            informationLabel.setText("YOUR TURN");
        }
    }
    
    public static void main(String args[]) {

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
             break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(TikTakForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(TikTakForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(TikTakForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(TikTakForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new TikTakForm().setVisible(true);
        }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel p1_score_label;
    private javax.swing.JTextPane p1_score_screen;
    private javax.swing.JLabel p2_score_label;
    private javax.swing.JTextPane p2_score_screen;
    private javax.swing.JButton postScoreButton;
    private javax.swing.JButton resetBoardButton;
    private javax.swing.JLabel stickerLabel;
    private javax.swing.JButton tile11;
    private javax.swing.JButton tile12;
    private javax.swing.JButton tile13;
    private javax.swing.JButton tile21;
    private javax.swing.JButton tile22;
    private javax.swing.JButton tile23;
    private javax.swing.JButton tile31;
    private javax.swing.JButton tile32;
    private javax.swing.JButton tile33;
    // End of variables declaration//GEN-END:variables

    //GLOBALS
    int player = 0;                     //0=Human 1=COM
    char[][] board = {                  //The Game Board as a multidim array.
        {'#','#'},{'#','#'},{'#','#'},
        {'#','#'},{'#','#'},{'#','#'},
        {'#','#'},{'#','#'},{'#','#'}
    };
    
    ImageIcon cross     = new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/cross.png"));
    ImageIcon nought    = new javax.swing.ImageIcon(getClass().getResource("/tiktak/images/nought.png"));
    
}
