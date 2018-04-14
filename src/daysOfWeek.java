class daysOfWeek
{
    String daysNameEnglish(int day)
    {
        switch(day)
        {
            case 0:
                return "Mon";
//                return "<html>M<br>O<br>N<br>D<br>A<br>Y</html>";
            case 1:
                return "Tue";
//                return "<html>T<br>U<br>E<br>S<br>D<br>A<br>Y</html>";
            case 2:
                return "Wed";
//                return "<html>W<br>E<br>D<br>N<br>E<br>S<br>D<br>A<br>Y</html>";
            case 3:
                return "Thu";
//                return "<html>T<br>H<br>U<br>R<br>S<br>D<br>A<br>Y</html>";
            case 4:
                return "Fri";
//                return "<html>F<br>R<br>I<br>D<br>A<br>Y</html>";
            case 5:
                return "Sat";
//                return "<html>S<br>A<br>T<br>U<br>R<br>D<br>A<br>Y</html>";
            case 6:
                return "Sun";
//                return "<html>S<br>U<br>N<br>D<br>A<br>Y</html>";
            default :
                return "Error";
        }
        
    }
    
    String daysNameHindi(int day)
    {
        switch(day)
        {
            case 0:
                return "सोम";
//                return "<html>M<br>O<br>N<br>D<br>A<br>Y</html>";
            case 1:
                return "मंगल";
//                return "<html>T<br>U<br>E<br>S<br>D<br>A<br>Y</html>";
            case 2:
                return "बुध";
//                return "<html>W<br>E<br>D<br>N<br>E<br>S<br>D<br>A<br>Y</html>";
            case 3:
                return "गुरू";
//                return "<html>T<br>H<br>U<br>R<br>S<br>D<br>A<br>Y</html>";
            case 4:
                return "शुक्र";
//                return "<html>F<br>R<br>I<br>D<br>A<br>Y</html>";
            case 5:
                return "शनि";
//                return "<html>S<br>A<br>T<br>U<br>R<br>D<br>A<br>Y</html>";
            case 6:
                return "रवि";
//                return "<html>S<br>U<br>N<br>D<br>A<br>Y</html>";
            default :
                return "Error";
        }
        
    }
    
    String daysNamePunjabi(int day)
    {
        switch(day)
        {
            case 0:
                return "ਸੋਮ";
//                return "<html>M<br>O<br>N<br>D<br>A<br>Y</html>";
            case 1:
                return "ਮੰਗਲ";
//                return "<html>T<br>U<br>E<br>S<br>D<br>A<br>Y</html>";
            case 2:
                return "ਬੁੱਧ";
//                return "<html>W<br>E<br>D<br>N<br>E<br>S<br>D<br>A<br>Y</html>";
            case 3:
                return "ਵੀਰ";
//                return "<html>T<br>H<br>U<br>R<br>S<br>D<br>A<br>Y</html>";
            case 4:
                return "ਸ਼ੁੱਕਰ";
//                return "<html>F<br>R<br>I<br>D<br>A<br>Y</html>";
            case 5:
                return "ਸ਼ਨੀ";
//                return "<html>S<br>A<br>T<br>U<br>R<br>D<br>A<br>Y</html>";
            case 6:
                return "ਐਤ";
//                return "<html>S<br>U<br>N<br>D<br>A<br>Y</html>";
            default :
                return "Error";
        }
        
    }
}