package com.systelab.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LettersCalculator {

    private static  final String[] abecedario = {"z","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static String addLetters(String... letters) {

        List<String> abclist = Arrays.asList(abecedario);
        
        int targetPos = 0;
        for(String letra : letters)
        {
            targetPos = targetPos+ Arrays.asList(abecedario).indexOf(letra);
            // controlling the overflow
            targetPos = (targetPos>abecedario.length? targetPos-(abecedario.length-1):targetPos);
        }

        String res = Arrays.asList(abecedario).get(targetPos);
        
        return res;
    }
}
