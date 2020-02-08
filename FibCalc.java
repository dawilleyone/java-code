import java.util.Scanner;

/**
 * Java program to calculate and print Fibonacci number
 */
public class FibCalc {
public static long fibArray[]=new long[100];
  public static long fibMemo(int n) {
      long fibValue = 0;

      if(n==0 ){
        return 0;
      } else if(n==1){
        return 1;
      } else if(fibArray[n]!=0){
        return fibArray[n];
      } else {
        fibValue=fibMemo(n-1)+fibMemo(n-2);
        fibArray[n]=fibValue;
        return fibValue;
      }
  }

  public static long fibRecursion(int n) {
    // Calculate fibonacci with recursive call
    if (n == 0)
      return 0;
    if (n==1 || n == 2) {
      return 1;
    }
    return fibRecursion(n-2) + fibRecursion(n-1);


  }
  /*
   * Java program to calculate Fibonacci number using loop  Iteration.
   * @return Fibonacci number
   */
  public static long fibonacci2(int number){
      if(number == 1 || number == 2){
          return 1;
      }
      long fibo1=1, fibo2=1, fibonacci=1;
      for(int i= 3; i<= number; i++){

          //Fibonacci number is sum of previous two Fibonacci number
          fibonacci = fibo1 + fibo2;
          fibo1 = fibo2;
          fibo2 = fibonacci;

      }
      return fibonacci; //Fibonacci number

  }


  public static void main(String args[]) {

       //input to print Fibonacci series upto how many numbers
        System.out.println("Enter integer value for for the Finonnaci value to compute: ");
        int number = new Scanner(System.in).nextInt();
        long preTime = 0;
        long postTime = 0;


        //printing Fibonacci series upto number
        preTime=System.currentTimeMillis();
        System.out.println("Fibonacci series (for loop) for "+number+"th number : "+fibonacci2(number));
        postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));

        preTime=System.currentTimeMillis();
        System.out.println("Fibonacci series (recursion) for  "+number+"th number : "+fibRecursion(number));
        postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));

        preTime=System.currentTimeMillis();
        System.out.println("Fibonacci series (memoization) for  "+number+"th number : "+fibMemo(number));
        postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));

    }







}
