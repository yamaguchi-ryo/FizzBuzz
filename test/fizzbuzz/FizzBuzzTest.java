package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	/**
	 * {@link fizzbuzz.FizzBuzz#fizzBuzzCheck(int)}
	 * のためのテスト・メソッド。(引数が〇の時の対処のテスト)
	 */
	@Test
	public void inputFizzBuzzValue() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzzCheck(15));
	}

	@Test
	public void inputDoubleFizzBuzzValue() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzzCheck(30));
	}

	@Test
	public void inputBuzzValue() {
		assertEquals("Buzz", FizzBuzz.fizzBuzzCheck(5));
	}

	@Test
	public void inputDoubleBuzzValue() {
		assertEquals("Buzz", FizzBuzz.fizzBuzzCheck(10));
	}

	@Test
	public void inputFizzValue() {
		assertEquals("Fizz", FizzBuzz.fizzBuzzCheck(3));
	}

	@Test
	public void inputDoubleFizzValue() {
		assertEquals("Fizz", FizzBuzz.fizzBuzzCheck(6));
	}

	@Test
	public void inputBoundaryValue() {
		assertEquals("4", FizzBuzz.fizzBuzzCheck(4));
	}

	@Test
	public void inputDoubleBoundaryValue() {
		assertEquals("8", FizzBuzz.fizzBuzzCheck(8));
	}
}
