package Pattern;

public class diamond {
    public static void main(String args[])
    {
        int i, j, space, n=4;
        for(i=1; i<=n; i++)
        {
            space=n-i;
            for(j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=n; i>=1; i--)
        {
           space=n-i;
           for(j=1; j<=space; j++)
           {
            System.out.print(" ");
           }
           for(j=1; j<=2*i-1; j++)
           {
            System.out.print("*");
           }
           System.out.print("\n");
        }
    }
    
}
