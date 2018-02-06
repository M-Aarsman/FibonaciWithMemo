package streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciStreamsTest {
  @Test
  public void negativeNumberShouldReturnZero() {
    //given
    int n = -2;
    //when
    long result = FibonacciStreams.calculate(n);
    //then
    assertEquals(0, result);
  }

  @Test
  public void zeroShouldReturnZero() {
    //given
    int n = 0;
    //when
    long result = FibonacciStreams.calculate(n);
    //then
    assertEquals(0, result);
  }

  @Test
  public void shouldReturnProperValue() {
    //given
    int n = 10;
    //when
    long result = FibonacciStreams.calculate(n);
    //then
    assertEquals(55, result);
  }
}