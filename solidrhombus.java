package Pattern;

public class solidrhombus {
    public static void main(String args[])
    {
        int i, j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=9; j++)
            {
                if(i+j<=5 || i+j>=11)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        //two DIFFERENT LOGIC 
        int n=5, space;
        for(i=1; i<=n; i++)
        {
            space=n-i;
            for(j=1;j<=space; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
