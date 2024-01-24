package Pattern;

public class numpyramid {
    public static void main(String args[])
    {
        int i, j, space, n=5;
        for(i=1; i<=n; i++)
        {
            space=n-i;
            for(j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
    
}
