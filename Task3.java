package com.company;

import java.lang.reflect.Array;
import java.util.*;


public class Task3 {
    /*#40
        Продемонструйте роботу 15 методів класу Arrays.
     */
    public void arraysMethodsCaster(){
        int[] testArray1 ={1, 2, 3, 4, 5, 6};
        int[] testArray2;
        int[][] testArray3={{1, 2,3,4,6,8,9},{1,2,3,4,6,7, 10}};
        int[][] testArray4={{9, 2,56,4,6,8,11},{7,65,3,54,6,7, 10}};
        Double array1[]= new Double[10];
        for(int i=0; i<array1.length; i++){
            array1[i]=(double)i;
        }

        testArray2=Arrays.copyOf(testArray1, 3);
        testArray2=Arrays.copyOfRange(testArray1, 1, 5);

        Arrays.sort(testArray1);
        Arrays.sort(testArray1, 0, 3);
        Arrays.sort(array1, Collections.reverseOrder());
        Boolean isSame=Arrays.equals(testArray1, testArray2);
        String str=Arrays.toString(testArray1);
        int index=Arrays.binarySearch(testArray1, 5);
        Arrays.fill(testArray1, 0);
        Boolean isEquals=Arrays.deepEquals(testArray3, testArray4);
        List testList=new ArrayList();
        Arrays.asList(testList, testArray1);
    }
}
