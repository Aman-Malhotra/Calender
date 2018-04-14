import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class setDate extends Calender
{
    JButton back = new JButton();
    JButton table_buttons[][][]= new JButton[12][5][7];
    public void dateSet(String language, JLabel monthLabel, JPanel monthPanel, JPanel mainPanel, JPanel datesPanel, int total_days, int m)
    {
        System.out.println("9");
        int x= 0, y=0,day =1,n=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                int tempDay;
                tempDay = day;
                table_buttons[m][i][j]=new JButton();
                table_buttons[m][i][j].setBounds(x,y,50,50);
                
                getDateValue get = new getDateValue();
                String dateHindi = get.getDateHindi(day);
                String datePunjabi= get.getDatePunjabi(day);
                if(language.equals("english")){
                    table_buttons[m][i][j].setFont(new Font ("Tahoma",Font.BOLD, 15));
                    table_buttons[m][i][j].setText(day+"");
                }
                else if(language.equals("hindi")){
                    table_buttons[m][i][j].setFont(new Font ("Tahoma",Font.BOLD, 15));
                    table_buttons[m][i][j].setText(dateHindi);
                }
                else if (language.equals("punjabi")){
                    table_buttons[m][i][j].setFont(new Font ("Raavi",Font.BOLD, 15));
                    table_buttons[m][i][j].setText(day+"");
                }
                datesPanel.add(table_buttons[m][i][j]);
                table_buttons[m][i][j].addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if (e.getSource() instanceof JButton) 
                        {
                            mainPanel.add(back);
                            back.setText("<<<");
                            back.setBounds(0,100,50,40);
                            String tempMonth = monthLabel.getText();
//                            jLabel14.setText(datePunjabi+" "+tempMonth);
//                            dateLabel.setFont(new Font ("",Font.BOLD, 30));
                            if(language.equals("english")){
                                monthLabel.setText(tempDay+" "+tempMonth);
                            }
                            else if (language.equals("hindi")){
                                monthLabel.setText(dateHindi+" "+tempMonth);
                            }
                            else if (language.equals("punjabi")){
                                monthLabel.setText(datePunjabi+" "+tempMonth);
                            }
                            
                            back.addActionListener(new java.awt.event.ActionListener() 
                                {
                                    int count =0;
                                    public void actionPerformed(java.awt.event.ActionEvent evt) 
                                    {
                                        if(count == 0)
                                        {
                                            Calender cal = new Calender();
                                            cal.backActionPerformed(evt,m);
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
                x += 50;
                if(day == total_days)
                    break;
                day++;
            }
            y +=50;
            x=0;
        }
        day =0;
    }
}