package com.victor.learn.algorithms.datatypes;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int i = 0; i < trials; i++) {
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else
                tails.increment();
        }

        StdOut.println(heads);
        StdOut.println(tails);
        int delta = heads.tally() - tails.tally();
        StdOut.println("delta: " + Math.abs(delta));
    }
}
