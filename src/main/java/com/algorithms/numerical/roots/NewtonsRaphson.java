package com.algorithms.numerical.roots;

public class NewtonsRaphson {
  public static void main(String[] args) {

    System.out.println(sqrt(789546));
  }

  public static double sqrt(double x) {
    double x1 = x;
    double x0 = x;

    while (true) {
      x1 = x1 - (x1 * x1 - x) / (2 * x1);
      x1 = (x1 * 10000000) / 10000000;
      if (x0 == x1) break;
      x0 = x1;
    }

    return x1;
  }
}