package kakao2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColoringBook {

    int size = 0;
    List<Integer> sizes = new ArrayList<>();

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] checked = new boolean[m][n];

        Map<Integer, Integer> map = new HashMap<>();



        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(picture[i][j] != 0){
                    int check = check(i, j, picture, checked, map);
                    // 색칠이 되어있지 않다.
                    if(check < 0) {

                    } else {
                        // 색칠이 되어있음.
                        sizes.add(check);
                    }

                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public int check(int row, int col, int[][] picture, boolean[][] checked, Map<Integer, Integer> map) {
        checked[row][col] = true;
        //
        if(picture[row][col] == 0) return -1;

        Integer integer = 0;
        //
        recursion(row, col, picture, checked, integer);

        return -1;
    }

    private void recursion(int row, int col, int[][] picture, boolean[][] checked, Integer integer) {

        // base case
        if(checked[row][col] || picture[row][col] == 0) return;

        if(row - 1 >= 0 && picture[row-1][col] != 0) recursion(row - 1, col, picture, checked, integer);
        if(col - 1 >= 0 && picture[row][col-1] != 0) recursion(row, col - 1, picture, checked, integer);
        if(row + 1 < picture.length && picture[row+1][col] != 0) recursion(row + 1, col, picture, checked, integer);
        if(col + 1 < picture[0].length && picture[row][col+1] != 0) recursion(row, col + 1, picture, checked, integer);

        checked[row][col] = true;

    }
}
