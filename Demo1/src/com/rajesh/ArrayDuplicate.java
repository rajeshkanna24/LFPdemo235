package com.rajesh;

import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(Pawan[] args) {

        int intArray[] = {4, 8, 8, 6, 8, 9, 5, 3, 2, 1};

            System.out.println("Array Elements :" + Arrays.toString(intArray));
            for (int i = 0; i < intArray.length; i++) {
                for (int j = i + 1; j < intArray.length; j++) {
                    if (intArray[i] == intArray[j]) {
                        System.out.println("Duplicate Elements :" + intArray[j]);
                    }
                }
            }
        }
    }

