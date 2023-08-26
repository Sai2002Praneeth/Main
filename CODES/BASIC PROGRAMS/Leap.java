class Leap
{
    public static void main(String args[])
    {
        int year=1500;
        boolean leap;
        System.out.println("Enter year: "+year);
        if(year%4==0)
        {
            if(year%400==0)
            {
                if(year%100==0)
                {
                    leap=true;
                }
                else
                {
                    leap=false;
                }
            }
            else
            {
                leap=true;
            }
            
        }
        else
        {
            leap=false;
        }
        if(leap)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is a not leap year");
        }
    }
}