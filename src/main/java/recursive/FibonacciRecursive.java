package recursive;

public class FibonacciRecursive {
  public static int calculate(int n) {
    if(n < 1) {
      return 0;
    }

    if(n < 3) {
      return 1;
    }

    return calculate(n-2) + calculate(n -1);
  }
}
