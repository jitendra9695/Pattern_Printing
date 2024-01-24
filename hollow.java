package Pattern;
public class hollow {
    public static void main(String agrs [])
    {
        int i, j, m=4, n=5;
        for(i=1; i<=m; i++)
        {
            for(j=1; j<=n; j++)
            {
                if( i==1||i==m||j==1||j==n )
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
}
