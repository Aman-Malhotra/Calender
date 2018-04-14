
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

    class PlaySchoolClock extends Calender {
        public PlaySchoolClock(JPanel realTimePanel) {
            JLabel clock;
            clock = new JLabel();
            clock.setHorizontalAlignment(JLabel.CENTER);
            clock.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 16));
            tickTock(clock);
            realTimePanel.add(clock);

            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tickTock(clock);
                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            timer.start();
        }

        public void tickTock(JLabel clock) {
            clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
        }
    }