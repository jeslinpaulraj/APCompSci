public class RecursiveTestReviewExercises
{
    public static void main(String[]args)
    {
        RecursiveTestReviewExercises pi = new RecursiveTestReviewExercises();
    }//main

    RecursiveTestReviewExercises()
    {
        System.out.println(4*computePi(1));
    }


    public static double computePi(double x)
    {
        if (x >= 10000)
            return x;
        else
            return 1/x - (1)/(computePi(x+2));
    }//Pi

}//class

