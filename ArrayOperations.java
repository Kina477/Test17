package test.andrijasevic;

public class ArrayOperations {
            public static double average(int[] arr) {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                return (double) sum / arr.length;
            }
        }

