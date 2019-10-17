public class arrayQuizPractice
{
    public static void main(String []args)
        {
            int[] arr = new int[5];
            int[] arr2 = {1, 2, 3, 4, 5};

            int[][] arr3 = new int[5][6];
            int[][] arr4 = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};

            printArray(arr);
            printArray(arr2);
            printArrayTwoDim(arr3);
            printArrayTwoDim(arr4);

        }

        public static void printArray(int[] a)
        {
            for(int i = 0; i < a.length; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }//printArray

    public static void printArrayTwoDim(int[][]b)
    {
        for (int r = 0; r < b.length; r++)
        {
            for (int c = 0; c < b[r].length; c++)
            {
                System.out.print(b[r][c] + " ");
            }
            System.out.println();
        }
    }//2d print

}
