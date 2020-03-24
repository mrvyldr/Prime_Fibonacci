import java.util.Scanner;



public class Main
{
    public static boolean isItFibonacci(int f){
        int previousNumber = 0;
        int nextNumber = 1;

        while(nextNumber <= f)
        {
            if(nextNumber == f){
                return true;
            }else{
                int sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;}

        }
        return false;
    }

    public static boolean isItPrime(int n){
        boolean flag=false;

        if (n <= 1){
            flag = false;
            return flag;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                flag=false;
                return flag;
            }
            else{
                flag = true;
                return flag;
            }
        }
        return flag;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int variable = scan.nextInt();

        if(isItPrime(variable) == true & isItFibonacci(variable) == true){
            System.out.println("The given number "+ variable + " is a prime number and exits in fibonacci.");
        }else
            System.out.println("The given number "+ variable + " is not provided by the codition!");



    }
}
