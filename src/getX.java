class getX extends Calender 
{
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
            case "Thurs":
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
}