import java.util.Scanner;

/**
 * Java program to calculate and print Fibonacci number
 */
public class FibCalc {

  public static int fibRecursion(int n) {
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
  public static int fibonacci2(int number){
      if(number == 1 || number == 2){
          return 1;
      }
      int fibo1=1, fibo2=1, fibonacci=1;
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
        System.out.println("Enter integer value for how many Fibonacci numbers to display: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series for  " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci2(i) +" ");
        }
        System.out.println();

        for(int i=1; i<=number; i++){
            System.out.print(fibRecursion(i) +" ");
        }


    }







}
