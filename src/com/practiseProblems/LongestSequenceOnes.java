package com.practiseProblems;

import java.util.ArrayList;

public class LongestSequenceOnes {
    public static void main(String[] args) {
        int[] inputArr = {1, 1, 0, 1, 0, 1, 1, 0, 1, 1};

        // convert the problem
        ArrayList<Integer> inputConvertedList = new ArrayList<>();

        int sequenceOnesTotal = 0;
        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i] == 1) {
                sequenceOnesTotal++;
                if (sequenceOnesTotal > 0 && i == inputArr.length - 1) {
                    inputConvertedList.add(sequenceOnesTotal);
                }
            } else {
                if (sequenceOnesTotal > 0) {
                    inputConvertedList.add(sequenceOnesTotal);
                }
                inputConvertedList.add(inputArr[i]);
                sequenceOnesTotal = 0;
            }
        }

        System.out.println(inputConvertedList);

        int maxSequence = 0;
        for (int i = 0; i < inputConvertedList.size(); i = i + 2) {
            int len = inputConvertedList.get(i);
            if ((i + 1) < inputConvertedList.size()) {
                len += 1;
            }
            if ((i + 2) < inputConvertedList.size()) {
                len += inputConvertedList.get(i + 2);
            }
            if (len > maxSequence) {
                maxSequence = len;
            }
        }

        System.out.println("maxSequence:" + maxSequence);
    }
}