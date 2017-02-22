package tiktak;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author reprise
 */
public class main extends WindowAdapter {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        int closing = 0;
        
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
        game.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Form closing");
                //closing = game.isClosing();   <-- Cannot use.  ???
            }
        });
        game.setVisible(true);
        
        /* keep track of the game */
//        do{
//            if (game.getPlayer() == 1){
//                Thread.sleep(2500);
//                System.out.println("Main knows player 2 is playing their O.");
//                //game.playComputer();
//            }
//        }while(!game.isShowing()); // <-- change will be implemented soon.
    } 
}
