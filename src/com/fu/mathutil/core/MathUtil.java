/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.core;

/**
 *
 * @author thien
 */
public class MathUtil {
    //Viet ham tinh n! =1.2.3.4.5...n
    //0! = 1! = 1
    //21! tran kieu Long
    //<0! ko tinh duoc

    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must between 0..20");
        }
        long product = 1;
        if (n == 0 || n == 1) {
            return product;
        }
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }

    //TDD - Test Driven Development
}
