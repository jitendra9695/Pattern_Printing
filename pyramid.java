package Pattern;

public class pyramid {
    public static void main(String args[])
    {
        int i, j, m=4, n=4;
        for(i=1; i<=m; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i>=j)
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
