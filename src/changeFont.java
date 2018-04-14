
import java.awt.Font;
import javax.swing.*;

class changeFont extends Calender
{ 
    JButton table_buttons[][][] = new JButton[12][5][7];
    void changeFontToHindi(JButton back,JLabel monthLabel,JLabel monthsHeading,JButton jan,JButton feb,JButton march,JButton april,JButton may,JButton june,JButton july,JButton aug,JButton sept,JButton oct,JButton nov,JButton dec)
    {
        back.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        monthsHeading.setFont(new Font ("SansSerif",Font.PLAIN, 35));
        monthsHeading.setHorizontalAlignment(JLabel.CENTER);
        monthsHeading.setVerticalAlignment(JLabel.CENTER);
        monthLabel.setFont(new Font ("SansSerif",Font.BOLD, 30));
        jan.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        feb.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        march.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        april.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        may.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        june.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        july.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        aug.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        sept.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        oct.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        nov.setFont(new Font ("SansSerif",Font.PLAIN, 16));
        dec.setFont(new Font ("SansSerif",Font.PLAIN, 16));
    }
    void changeFontToPunjabi(JButton back,JLabel monthLabel,JLabel monthsHeading,JButton jan,JButton feb,JButton march,JButton april,JButton may,JButton june,JButton july,JButton aug,JButton sept,JButton oct,JButton nov,JButton dec)
    {
        back.setFont(new Font ("Raavi",Font.PLAIN, 16));
        monthsHeading.setFont(new Font ("Raavi",Font.PLAIN, 35));
        monthsHeading.setHorizontalAlignment(JLabel.CENTER);
        monthsHeading.setVerticalAlignment(JLabel.CENTER);
        monthLabel.setFont(new Font ("Raavi",Font.BOLD, 30));
        jan.setFont(new Font ("Raavi",Font.PLAIN, 16));
        feb.setFont(new Font ("Raavi",Font.PLAIN, 16));
        march.setFont(new Font ("Raavi",Font.PLAIN, 16));
        april.setFont(new Font ("Raavi",Font.PLAIN, 16));
        may.setFont(new Font ("Raavi",Font.PLAIN, 16));
        june.setFont(new Font ("Raavi",Font.PLAIN, 16));
        july.setFont(new Font ("Raavi",Font.PLAIN, 16));
        aug.setFont(new Font ("Raavi",Font.PLAIN, 16));
        sept.setFont(new Font ("Raavi",Font.PLAIN, 16));
        oct.setFont(new Font ("Raavi",Font.PLAIN, 16));
        nov.setFont(new Font ("Raavi",Font.PLAIN, 16));
        dec.setFont(new Font ("Raavi",Font.PLAIN, 16));
    }
}