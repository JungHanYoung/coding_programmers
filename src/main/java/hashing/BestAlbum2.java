package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class BestAlbum2 {

    public static void main(String[] args) {
        solution(
                new String[]{"classic", "classic", "classic"},
                new int[]{500, 600, 150});
        solution(
                new String[]{"classic", "pop", "classic", "classic", "pop", "ballad"},
                new int[]{500, 600, 150, 800, 2500, 800});
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Queue<Music>> groupby = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            countMap.put(genres[i], countMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        // groupBy
        for(int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            Queue<Music> orDefault;
            orDefault = groupby.getOrDefault(genre, new PriorityQueue<>());
            orDefault.offer(new Music(i, play));
            groupby.put(genre, orDefault);
        }

        System.out.println(groupby);



        return null;
    }

}

class Music implements Comparable<Music> {

    int id;
    int play;

    Music(int id, int play) {
        this.id = id;
        this.play = play;
    }

    @Override
    public int compareTo(Music o) {
        if(this.play == o.play) {
            return this.id - o.id;
        } else {
            return o.play - this.play;
        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", play=" + play +
                '}';
    }
}
