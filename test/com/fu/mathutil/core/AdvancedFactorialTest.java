/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ADMIN
 */
@RunWith(value=Parameterized.class)
public class AdvancedFactorialTest {
    

        //ta viết kĩ thuật mới, tách data ra hẳn các lệnh ktra hàm
        //data này ta có thể đặt ở file .txt, .csv, .excel, database
        //input và output/expected là những cặp 
        //nhiều cặp cần phải test, do đó data để test hàm sẽ là mảng 2 chiều
        
        @Parameters
        public static Object[][] initData(){
            return new Integer[][]{
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120}
            };
        }
        
        @Parameter(value=0)//map với cột 0 của cột data
        public int input;
        @Parameter(value=1)//map với cột 1 của cột data
        public long expected;
    }