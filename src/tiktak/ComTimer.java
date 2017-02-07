/*
 *this class Is meant to override the ComTimer class in Java so that the COM player
 * Doesn't make its move imediately.  It creates some delay.  Create an object in
 * the computerPlayer class.
 */

package tiktak;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author reprise
 */
public class ComTimer extends Timer {
    Timer timer = new Timer();
    int ticks = 0;
    
    
    public void think(){
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                ticks++;
                
                if (ticks > 3){
                    timer.cancel();
                }
            }
        }, 1000,1000);
    }
}
