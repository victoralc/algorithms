package com.victor.learn.algorithms.datatypes;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

public class ExampleCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter("counter1");
        c1.increment();
        Counter c2 = c1;
        c2.increment();
        StdOut.println(c1);
    }
}
