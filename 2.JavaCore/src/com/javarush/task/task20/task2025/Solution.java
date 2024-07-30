package com.javarush.task.task20.task2025;

import java.math.BigDecimal;
import java.util.*;

/* 
Алгоритмы-числа
*/

public class Solution {

    private static long [] intArray;

    public static long[] getNumbers(long N) {
        if (N <= 1) return new long[0];
        intArray = new long[0];
        long[][] matrix;
        Set<Long> set = new TreeSet<>();
        //Генерирование матрицы степеней
        int p = getCountOfDigits(N);
        matrix = new long[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = pow(j, new BigDecimal(i)).longValue();
            }
        }
        //Генерирование уникальных числовых последовательностей
        intArray = new long[p];
        Arrays.fill(intArray, 9);
        while(decrementArray()){
            long summa = 0;
            int start = 0;
            int length = intArray.length - 1;
            for (int j = 0; j < intArray.length; j++) {
                summa +=  matrix[(int)intArray[j]][length];
                if (j == (intArray.length - 1)) {
                    long summa2 = 0;
                    int power = 0;
                    long proverka = summa;
                    while (proverka > 0) {
                        proverka = proverka / 10;
                        power++;
                    }
                    long proverka2 = summa;
                    while (proverka2 > 0) {
                        long digit = proverka2 % 10;
                        proverka2 /= 10;
                        summa2 += matrix[(int)digit][power - 1];
                    }
                    if (summa == summa2) {
                        if (summa < N) {
                            set.add(summa);
                        }
                    }
                    if (intArray[start] == 0){
                        length--;
                        j = start;
                        start++;
                        summa = 0;
                    }
                }
            }
        }
        ArrayList<Long> arrayList = new ArrayList<>(set);
        long[] result = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int getCountOfDigits(long n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static BigDecimal pow(long power, BigDecimal digit){
        BigDecimal result = BigDecimal.ONE;
        for (int i = 0; i <= power; i++) {
            result = result.multiply(digit);
        }
        return result;
    }
    private static boolean decrementArray() {
        int index = 0;

        while (index < intArray.length && intArray[index] == 0) {
            index++;
        }

        if (index + 1 == intArray.length && intArray[index] == 1) {
            return false;
        }

        Arrays.fill(intArray, 0, index + 1, intArray[index] - 1);
        return true;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
