package streams;

import java.util.stream.Stream;

public class FibonacciStreams {
  public static long calculate(int n) {

    if(n < 1) {
      return 0;
    }

    return Stream.iterate(new long[] {0, 1}, f -> new long[]{f[1], f[0] + f[1]})
        .limit(n)
        .skip(n -1)
        .findFirst()
        .get()[1];
  }
}
