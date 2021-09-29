/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.core;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author thien
 */
public class FatorialTest {
    
    
    @Test
    public void checkFactorialGivenRightArgumentReturnswell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);

        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0));
    }
    
    //check xem co xh ngoai le hay khong
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        //ta khong dung ham assertEquals(2 value so sanh)
        //ngoai le chi co the thay no xh hay khong
        MathUtil.getFactorial(-5);
    }

}
// quy uoc xanh do:
//xanh thi tat ca phai xanh
//do thi chi can 1 tinh huong do thi coi nhu ca ham do
//hoac ban tinh toan trong thuat toan sai/ hoac ban ki vong sai