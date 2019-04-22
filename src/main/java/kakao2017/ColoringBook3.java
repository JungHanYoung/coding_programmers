package kakao2017;

import java.util.ArrayList;
import java.util.List;

public class ColoringBook3 {

    boolean[][] checked;
    List<Integer> sizeList = new ArrayList<>();
    int sum;

    public int[] solution(int m, int n, int[][] picture) {

        checked = new boolean[m][n];
        int temp = 0, i, j;
        // sizeList = new ArrayList<>();


        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                if(checked[i][j]) continue;
                checked[i][j] = true;
                if(picture[i][j] == 0) continue;
                temp = recursion(i, j, picture);
                if(temp > 0) {
                    sizeList.add(temp);
                    temp = 0;
                }


            }
        }

        int max = Integer.MIN_VALUE;
        for(i = 0; i < sizeList.size(); i++) {
            if(max < sizeList.get(i))
                max = sizeList.get(i);
        }

        return new int[]{sizeList.size(), max};
    }

    private int recursion(int rowIdx, int colIdx, int[][] picture) {
        // base case
        if(checked[rowIdx][colIdx]) return 0;
        checked[rowIdx][colIdx] = true;
        if(picture[rowIdx][colIdx] == 0) return 0;

        sum = 1;

        sum += rowIdx - 1 >= 0 && picture[rowIdx - 1][colIdx] == picture[rowIdx][colIdx] ? recursion(rowIdx-1, colIdx, picture) : 0;

        sum += rowIdx + 1 < picture.length && picture[rowIdx+1][colIdx] == picture[rowIdx][colIdx] ? recursion(rowIdx+1, colIdx, picture) : 0;

        sum += colIdx - 1 >= 0 && picture[rowIdx][colIdx-1] == picture[rowIdx][colIdx] ? recursion(rowIdx, colIdx-1, picture) : 0;

        sum += colIdx + 1 < picture[0].length && picture[rowIdx][colIdx+1] == picture[rowIdx][colIdx] ? recursion(rowIdx, colIdx+1, picture) : 0;

        return sum;
    }
}
