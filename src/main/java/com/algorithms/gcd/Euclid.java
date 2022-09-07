package com.algorithms.gcd;

public class Euclid {

  public int gcd(int a, int b) {
    int divisor = a > b ? b : a;
    int dividend = a > b ? a : b;
    while (divisor != 0) {
      int rem = dividend % divisor;
      dividend = divisor;
      divisor = rem;
    }
    return dividend;
  }

  public int gcdr(int dividend, int divisor) {
    return divisor == 0 ? dividend : gcd(divisor, dividend % divisor);
  }
}
