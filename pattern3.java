// done a pattern

public class pattern3 {
    public static void main(String[] args) {
        int n = 8;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || j==n-1 || i==j || i+j==n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
