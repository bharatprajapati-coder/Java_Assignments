public class Question6 {
    public static void main(String args[])
    {
        System.out.println("Bharat prajapati \n");
        System.out.println("roll no : 3058");
        int n = 7;
        int originaln = n;
        n = 2*n;
        for(int i = 0;i<=n;i++)
        {
            for(int k=0;k<=n;k++)
            {
                int Index = originaln - Math.min(Math.min(i, k) , Math.min(n-i , n-k));
                System.out.print(Index + " ");
            }
            System.out.println();
        }
        
    }
}
