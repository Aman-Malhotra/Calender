import javax.swing.*;

class addYears extends Calender 
{
    
    addYears (JComboBox yearBox)
    {
        for(int x = 1800;x<=2017;x++)
        {
//            yearBox.addItem(new ComboItem(Integer.toString(x),Integer.toString(y)));
            yearBox.addItem(Integer.toString(x));
        }
    }
}
//class ComboItem
//{
//    private String key;
//    private String value;
//
//    public ComboItem(String key, String value)
//    {
//        this.key = key;
//        this.value = value;
//    }
//
//    @Override
//    public String toString()
//    {
//        return key;
//    }
//
//    public String getKey()
//    {
//        return key;
//    }
//
//    public String getValue()
//    {
//        return value;
//    }
//}