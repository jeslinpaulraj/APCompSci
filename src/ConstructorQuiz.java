import java.lang.Math;
public class ConstructorQuiz
{
    public ConstructorQuiz()
    {

    }

    public static void main(String[]args)
    {
        ConstructorQuiz x = new ConstructorQuiz();

        //10
		System.out.println("\nOutput for Task 10: ");

		int a = 0;
		for (int i = 4; i >=0; i--)
		{
			a=4-i;
			for (int j = i; j >=0; j--)
			{
				if (a%2 == 0)
					System.out.print(a+""+a);
				else
					System.out.print(a);
				a++;
			}

			System.out.println();

		}//outer for

        //11
        System.out.println("\nOutput for Task 11: ");

        int z = 0;
        for(int i = 0; i <4; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                if ((j-i)%2 == 0)
                    System.out.print("! ");
                else
                    System.out.print("+ ");

            }
            System.out.println();
            z++;
        }


        //12

        System.out.println("\nOutput for Task 12: ");

        int b = (int)(Math.random()*10)+1;
        int c = (int)(Math.random()*10)+1;

        System.out.println("b + c = "+(b+c));
        System.out.println("b - c = "+(b-c));
        System.out.println("b * c = "+(b*c));
        System.out.println("b / c = "+(b/c));



    }//main

}//class

