package Pattern;

public class invertedpyrm {
    public static void main(String args[])
    {
        int i, j;
        for(i=1; i<=4; i++)
        {
            for(j=4; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
