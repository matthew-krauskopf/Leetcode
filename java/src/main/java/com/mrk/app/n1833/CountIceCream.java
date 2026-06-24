package com.mrk.app.n1833;

/**
 * Hello world!
 */
public class CountIceCream {

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            // min = min < num ? min : num;
            max = max > num ? max : num;
        }
        return max;
    }

    public static int[] getCntArr(int[] arr, int max) {
        int[] cntArr = new int[max + 1];

        for (int num : arr) {
            cntArr[num]++;
        }

        // Now need to set n = n + n-1
        for (int i = 1; i < cntArr.length; i++) {
            cntArr[i] += cntArr[i - 1];
        }

        return cntArr;
    }

    public static int[] countSort(int[] arr) {
        int max = getMax(arr);
        int[] cntArr = getCntArr(arr, max);
        int[] sorted = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int cur = arr[i];
            sorted[cntArr[cur] - 1] = cur;
            cntArr[cur]--;
        }

        return sorted;
    }

    public static int countIceCreams(int[] sorted, int coins) {
        int total = 0;
        for (int cost : sorted) {
            if (coins - cost >= 0) {
                total++;
                coins -= cost;
            } else {
                return total;
            }
        }
        return total;
    };

    public static int maxIceCream(int[] costs, int coins) {
        int[] sorted = countSort(costs);
        return countIceCreams(sorted, coins);
    }

    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[] { 1, 3, 2, 4, 1 }, 7));
    }
}
