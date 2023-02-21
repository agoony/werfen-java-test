package com.systelab.kata;

import java.util.Arrays;

import static com.systelab.kata.jbUtils.removeElements;

public class DirReduction {

    public final static String NORTHSOUTH = "NORTHSOUTH";
    public final static String SOUTHNORTH = "SOUTHNORTH";
    public final static String EASTWEST = "EASTWEST";
    public final static String WESTEAST = "WESTEAST";
    public static String[] dirReduc(String[] arr) {

        String [] res =new String[] {};

        for (int n = 0; n < arr.length; n++) {
            ///System.out.println("n"+n+" "+arr.length);
            if (arr.length > 1 && (n+1<arr.length)){
                if(absurdDirections(arr[n],arr[n+1]))
            {
                arr =removeElements(arr, n );
                arr=removeElements(arr, n);

                n=-1;

            }}
            //System.out.println(Arrays.toString(arr));
        }

        return arr;
    }



    public static boolean absurdDirections(String dir1 ,String dir2)
    {
        dir1=dir1.concat(dir2);
        if(dir1.equals(NORTHSOUTH) || dir1.equals(SOUTHNORTH) || dir1.equals(EASTWEST)  || dir1.equals(WESTEAST) )
            return true;

        return false;
    }
}