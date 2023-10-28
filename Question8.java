public class Question8 {
    public static void main(String args[])
    {
        System.out.println("Bharat Prajapati \n Roll no : 3058" );
        int[][] arr  = 
        {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
        int[][] arr2 = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
        int[][] finalans = new int[arr.length][arr2.length];
        for(int i =0;i < arr.length;i++)
        {
            for(int j= 0;j<arr2.length;j++)
            {
                finalans[i][j] = arr[i][j] + arr2[i][j];

            }
        }
        for(int i=0 ; i< arr.length;i++)
        {
            for(int j=0 ; j< arr2.length;j++)
            {
                System.out.print(finalans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
