package Pattern ;
public class butterfly {
    public static void main(String args[])
    {
        int i, j, space, n=4;
        for(i=1; i<=n; i++)
        {
          for(j=1; j<=i; j++)
          {
           System.out.print("*");
          }
          space=2*(n-i);
          for(j=1; j<=space; j++)
          {
           System.out.print(" ");
          }
          for(j=1; j<=i; j++)
          {
           System.out.print("*");
          }
          System.out.print("\n");
        }
        for(i=1; i<=n; i++)
        {
            for(j=i; j<=n; j++)
            {
                System.out.print("*");
            }
            space=2*(i-1);
            for(j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(j=i; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
