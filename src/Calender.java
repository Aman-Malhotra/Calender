
import java.awt.*;
import java.awt.event.*;
import java.time.DayOfWeek;
import java.util.*;
import java.util.List.*;
import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


public class Calender extends javax.swing.JFrame {

    
    String language ;
    int xyz =0;
    JButton back = new JButton();
        JButton table_buttons[][][]= new JButton[12][6][7];
        JButton dayLabel[] = new JButton[7];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
//        LocalDate date = LocalDate.parse("16/12/2017", formatter); // LocalDate = 2010-02-23
//        DayOfWeek  dow = date.getDayOfWeek();  // Extracts a `DayOfWeek` enum object.
//        String output = dow.getDisplayName(TextStyle.SHORT, Locale.US); // String = Tue
        
        
    public Calender() {
//        String nameOfDay = output;
//        System.out.println(nameOfDay);
//        
        initComponents();
//        addYears years = new addYears(yearBox);
        for(int x = 1800;x<=2017;x++)
        {
//            yearBox.addItem(new ComboItem(Integer.toString(x),Integer.toString(y)));
            yearBox.addItem(Integer.toString(x));
        }
        int once =0;
        monthLabel.setFont(new Font ("",Font.BOLD, 40));
        monthsHeading.setFont(new Font ("",Font.BOLD, 30));
        yearBox.setSelectedItem("2017");
//        PlaySchoolClock clock = new PlaySchoolClock(realTimePanel);
        if(once ==0 )
        {
            english.doClick();
            once ++;
        }
        
//        if(once != 0)
//        {
//        jan.doClick();
//        }
    }
    /*public void tables(int total_days, int m)
    {
        setDate set = new setDate();
        set.dateSet(language, monthLabel, monthPanel,mainPanel, datesPanel, total_days, m);
    }*/
    
    // creating date tables using 2d array of buttons . m represents the month no.
    
    public void tables (int total_days,int m)
    {
        String getDate = "1/"+Integer.toString(m+1)+"/"+yearBox.getSelectedItem(); 
        LocalDate date = LocalDate.parse(getDate, formatter); // LocalDate = 2010-02-23
        DayOfWeek  dow = date.getDayOfWeek();  // Extracts a `DayOfWeek` enum object.
        String output = dow.getDisplayName(TextStyle.SHORT, Locale.US); // String = Tue
        int x= 0, y=0;
        for(int names = 0; names <7;names++)
        {
            
            switch(language){
                case "english":
                    dayLabel [names] = new JButton((new daysOfWeek()).daysNameEnglish(names)); 
                    dayLabel[names].setFont(new Font ("Raleway Light",Font.PLAIN, 12));
                    break;
                case "hindi":
                    dayLabel [names] = new JButton((new daysOfWeek()).daysNameHindi(names));
                    dayLabel[names].setFont(new Font ("SansSerif",Font.PLAIN, 12));
                    break;
                case "punjabi":
                    dayLabel [names] = new JButton((new daysOfWeek()).daysNamePunjabi(names));
                    dayLabel[names].setFont(new Font ("Raavi",Font.PLAIN, 12));
                    break;
                default:
                    
            }
            
            
//            JLabel dayLabel = new JLabel((new daysOfWeek()).daysName(names)); 
            
            dayLabel[names].setBounds(x,y,60,50);
            dayLabel[names].setForeground(Color.black);
            dayLabel[names].setHorizontalAlignment(JLabel.CENTER);
            dayLabel[names].setVerticalAlignment(JLabel.CENTER);
            datesPanel.add(dayLabel[names]);
            x+=60;
        }
     int day =1,n=0;
//     int getX = (new getX()).getx(output);
    int getX = getx(output); 
     x= getX;
//    x=0;
     y=60;
     int i=0,j;
        for(int p=0;p<6;p++)
        {
            j=0;
            
            int q;
            if(p==0)
                q = getq(x);
            else
                q = 0;
            for(;q<7;q++)
            {
//                System.out.println("day "+day);
//                System.out.println("i "+i+" j "+j);
                int tempDay;
                tempDay = day;
                table_buttons[m][i][j]=new JButton();
                table_buttons[m][i][j].setBounds(x,y,60,50);
                table_buttons[m][i][j].setFont(new Font ("",Font.BOLD, 15));
//                getDateValue abc = new getDateValue();
                String dateHindi = getDateHindi(day);
                String datePunjabi = getDatePunjabi(day);
//                String dateHindi="";
//                String datePunjabi="";
                switch (language) {
                    case "english":
                        table_buttons[m][i][j].setFont(new Font ("Raleway Light",Font.PLAIN, 15));
                        table_buttons[m][i][j].setText(day+"");
                        break;
                    case "hindi":
                        table_buttons[m][i][j].setFont(new Font ("SansSerif",Font.PLAIN, 15));
                        table_buttons[m][i][j].setText(dateHindi);
                        break;
                    case "punjabi":
                        table_buttons[m][i][j].setFont(new Font ("Raavi",Font.PLAIN, 15));
                        table_buttons[m][i][j].setText(datePunjabi);
                        break;
                    default:
                        break;
                }
                datesPanel.add(table_buttons[m][i][j]);
                String hindi= dateHindi;
                String punjabi = datePunjabi;
                table_buttons[m][i][j].addActionListener(new ActionListener()
                {
                    
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if (e.getSource() instanceof JButton) 
                        {
                            mainPanel.add(back);
                            
                            back.setBounds(0,100,70,35);
                            String tempMonth = monthLabel.getText();
                            
//                            jLabel14.setText(datePunjabi+" "+tempMonth);
//                            dateLabel.setFont(new Font ("",Font.BOLD, 30));
                            switch (language) {
                                case "english":
                                    back.setFont(new Font ("Raleway Light",Font.BOLD, 11));
                                    back.setText("BACK");
                                    monthLabel.setText(tempDay+" "+tempMonth);
                                    break;
                                case "hindi":
                                    back.setText("वापस");
                                    monthLabel.setText(hindi+" "+tempMonth);
                                    break;
                                case "punjabi":
                                    back.setText("ਵਾਪਸ");
                                    monthLabel.setText(punjabi+" "+tempMonth);
                                    break;
                                default:
                                    break;
                            }
                            
                            back.addActionListener(new java.awt.event.ActionListener() 
                                {
                                    int count =0;
                                    @Override
                                    public void actionPerformed(java.awt.event.ActionEvent evt) 
                                    {
                                        if(count == 0)
                                        {
                                        backActionPerformed(evt,m);
                                        count ++;
                                        }
                                    }
                                });
                            mainPanel.revalidate();
                            mainPanel.repaint();
                            datesPanel.removeAll();
                            datesPanel.revalidate();
                            datesPanel.repaint();
                        }
                    }
                });
                x += 60;
                if(day == total_days)
                    break;
                day++;
                j++;
            }
            y +=50;
            x=0;
            i++;
            if(day == total_days)
                    break;
        }
        day =0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        monthPanel = new javax.swing.JPanel();
        jan = new javax.swing.JButton();
        feb = new javax.swing.JButton();
        march = new javax.swing.JButton();
        april = new javax.swing.JButton();
        may = new javax.swing.JButton();
        june = new javax.swing.JButton();
        july = new javax.swing.JButton();
        aug = new javax.swing.JButton();
        sept = new javax.swing.JButton();
        oct = new javax.swing.JButton();
        nov = new javax.swing.JButton();
        dec = new javax.swing.JButton();
        monthsHeading = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        datesPanel = new javax.swing.JPanel();
        monthLabel = new javax.swing.JLabel();
        english = new javax.swing.JButton();
        hindi = new javax.swing.JButton();
        punjabi = new javax.swing.JButton();
        realTimePanel = new javax.swing.JPanel();
        yearBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        monthPanel.setBackground(new java.awt.Color(51, 0, 51));

        jan.setBackground(new java.awt.Color(255, 255, 255));
        jan.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        jan.setText("January");
        jan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janActionPerformed(evt);
            }
        });

        feb.setBackground(new java.awt.Color(255, 255, 255));
        feb.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        feb.setText("February");
        feb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                febActionPerformed(evt);
            }
        });

        march.setBackground(new java.awt.Color(255, 255, 255));
        march.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        march.setText("March");
        march.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marchActionPerformed(evt);
            }
        });

        april.setBackground(new java.awt.Color(255, 255, 255));
        april.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        april.setText("April");
        april.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprilActionPerformed(evt);
            }
        });

        may.setBackground(new java.awt.Color(255, 255, 255));
        may.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        may.setText("May");
        may.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayActionPerformed(evt);
            }
        });

        june.setBackground(new java.awt.Color(255, 255, 255));
        june.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        june.setText("June");
        june.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juneActionPerformed(evt);
            }
        });

        july.setBackground(new java.awt.Color(255, 255, 255));
        july.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        july.setText("July");
        july.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                julyActionPerformed(evt);
            }
        });

        aug.setBackground(new java.awt.Color(255, 255, 255));
        aug.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        aug.setText("August");
        aug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                augActionPerformed(evt);
            }
        });

        sept.setBackground(new java.awt.Color(255, 255, 255));
        sept.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        sept.setText("September");
        sept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septActionPerformed(evt);
            }
        });

        oct.setBackground(new java.awt.Color(255, 255, 255));
        oct.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        oct.setText("October");
        oct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octActionPerformed(evt);
            }
        });

        nov.setBackground(new java.awt.Color(255, 255, 255));
        nov.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        nov.setText("November");
        nov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novActionPerformed(evt);
            }
        });

        dec.setBackground(new java.awt.Color(255, 255, 255));
        dec.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        dec.setText("December");
        dec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decActionPerformed(evt);
            }
        });

        monthsHeading.setFont(new java.awt.Font("Raavi", 1, 35)); // NOI18N
        monthsHeading.setForeground(new java.awt.Color(255, 255, 255));
        monthsHeading.setText("Months :- ");
        monthsHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        monthsHeading.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout monthPanelLayout = new javax.swing.GroupLayout(monthPanel);
        monthPanel.setLayout(monthPanelLayout);
        monthPanelLayout.setHorizontalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthsHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nov, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(july, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(june, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(may, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(april, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(march, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        monthPanelLayout.setVerticalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthsHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(feb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(march, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(april, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(may, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(june, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(july, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aug, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nov, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        mainPanel.setBackground(new java.awt.Color(51, 0, 51));

        datesPanel.setBackground(new java.awt.Color(51, 0, 51));
        datesPanel.setForeground(new java.awt.Color(51, 0, 51));
        datesPanel.setPreferredSize(new java.awt.Dimension(451, 411));

        javax.swing.GroupLayout datesPanelLayout = new javax.swing.GroupLayout(datesPanel);
        datesPanel.setLayout(datesPanelLayout);
        datesPanelLayout.setHorizontalGroup(
            datesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        datesPanelLayout.setVerticalGroup(
            datesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        monthLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 70)); // NOI18N
        monthLabel.setForeground(new java.awt.Color(255, 255, 255));
        monthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        english.setText("English");
        english.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishActionPerformed(evt);
            }
        });

        hindi.setText(" हिंदी");
        hindi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hindiActionPerformed(evt);
            }
        });

        punjabi.setFont(new java.awt.Font("Raavi", 0, 14)); // NOI18N
        punjabi.setText(" ਪੰਜਾਬੀ");
        punjabi.setAlignmentY(0.0F);
        punjabi.setBorderPainted(false);
        punjabi.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        punjabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punjabiActionPerformed(evt);
            }
        });

        realTimePanel.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout realTimePanelLayout = new javax.swing.GroupLayout(realTimePanel);
        realTimePanel.setLayout(realTimePanelLayout);
        realTimePanelLayout.setHorizontalGroup(
            realTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        realTimePanelLayout.setVerticalGroup(
            realTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Choose Year ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(monthLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(english, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hindi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(punjabi, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(realTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(yearBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(realTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hindi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(punjabi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(datesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(monthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(monthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int getq(int x)
    {
        switch(x)
        {
            case 0:
                return 0;
            case 60:
                return 1;
            case 120:
                return 2;
            case 180:
                return 3;
            case 240:
                return 4;
            case 300:
                return 5;
            case 360:
                return 6;
            default:
                return 0;
                
        }
    }
    
    int getx(String day)
    {
        switch(day)
        {
            case "Mon":
                return 0;
            case "Tue":
                return 60;
            case "Wed":
                return 120;
            case "Thu":
                return 180;
            case "Fri":
                return 240;
            case "Sat":
                return 300;
            case "Sun":
                return 360;
            default :
                return 0;
        }
    }
    
    public void backActionPerformed(java.awt.event.ActionEvent evt,int m){
        switch (m) {
            case 0:
                jan.doClick();
                break;
            case 1:
                feb.doClick();
                break;
            case 2:
                march.doClick();
                break;
            case 3:
                april.doClick();
                break;
            case 4:
                may.doClick();
                break;
            case 5:
                june.doClick();
                break;
            case 6:
                july.doClick();
                break;
            case 7:
                aug.doClick();
                break;
            case 8:
                sept.doClick();
                break;
            case 9:
                oct.doClick();
                break;
            case 10:
                nov.doClick();
                break;
            case 11:
                dec.doClick();
                break;
            default:
                break;
        }
        
    }
    
    String getDateHindi(int n)
    {
        String datesHindi[] = {"०", "१", "२", "३", "४", "५", "६", "७", "८", "९"};
        if(n<10)
        {
            return datesHindi[n];
        }
        else if(n>=10)
        {
            return datesHindi[n/10]+datesHindi[n%10];
        }
        return "";
    }
    String getDatePunjabi(int n)
    {
        String datesPunjabi[] = {"੦", "੧", "੨", "੩", "੪", "੫", "੬", "੭", "੮", "੯"};
        if(n<10)
        {
            return datesPunjabi[n];
        }
        else if(n>=10)
        {
            return datesPunjabi[n/10]+datesPunjabi[n%10];
        }
        return "";
    }
    private void septActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 9, language);
        switch (language) {
            case "english":
                monthLabel.setText("September");
                break;
            case "hindi":
                monthLabel.setText("सितंबर");
                break;
            case "punjabi":
                monthLabel.setText("ਸਤੰਬਰ");
                break;
            default:
                break;
        }
        tables(30,8);
    }//GEN-LAST:event_septActionPerformed

    private void mayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 5, language);
        switch (language) {
            case "english":
                monthLabel.setText("May");
                break;
            case "hindi":
                monthLabel.setText("मई");
                break;
            case "punjabi":
                monthLabel.setText("ਮਈ");
                break;
            default:
                break;
        }
        tables(31,4);
    }//GEN-LAST:event_mayActionPerformed

    private void janActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janActionPerformed
        R();//remove all ,revalidate ,repaint
//        (new changeButtonText()).changeLabelText(monthLabel, 1, language);
        switch (language) {
            case "english":
                monthLabel.setText("January");
                break;
            case "hindi":
                monthLabel.setText("जनवरी");
                break;
            case "punjabi":
                monthLabel.setText("ਜਨਵਰੀ");
                break;
            default:
                break;
        }
        tables(31,0);
    }//GEN-LAST:event_janActionPerformed

    private void febActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_febActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 2, language);
        switch (language) {
            case "english":
                monthLabel.setText("February");
                break;
            case "hindi":
                monthLabel.setText("फ़रवरी");
                break;
            case "punjabi":
                monthLabel.setText("ਫ਼ਰਵਰੀ");
                break;
            default:
                break;
        }
        tables(29,1);
    }//GEN-LAST:event_febActionPerformed

    private void marchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marchActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 3, language);
        switch (language) {
            case "english":
                monthLabel.setText("March");
                break;
            case "hindi":
                monthLabel.setText("मार्च");
                break;
            case "punjabi":
                monthLabel.setText("ਮਾਰਚ");
                break;
            default:
                break;
        }
        tables(31,2);
    }//GEN-LAST:event_marchActionPerformed

    private void aprilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprilActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 4, language);
        switch (language) {
            case "english":
                monthLabel.setText("April");
                break;
            case "hindi":
                monthLabel.setText("अप्रैल");
                break;
            case "punjabi":
                monthLabel.setText("ਅਪ੍ਰੈਲ");
                break;
            default:
                break;
        }
        tables(30,3);
    }//GEN-LAST:event_aprilActionPerformed

    private void juneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juneActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 6, language);
        switch (language) {
            case "english":
                monthLabel.setText("June");
                break;
            case "hindi":
                monthLabel.setText("जून");
                break;
            case "punjabi":
                monthLabel.setText("ਜੂਨ");
                break;
            default:
                break;
        }
        tables(30,5);
    }//GEN-LAST:event_juneActionPerformed

    private void julyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_julyActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 7, language);
        switch (language) {
            case "english":
                monthLabel.setText("July");
                break;
            case "hindi":
                monthLabel.setText("जुलाई");
                break;
            case "punjabi":
                monthLabel.setText("ਜੁਲਾਈ");
                break;
            default:
                break;
        }
        tables(31,6);
    }//GEN-LAST:event_julyActionPerformed

    private void augActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_augActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 8, language);
        switch (language) {
            case "english":
                monthLabel.setText("August");
                break;
            case "hindi":
                monthLabel.setText("अगस्त");
                break;
            case "punjabi":
                monthLabel.setText("ਅਗਸਤ");
                break;
            default:
                break;
        }
        tables(31,7);
    }//GEN-LAST:event_augActionPerformed

    private void octActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octActionPerformed
        R();//remove all ,revalidate ,repaint 
//       (new changeButtonText()).changeLabelText(monthLabel, 10, language);
        switch (language) {
            case "english":
                monthLabel.setText("October");
                break;
            case "hindi":
                monthLabel.setText("अक्टूबर");
                break;
            case "punjabi":
                monthLabel.setText("ਅਕਤੂਬਰ");
                break;
            default:
                break;
        }
        tables(31,9);
    }//GEN-LAST:event_octActionPerformed

    private void novActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 11, language);
        switch (language) {
            case "english":
                monthLabel.setText("November");
                break;
            case "hindi":
                monthLabel.setText("नवंबर");
                break;
            case "punjabi":
                monthLabel.setText("ਨਵੰਬਰ");
                break;
            default:
                break;
        }
        tables(30,10);
    }//GEN-LAST:event_novActionPerformed

    private void decActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decActionPerformed
        R();//remove all ,revalidate ,repaint 
//        (new changeButtonText()).changeLabelText(monthLabel, 12, language);
        switch (language) {
            case "english":
                monthLabel.setText("December");
                break;
            case "hindi":
                monthLabel.setText("दिसंबर");
                break;
            case "punjabi":
                monthLabel.setText("ਦਸੰਬਰ");
                break;
            default:
                break;
        }
        tables(31,11);
    }//GEN-LAST:event_decActionPerformed

    private void englishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishActionPerformed
        language = "english";
        if(xyz >0)
        {
            changeButtonText change = new changeButtonText();
            change.changeButtonTextToEnglish(back,monthsHeading,jan,feb,march,april,may,june,july,aug,sept,oct,nov,dec);
        }
        xyz++;
        datesPanel.removeAll();
        jan.doClick();
        monthPanel.revalidate();
        monthPanel.repaint();
        monthLabel.revalidate();
        monthPanel.repaint();
    }//GEN-LAST:event_englishActionPerformed

    private void hindiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hindiActionPerformed
        language = "hindi";
        changeFont change2 = new changeFont();
        change2.changeFontToHindi(back,monthLabel,monthsHeading,jan,feb,march,april,may,june,july,aug,sept,oct,nov,dec);
        
        changeButtonText change = new changeButtonText();
        change.changeButtonTextToHindi(back,monthsHeading,jan,feb,march,april,may,june,july,aug,sept,oct,nov,dec);
        
        
        datesPanel.removeAll();
        
        jan.doClick();
        monthPanel.revalidate();
        monthPanel.repaint();
        monthLabel.revalidate();
        monthPanel.repaint();
        
    }//GEN-LAST:event_hindiActionPerformed

    private void punjabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punjabiActionPerformed
        language = "punjabi";
        changeFont change2 = new changeFont();
        change2.changeFontToPunjabi(back,monthLabel,monthsHeading,jan,feb,march,april,may,june,july,aug,sept,oct,nov,dec);
        
        changeButtonText change = new changeButtonText();
        change.changeButtonTextToPunjabi(back,monthsHeading,jan,feb,march,april,may,june,july,aug,sept,oct,nov,dec);
        
        
        datesPanel.removeAll();
        
        jan.doClick();
        monthPanel.revalidate();
        monthPanel.repaint();
        monthLabel.revalidate();
        monthPanel.repaint();
    }//GEN-LAST:event_punjabiActionPerformed

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
//        jan.doClick();
    }//GEN-LAST:event_yearBoxActionPerformed
    
    void R()
    {
        mainPanel.remove(back);
        mainPanel.revalidate();
        mainPanel.repaint();
        datesPanel.removeAll();
        datesPanel.revalidate();
        datesPanel.repaint();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(() -> {
            new Calender().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton april;
    public javax.swing.JButton aug;
    public javax.swing.JPanel datesPanel;
    public javax.swing.JButton dec;
    public javax.swing.JButton english;
    public javax.swing.JButton feb;
    public javax.swing.JButton hindi;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JButton jan;
    public javax.swing.JButton july;
    public javax.swing.JButton june;
    public javax.swing.JPanel mainPanel;
    public javax.swing.JButton march;
    public javax.swing.JButton may;
    public javax.swing.JLabel monthLabel;
    public javax.swing.JPanel monthPanel;
    public javax.swing.JLabel monthsHeading;
    public javax.swing.JButton nov;
    public javax.swing.JButton oct;
    public javax.swing.JButton punjabi;
    public javax.swing.JPanel realTimePanel;
    public javax.swing.JButton sept;
    public javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
