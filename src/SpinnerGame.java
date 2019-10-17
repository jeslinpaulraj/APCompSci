public class SpinnerGame
{
    public static void main(String[]args)
    {

        SpinnerGame spinnerGame = new SpinnerGame();

        int s2_1 = spinnerGame.spin(2);
        int s5_1 = spinnerGame.spin();
        int s5_2 = spinnerGame.spin();
        int s4 = spinnerGame.spin(4);

        int s5_3 = spinnerGame.spin();
        int s10 = spinnerGame.spin(10);

        boolean win = false;


		if (spinnerGame.isEven(s2_1))
		{

			int low = spinnerGame.lowest(s5_1, s5_2);

			int great = 0;

			if (spinnerGame.greatestBoolean(s5_1, s5_2))
			    great = s5_1;
			else
			    great = s5_2;

			if (spinnerGame.product(low,s4) >= spinnerGame.product(great,great))
				win = true;
			else
				win = false;
		}

		else
		{

			int g1 = spinnerGame.greatest(s5_1, s5_2, s5_3);
			int g2 = 0;
			if (g1 == s5_1)
			    g2 = spinnerGame.greatest(s5_2,s5_3);
            else if (g1 == s5_2)
                g2 = spinnerGame.greatest(s5_1,s5_3);
            else if (g1 == s5_3)
                g2 = spinnerGame.greatest(s5_1,s5_2);


            int x = spinnerGame.lowest(s5_1, s5_2, s5_3);

            if (spinnerGame.product(g1,g2) >= spinnerGame.product(x,s10))
			    	win = true;
            else
				    win = false;
		}

        spinnerGame.result(win);
		spinnerGame.printSpinners(s10, s2_1, s5_1, s4, s5_2, s5_3);


    }//main

    public SpinnerGame()
    {

    }

    public  int spin()
    {
        return (int)((Math.random()*5)+1);
    }
    public  int spin(int n)
    {
        return (int)((Math.random()*n)+1);
    }

    public  int product(int a, int b)
    {
        return (a*b);
    }

    public  boolean isEven(int s1)
    {
        boolean even = false;
        if (s1%2 == 0)
            even = true;
        else
            even = false;
        return even;
    }

    public  int lowest(int a, int b)
    {
        if (a<b)
            return a;
        else
            return b;
    }

    public  int lowest(int a, int b, int c)
    {
        if (a<b)
        {
            if (a < c)
            {
                return a;
            }//if
            else if (b < a)
            {
                if (b < c)
                {
                    return b;
                }//if
            }//else if
        }

            return c;


    }

    public int greatest(int a, int b)
    {
        if (a>b)
            return a;
        else
            return b;

    }

    public boolean greatestBoolean(int a, int b)
    {
        boolean firstGreat = false;
        if (a>b)
            firstGreat = true;
        else
            firstGreat = false;
        return firstGreat;
    }

    public  int greatest(int a, int b, int c)
    {
        if (a>b)
        {
            if (a > c)
            {
                return a;
            }//if
            else if (b > a)
            {
                if (b > c)
                {
                    return b;
                }//if
            }//else if
        }

        return c;


    }

    public void result(boolean win)
    {
        if (win)
        {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("You Lose.");
        }
    }

    public void printSpinners(int s10, int s2, int s5_1, int s4, int s5_2, int s5_3)
    {
        System.out.println("2 Spot Spinner: "+s2+"\n");

        System.out.println("5 Spot Spinner #1: "+s5_1);
        System.out.println("5 Spot Spinner #2: "+s5_2);
        System.out.println("4 Spot Spinner: "+s4+"\n");

        System.out.println("5 Spot Spinner #3: "+s5_3);
        System.out.println("10 Spot Spinner: "+s10);

    }



}//class


