package _03_More_Algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
 * Uncomment each test and then write the corresponding method in the
 * Algorithms class to make them pass.
 */

public class _00_MoreAndMoreTests {

    @Test
    public void MultTest() {
        Assertions.assertEquals("10 x 0 = 0", Algorithms.multiply(10, 0));
        Assertions.assertEquals("10 x 10 = 100", Algorithms.multiply(10, 10));
        Assertions.assertEquals("8 x 11 = 88", Algorithms.multiply(8, 11));
    }

    @Test
    public void PrimeTest() {
        Assertions.assertTrue(Algorithms.isPrime(3));
        Assertions.assertTrue(Algorithms.isPrime(5));
        Assertions.assertTrue(Algorithms.isPrime(541));
        Assertions.assertFalse(Algorithms.isPrime(4));
        Assertions.assertFalse(Algorithms.isPrime(12));
        Assertions.assertFalse(Algorithms.isPrime(527));
    }

    @Test
    public void SquareTest() {
        Assertions.assertTrue(Algorithms.isSquare(4));
        Assertions.assertTrue(Algorithms.isSquare(144));
        Assertions.assertTrue(Algorithms.isSquare(64));
        Assertions.assertTrue(Algorithms.isSquare(10201));
        Assertions.assertTrue(Algorithms.isSquare(1));
        Assertions.assertFalse(Algorithms.isSquare(3));
        Assertions.assertFalse(Algorithms.isSquare(22));
        Assertions.assertFalse(Algorithms.isSquare(143));
    }

   @Test
   public void CubeTest() {
       Assertions.assertTrue(Algorithms.isCube(27));
       Assertions.assertTrue(Algorithms.isCube(216));
       Assertions.assertTrue(Algorithms.isCube(729));
       Assertions.assertTrue(Algorithms.isCube(1));
       Assertions.assertFalse(Algorithms.isCube(3));
       Assertions.assertFalse(Algorithms.isCube(22));
       Assertions.assertFalse(Algorithms.isCube(143));
   }
}
