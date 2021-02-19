package com.example.p3;

class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        var rKey = key;
        for (var i=0; i<4; i++) {
//            System.out.println("Rotate");
            rKey = rotate(rKey);

            if (match(rKey, lock)) {
                return true;
            }
        }

        return false;
    }

    public int[][] rotate(int[][] key) {
        var length = key.length;

        var result = new int[length][length];

        for (int i=0; i<length; i++) {
            for (int j=0; j<length; j++) {
                result[i][j] = key[length - 1 - j][i];
            }
        }

        return result;
    }

    public boolean match(int[][] key, int[][] lock) {
//        System.out.println(toString(key));
        var lLength = lock.length;
        var kLength = key.length;

        var minOffset = 1 - lLength;
        var maxOffset = kLength - 1;

        for (int i=minOffset; i<=maxOffset; i++) {
            for (int j=minOffset; j<=maxOffset; j++) {
//                System.out.printf("offset %d %d%n\n", i, j);

                var pass = true;

                for (int y=0; y<lLength; y++) {
                    for (int x=0; x<lLength; x++) {
                        var ky = y + i;
                        var kx = x + j;

                        var kValue = -1;

                        if (0 <= ky && ky < kLength && 0 <= kx && kx < kLength) {
                            kValue = key[ky][kx];
                        } else {
                            kValue = 0;
                        }

                        if (kValue + lock[y][x] != 1) {
                            pass = false;
                        }

                        //System.out.printf("%d, %d, %d, %d = %d, %d\n", y, x, ky, kx, lock[y][x], kValue);
                    }
                }

                if (pass) {
                    return true;
                }
            }
        }

        return false;
    }

    public String toString(int[][] arr) {
        var length = arr.length;

        var result = new StringBuilder();

        for (int i=0; i<length; i++) {
            for (int j=0; j<length; j++) {
                result.append(arr[i][j]);
            }
        }

        return result.toString();
    }
}