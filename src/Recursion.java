public class Recursion {
    public static void main(String[] Args)
    {
        System.out.println("The factorial of 6 is: " + fact(6));
        System.out.println("The factorial of 4 is: " + fact(4));
    }

    static int fact(int i)
    {
        if (i==1)
            return 1;
        else return(i*fact(i-1));
    }
}
