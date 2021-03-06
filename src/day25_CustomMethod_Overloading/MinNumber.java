package day25_CustomMethod_Overloading;

public class MinNumber {
/*
  1. create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array
 */

    public static int minNumber(int[] arr){
        int min = 0;

        for (int each : arr) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }



    public static double minNumber(double[] arr){
        double min = 0;

        for (double each : arr) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }


    public static long minNumber(long[] arr){
        long min = 0L;

        for (long each : arr) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }



    public static short minNumber(short[] arr){
        short min = 0;

        for (short each : arr) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }


    public static float minNumber(float[] arr){
        float min = 0F;

        for (float each : arr) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }


    public static byte minNumber(byte[] arr){
        byte min = 0;

        for (byte each : arr) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }

























}
