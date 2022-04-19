/**
 * Recursion
 *
 * Recursion is essentially just calling a function in itself until a certain
 * value or expected response is returned.
 *
 * In this example, we'll use factorials as an example. Factorials (in case you
 * weren't aware already) are mathematically represented by `N!` where N is a
 * positive integer, and ! is the factorial operator.
 *
 * Take `4!`, this is equal to 4 x 3 x 2 x 1, or 24
 *
 * So how do we implement this in code?  See Below
 * 
 * Also, see https://www.cs.usfca.edu/~galles/visualization/RecFact.html for a cool visualization
 */


class Main {

  /**
   * Iteratively finds the factorial of N
   *
   * @param n a positive integer
   * 
   * @return factorial of N
   */
  public static long iterativeFactorial(long n) {
    long result = 1;
    for (long i = 2; i<= n; i+= 1) {
      result *= i;
    }

    return result;
  }


    /**
   * Recursively finds the factorial of N
   *
   * @param N a positive integer
   * 
   * @return factorial of N
   */
  public static long recursiveFactorial(long n) {
    /**
     * Halting Condition
     * Every recusive method needs an end point, or it will loop infinitly.
     * 
     * Since the factorial operator is only defined for positive integers (and zero), we will stop when we get to 0
     * 
     */
    if (n <= 1) {
      // notice that the default value of product is set to 1, so that 1! = 1, and
      // that N*1 = N
      return 1;
    } else {
      /**
       * If N isn't equal to zero, there's more numbers to multiply We pass N-1 into
       * `recursiveFactorial` as N, as well as the product, which is just product*N.
       */
      return n*recursiveFactorial(n - 1);
    }
  }

  public static void main(String[] args) {
   
    System.out.println(iterativeFactorial(4));
    System.out.println(recursiveFactorial(4));

  }
}

// Still confused? There's a lengthy explanation below

/**
 * Let's take the driver code/example there, finding the factorial of 4.
 *
 * We start off by passing 4 into `recursiveFactorial`, 4 !== 1,  so we pass 4-1, which is 3, into recursiveFactorial
 *
 * `recursiveFactorial` is called again with a parameter of n = 3.
 * N != 1, which means we pass N-1, which is 2, into `recursiveFactorial`
 * 
 * * `recursiveFactorial` is called again with a parameter of n = 2.
 * N != 1, which means we pass N-1, which is 1, into `recursiveFactorial`
 * 
 * * `recursiveFactorial` is called again with a parameter of n = 1.
 * N == 1, which means we return a value of 1 to the previous verison of `recursiveFactorial`
 * 
 * the returned value is multipled by 2, 2*1=2, so a value of 2 is returned to the previous verison of `recursiveFactorial`
 * 
 * the returned value is multipled by 3, 2*3=6, so a value of 6 is returned to the previous verison of `recursiveFactorial`
 * 
 * the returned value is multipled by 4, 6*4=24, so a value of 24 is returned to the previous verison of `recursiveFactorial`
 * 
 * The value of 24 is printed out on the screen
  */
 
 
 
  /*
 Example Recursion Program Retreived From: https://github.com/johnfraserss/ICS4U/tree/master/examples/recursion
On Sept. 9, 2021
Modifed by C. Brooks-Prenger
*/
