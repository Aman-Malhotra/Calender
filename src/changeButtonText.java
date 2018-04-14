import javax.swing.*;
// will change button text on reload

// changes the text of the months on the buttons 
// changes the text on the month label and the text of the months heading 


class changeButtonText extends Calender
{
    
    /*void changeLabelText(JLabel monthLabel,int n , String language)
    {
        if(language.equals("english"))
        {
            changeLabelTextToEnglish(monthLabel,n);
        }
        else if(language.equals("hindi"))
        {
            changeLabelTextToHindi(monthLabel,n);
        }
        else if(language.equals("punjabi"))
        {
            changeLabelTextToPunjabi(monthLabel,n);
        }
        
    }*/
    
    // for hindi 
    /*void changeLabelTextToHindi(JLabel monthLabel,int n)
    {
        switch(n)
        {
            case 1:
                monthLabel.setText("जनवरी");
                break;
            case 2:
                monthLabel.setText("फ़रवरी");
                break;
            case 3:
                monthLabel.setText("मार्च");
                break;
            case 4:
                monthLabel.setText("अप्रैल");
                break;
            case 5:
                monthLabel.setText("मई");
                break;
            case 6:
                monthLabel.setText("जून");
                break;
            case 7:
                monthLabel.setText("जुलाई");
                break;
            case 8:
                monthLabel.setText("अगस्त");
                break;
            case 9:
                monthLabel.setText("सितंबर");
                break;
            case 10:
                monthLabel.setText("अक्टूबर");
                break;
            case 11:
                monthLabel.setText("नवंबर");
                break;
            case 12:
                monthLabel.setText("दिसंबर");
                break;
            
        }
    }*/
    //for hindi
    void changeButtonTextToHindi(JButton back,JLabel monthsHeading,JButton jan,JButton feb,JButton march,JButton april,JButton may,JButton june,JButton july,JButton aug,JButton sept,JButton oct,JButton nov,JButton dec)
    {
        back.setText("वापस");
        monthsHeading.setText(" महीने  :-");
        jan.setText("जनवरी");
        feb.setText("फ़रवरी");
        march.setText("मार्च");
        april.setText("अप्रैल");
        may.setText("मई");
        june.setText("जून");
        july.setText("जुलाई");
        aug.setText("अगस्त");
        sept.setText("सितंबर");
        oct.setText("अक्टूबर");
        nov.setText("नवंबर");
        dec.setText("दिसंबर");
    }
    
    
    // for english 
    void changeButtonTextToEnglish(JButton back,JLabel monthsHeading,JButton jan,JButton feb,JButton march,JButton april,JButton may,JButton june,JButton july,JButton aug,JButton sept,JButton oct,JButton nov,JButton dec)
    {
        back.setText("BACK");
        monthsHeading.setText("Months :-");
        jan.setText("January");
        feb.setText("February");
        march.setText("March");
        april.setText("April");
        may.setText("May");
        june.setText("June");
        july.setText("July");
        aug.setText("August");
        sept.setText("September");
        oct.setText("October");
        nov.setText("November");
        dec.setText("December");
        
    }
    //for punjabi
    void changeButtonTextToPunjabi(JButton back,JLabel monthsHeading,JButton jan,JButton feb,JButton march,JButton april,JButton may,JButton june,JButton july,JButton aug,JButton sept,JButton oct,JButton nov,JButton dec)
    {
        back.setText("ਵਾਪਸ");
        monthsHeading.setText(" ਮਹੀਨੇ :-");
        jan.setText("ਜਨਵਰੀ");
        feb.setText("ਫ਼ਰਵਰੀ");
        march.setText("ਮਾਰਚ");
        april.setText("ਅਪ੍ਰੈਲ");
        may.setText("ਮਈ");
        june.setText("ਜੂਨ");
        july.setText("ਜੁਲਾਈ");
        aug.setText("ਅਗਸਤ");
        sept.setText("ਸਤੰਬਰ");
        oct.setText("ਅਕਤੂਬਰ");
        nov.setText("ਨਵੰਬਰ");
        dec.setText("ਦਸੰਬਰ");
    }
    /*void changeLabelTextToEnglish(JLabel monthLabel,int n)
    {
        switch(n)
        {
            case 1:
                monthLabel.setText("January");
                break;
            case 2:
                monthLabel.setText("February");
                break;
            case 3:
                monthLabel.setText("March");
                break;
            case 4:
                monthLabel.setText("April");
                break;
            case 5:
                monthLabel.setText("May");
                break;
            case 6:
                monthLabel.setText("June");
                break;
            case 7:
                monthLabel.setText("July");
                break;
            case 8:
                monthLabel.setText("August");
                break;
            case 9:
                monthLabel.setText("September");
                break;
            case 10:
                monthLabel.setText("October");
                break;
            case 11:
                monthLabel.setText("November");
                break;
            case 12:
                monthLabel.setText("December");
                break;
            
        }
    }
    
    // for punjabi 
    void changeLabelTextToPunjabi(JLabel monthLabel,int n)
    {
        switch(n)
        {
            case 1:
                monthLabel.setText("ਜਨਵਰੀ");
                break;
            case 2:
                monthLabel.setText("ਫ਼ਰਵਰੀ");
                break;
            case 3:
                monthLabel.setText("ਮਾਰਚ");
                break;
            case 4:
                monthLabel.setText("ਅਪ੍ਰੈਲ");
                break;
            case 5:
                monthLabel.setText("ਮਈ");
                break;
            case 6:
                monthLabel.setText("ਜੂਨ");
                break;
            case 7:
                monthLabel.setText("ਜੁਲਾਈ");
                break;
            case 8:
                monthLabel.setText("ਅਗਸਤ");
                break;
            case 9:
                monthLabel.setText("ਸਤੰਬਰ");
                break;
            case 10:
                monthLabel.setText("ਅਕਤੂਬਰ");
                break;
            case 11:
                monthLabel.setText("ਨਵੰਬਰ");
                break;
            case 12:
                monthLabel.setText("ਦਸੰਬਰ");
                break;
            
        }
    }*/
    
} 