package com.systelab.kata;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {


        int res[] = new int[0];
        for(int pivote : numbers)
        {   if( pivote % divider == 0 )
            res = jbUtils.addX(res.length, res, pivote) ;
        }

        return res;
    }



}
