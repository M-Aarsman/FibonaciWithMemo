package iterate;

public class FibonacciIterate {
  public static int calculate(int n) {
    if(n < 1) {
      return 0;
    }

    if(n < 3) {
      return 1;
    }

    int result = 1;
    int result_n1 = 1;
    for(int i = 3; i <= n; i++) {
      int sum = result + result_n1;
      result_n1 = result;
      result = sum;
    }

    return result;
  }
}
