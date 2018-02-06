package iterate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciIterateTest {

  @Test
  public void negativeNumberShouldReturnZero() {
    //given
    int n = -2;
    //when
    int result = FibonacciIterate.calculate(n);
    //then
    assertEquals(0, result);
  }

  @Test
  public void zeroShouldReturnZero() {
    //given
    int n = 0;
    //when
    int result = FibonacciIterate.calculate(n);
    //then
    assertEquals(0, result);
  }

  @Test
  public void shouldReturnProperValue() {
    //given
    int n = 10;
    //when
    int result = FibonacciIterate.calculate(n);
    //then
    assertEquals(55, result);
  }

}