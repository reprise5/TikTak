package tiktak;

/**
 *
 * @author reprise
 */
public class main {

    /**
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        
        /* Set the look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                 break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TikTakForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* create a new form and open it. */
        TikTakForm game = new TikTakForm();
        game.setVisible(true);
        
//        /* keep track of the game */
        do{
            if (game.getPlayer() == 1){
                Thread.sleep(2500);
                System.out.println("Main knows player 2 is playing their O.");
                //game.playComputer();
            }
        }while(!game.isShowing()); //<-- need to change this loop
    } 
}
