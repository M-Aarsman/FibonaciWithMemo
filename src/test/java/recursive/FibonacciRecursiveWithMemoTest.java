package recursive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursiveWithMemoTest {
  @Test
  public void negativeNumberShouldReturnZero() {
    //given
    int n = -2;
    FibonacciRecursiveWithMemo fibonacci = new FibonacciRecursiveWithMemo();
    //when
    long result = fibonacci.calculate(n);
    //then
    assertEquals(0, result);
  }

  @Test
  public void zeroShouldReturnZero() {
    //given
    int n = 0;
    FibonacciRecursiveWithMemo fibonacci = new FibonacciRecursiveWithMemo();
    //when
    long result = fibonacci.calculate(n);
    //then
    assertEquals(0, result);
  }

  @Test
  public void shouldReturnProperValue() {
    //given
    int n = 55;
    FibonacciRecursiveWithMemo fibonacci = new FibonacciRecursiveWithMemo();
    //when
    long result = fibonacci.calculate(n);
    //then
    assertEquals(139583862445L, result);
  }

}