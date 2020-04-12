package com.victor.learn.algorithms;

public class GreatestCommonDivisor {
    
    public static int gdc(int p, int q){
        if (q == 0) return p;
        int r = p % q;
        return gdc(q, r);
    }
    
    public static void main(String[] args) {
        System.out.println(gdc(293845, 130953));
    }
}
