package tiktak;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author reprise
 */
public class main extends WindowAdapter {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        boolean tie = false;
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
                int num = windowClosingSwitch(1);
                System.out.println("Form closing and");
            }
        });
        game.setVisible(true);
        
        /* keep track of the game */
        do{
            if (game.getPlayer() == 1){
                Thread.sleep(1234);
                
                tie = game.checkTie();
                if (tie){
                    break;
                }
                System.out.println("Main knows player 2 is playing their O.");
                game.playComputer();
            }
        } while(windowClosingSwitch(0) == 0);
    } 
    
    //WindowClosing will pass a 1 to signify it's closing, to end do-while loop.
    //this probably doesn't work as intended.
    public static int windowClosingSwitch(int num){
        int numb = 0;
        System.out.print("");
        if (num == 0){
            //IGNORE THE 0 AT ALL COSTS
            return numb;
        }
        else{
            System.out.println("1 recieved.");
            numb = num;
            return numb;
        }
    }
}
