package Pattern;

public class flyodtri {
    public static void main(String args[])
    {
        int i, j, num=1;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(num++ +" ");
            }
            System.out.print("\n");
        }
    }
    
}
