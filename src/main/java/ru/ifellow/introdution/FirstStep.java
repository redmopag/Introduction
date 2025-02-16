package ru.ifellow.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        boolean isInsideX = (x >= xLeft && x <= xRight);
        boolean isInsideY = (y >= yTop && y <= yBottom);
        return isInsideX && isInsideY;
    }

    public int sum(int[] array){
        int res = 0;
        for (int i : array) {
            res += i;
        }
        return res;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        } else {
            int res = 1;
            for (int i : array) {
                res *= i;
            }
            return res;
        }
    }

    public int min(int[] array){
        int res = Integer.MAX_VALUE;
        for (int i : array) {
            res = res <= i ? res : i;
        }
        return res;
    }

    public int max(int[] array){
        int res = Integer.MIN_VALUE;
        for (int i : array) {
            res = res >= i ? res : i;
        }
        return res;
    }

    public double average(int[] array){
        if (array.length == 0) {
            return 0.0;
        } else {
            return (double) sum(array) / array.length;
        }
    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) { // проверка для условия - по убыванию
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            // array[i] = (int) Math.pow(array[i], 3)
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        int n = array.length / 2;
        for (int i = 0; i < n; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for (int[] row : matrix) {
            sum += sum(row);
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            int maxInRow = max(row);
            max = max >= maxInRow ? max : maxInRow;
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            max = max >= matrix[i][i] ? max : matrix[i][i];
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
