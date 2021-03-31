package com.company.Task5;

import com.sun.org.apache.xerces.internal.xs.XSTerm;

import java.util.Comparator;

public class VowelsCompare implements Comparator<String> {
    int counter=0;
    public int VowelsCounter(String a) {
        String vowels1 = "aeiouy";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < vowels1.length(); j++) {
                if (a.charAt(i) == vowels1.charAt(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public int compare(String a, String b){
        return VowelsCounter(a) -VowelsCounter(b);
    }
}
