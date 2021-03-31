package com.company.Task5;

import java.util.Comparator;

public class LengthCompare implements Comparator<String> {
    public int compare(String a, String b){
        return (a.length()-b.length());
    }
}
