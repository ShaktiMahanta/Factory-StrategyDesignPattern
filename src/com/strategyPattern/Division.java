package com.strategyPattern;

public class Division implements Strategy{

    @Override
    public int action(int a, int b) {
        return a/b;
    }

}
