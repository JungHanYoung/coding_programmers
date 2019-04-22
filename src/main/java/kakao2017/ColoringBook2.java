package kakao2017;

import java.util.ArrayList;
import java.util.List;

public class ColoringBook2 {

    int areaNum = 0;
    int size = 0;
    List<Integer> sizeList = new ArrayList<>();

    public int[] solution(int m, int n, int[][] picture) {

        areaNum = 0;
        size = 0;
        sizeList.clear();

        boolean[][] checked = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(checked[i][j]) continue;
                recursion(i, j, picture, checked);
                areaNum++;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int s : sizeList) {
            if(max < s)
                max = s;
        }

        return new int[]{areaNum, max};

    }

    private void recursion(int i, int j, int[][] picture, boolean[][] checked) {

        if(checked[i][j]) return;
        checked[i][j] = true;
        if(picture[i][j] == 0) return;

        size++;
        //
        if(i - 1 >= 0 && picture[i-1][j] != picture[i][j]) recursion(i-1, j, picture, checked);
        if(j - 1 >= 0 && picture[i][j-1] != picture[i][j]) recursion(i, j-1, picture, checked);
        if(i + 1 < picture.length && picture[i+1][j] != picture[i][j]) recursion(i+1, j, picture, checked);
        if(j + 1 < picture[0].length && picture[i][j+1] != picture[i][j]) recursion(i, j+1, picture, checked);

        sizeList.add(size);
        size = 0;

    }
}
