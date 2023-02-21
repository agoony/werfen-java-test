package com.systelab.kata;

import java.util.ArrayList;
import java.util.Arrays;

public class MexicanWave {

       public static String[] wave(String str) {

        ArrayList<String> res = new ArrayList<String>();

        for (int n = 0; n < str.length(); n++) {
            String c = str.substring(n, n + 1);
            if (c.equals(" "))
                continue;

            char[] chars = str.toCharArray();
            char mychar = chars[n];
            String mycharstr = "" + mychar;
            chars[n] = mycharstr.toUpperCase().charAt(0);
            String new_entry = String.valueOf(chars);

            res.add(new_entry);
        }

        return res.toArray(new String[0]);
    }
}