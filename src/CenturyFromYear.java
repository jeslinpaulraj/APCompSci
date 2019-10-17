public class CenturyFromYear
{
    public static void main(String[]ploopy)
    {

        century(2019);
    }
    public static int century(int number)
    {

        int a = number%10;
        while (a>0 && a<100)
        {
            a = number%10;
        }

        if (a != 0)
        {
            return (1+a);//1+
        }
        else
            return a;

    }
}