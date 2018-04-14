
public class getDateValue extends Calender{
    
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
}


