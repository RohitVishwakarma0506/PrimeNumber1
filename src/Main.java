import java.util.Scanner;

class PrimeNumber{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number ");
            int num = sc.nextInt();

            int Count = 0;

            for(int i=1; i<=num; i++)
            {
                if(num % i == 0)
                {
                    Count++;
                }
            }
            if(Count == 2)
            {
                System.out.println("it is prime Number");
            }else {
                System.out.println("Not prime number");
            }
        }
}