class Solution001
{
    public static void main(String[] args)
    {
        Solution001();
    }

    public Solution001()
    {
        int total = 0;

        for(int i = 1; i <= 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
                total += i;
        }

        System.out.println("The sum of the all the multiples of 3 or 5 below 1000 is: " + total);
    }
}