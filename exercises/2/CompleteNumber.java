public class CompleteNumber {

    public static boolean complete_number(int num)
    {
        int sum=0;
        for (int i=1; i<=num-1; i++)
            if(num%i==0)
                sum+=i;

            if(sum==num)
                return true;
            else
                return false;
    }

    public static void main(String[] args) {

        for(int i=1; i<=10000; i++)
            if(complete_number(i))
                System.out.println(i);

    }
}
