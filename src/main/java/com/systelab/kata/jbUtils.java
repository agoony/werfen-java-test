package com.systelab.kata;

import java.io.*;
import java.lang.*;
import java.util.*;


public class jbUtils {
    // Java Program to add an element in an Array



        // Function to add x in arr
        public static int[] addX(int n, int arr[], int x)
        {
            int i;

            // create a new array of size n+1
            int newarr[] = new int[n + 1];

            // insert the elements from
            // the old array into the new array
            // insert all elements till n
            // then insert x at n+1
            for (i = 0; i < n; i++)
                newarr[i] = arr[i];

            newarr[n] = x;

            return newarr;
        }

    public static String[] removeElements(String[] input, int rm_index) {

        // display index
        //System.out.println("Element to be removed at index: " + rm_index);

        // if array is empty or index is out of bounds, removal is not possible
        if (input == null
                || rm_index< 0
                || rm_index>= input.length) {

            System.out.println("No removal operation can be performed!!");
        }
        // Create a proxy array of size one less than original array
        String[] proxyArray = new String[input.length - 1];

        // copy all the elements in the original to proxy array except the one at index
        for (int i = 0, k = 0; i <input.length; i++) {

            // check if index is crossed, continue without copying
            if (i == rm_index) {
                continue;
            }

            // else copy the element
            proxyArray[k++] = input[i];
        }

        return  proxyArray;
    }


}
