package recursive;

public class FibonacciRecursiveWithMemo {

  long [] resluts;

  public long calculate(int n) {
    if(n < 0) {
      return 0;
    }

    if(resluts == null) {
      resluts = new long[n + 1];
    }

    if(resluts[n] == 0) {
      if(n < 2 ) {
        resluts[n] = n;
      } else {
        resluts[n] = calculate(n -1) + calculate(n -2);
      }
    }
    return resluts[n];
  }
}
