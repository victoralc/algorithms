package com.victor.learn.algorithms.datatypes;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class VisualAccumulatorTest {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(trials, 1.0);
        for (int i = 0; i < trials; i++) {
            a.addDataValue(StdRandom.uniform(0.0, 1.0));
        }
        StdOut.println(a);
    }
}
