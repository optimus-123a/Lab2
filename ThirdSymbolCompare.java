package com.company.Task5;

import java.util.Comparator;

public class ThirdSymbolCompare implements Comparator<String> {
    public int compare(String a, String b){
        return a.substring(2, 1).compareTo(b.substring(2, 1));
    }
}
