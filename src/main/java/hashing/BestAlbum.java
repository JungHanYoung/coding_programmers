package hashing;

import java.util.*;

public class BestAlbum {

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(solution3(
                        new String[]{"classic", "pop", "classic", "classic", "pop", "ballad"},
                        new int[]{500, 600, 150, 800, 2500, 800}))
        );
        System.out.println(
                Arrays.toString(solution3(
                        new String[]{"classic", "classic", "classic"},
                        new int[]{500, 600, 150}))
        );
        System.out.println(
                Arrays.toString(solution3(
                        new String[]{"classic", "classic", "classic", "pop"},
                        new int[]{500, 600, 150, 1500}))
        );
        System.out.println(
                Arrays.toString(solution3(
                        new String[]{"ballad", "ballad", "classic", "classic", "classic", "pop"},
                        new int[]{200, 1000, 500, 600, 150, 1500}))
        );
        System.out.println(
                Arrays.toString(solution3(
                        new String[]{"classic", "pop", "ballard", "R&B", "hiphop"},
                        new int[]{500, 600, 150, 800, 2500}))
        );
        System.out.println(
                Arrays.toString(solution3(
                        new String[]{"classic", "pop", "pop", "pop", "classic", "pop"},
                        new int[]{500, 700, 700, 700, 2500, 700}))
        );
        System.out.println(
                Arrays.toString(solution3(
                        new String[]{"classic", "pop", "pop", "pop", "classic", "pop", "classic"},
                        new int[]{2500, 700, 700, 700, 2500, 700, 2500}))
        );



    }

    public static class GenreInfo {
        int totalCount;
        List<Music> musicList;

        @Override
        public String toString() {
            return "GenreInfo{" +
                    "totalCount=" + totalCount +
                    ", musicList=" + musicList +
                    '}';
        }
    }

    public static class Music {
        int id;
        String genre;
        int playCount;

        Music(int id, String genre, int playCount) {
            this.id = id;
            this.genre = genre;
            this.playCount = playCount;
        }

        @Override
        public String toString() {
            return "Music{" +
                    "id=" + id +
                    ", genre='" + genre + '\'' +
                    ", playCount=" + playCount +
                    '}';
        }
    }

    public static int[] solution3(String[] genres, int[] plays) {

        Queue<Music> queue = new PriorityQueue<>((m1, m2) -> m2.playCount - m1.playCount);
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Queue<Music>> groupby = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            countMap.put(genres[i], countMap.getOrDefault(genres[i], 0) + plays[i]);
            queue.offer(new Music(i, genres[i], plays[i]));
        }

        // groupBy
        while(!queue.isEmpty()) {
            Music music = queue.poll();
            if(groupby.containsKey(music.genre)) {
                groupby.get(music.genre).offer(music);
            } else {
                Queue<Music> tempQ = new PriorityQueue<>((m1, m2) -> {
                    if(m2.playCount == m1.playCount) {
                        return m1.id - m2.id;
                    } else {
                        return m2.playCount - m1.playCount;
                    }
                });
                tempQ.offer(music);
                groupby.put(music.genre, tempQ);
            }
        }

        // countMap -> totalCount로 정렬을 하는거지


        List<String> genreToSort = new ArrayList<>(countMap.keySet());
        genreToSort.sort((o1, o2) -> countMap.get(o2) - countMap.get(o1));

        System.out.println(genreToSort);


        List<Integer> tempAnswer = new ArrayList<>();
        int genreCount = 0;

        //
        Iterator<String> stringIterator = genreToSort.iterator();
        while(stringIterator.hasNext() && genreCount < 2) {
            String next = stringIterator.next();
            Queue<Music> musicQ = groupby.get(next);

            int count = 0;
            while(!musicQ.isEmpty() && count < 2) {
                Music poll = musicQ.poll();
                tempAnswer.add(poll.id);
                count++;
            }
            genreCount++;
        }

        int[] answer = new int[tempAnswer.size()];
        for(int i = 0; i < tempAnswer.size(); i++) {
            answer[i] = tempAnswer.get(i);
        }

        return answer;

    }

    public static int[] solution2(String[] genres, int[] plays) {


        Map<String, GenreInfo> map = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            if(map.containsKey(genres[i])) {

                GenreInfo reselect = map.get(genres[i]);
                reselect.totalCount += plays[i];
                reselect.musicList.add(new Music(i, genres[i], plays[i]));
                map.put(genres[i], reselect);

            } else {
                GenreInfo genreInfo = new GenreInfo();
                genreInfo.totalCount = plays[i];
                genreInfo.musicList = new ArrayList<>();
                genreInfo.musicList.add(new Music(i, genres[i], plays[i]));
                map.put(genres[i], genreInfo);
            }
        }

        System.out.println(map);

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            GenreInfo genreInfo1 = map.get(o1);
            GenreInfo genreInfo2 = map.get(o2);

            return genreInfo2.totalCount - genreInfo1.totalCount;
        });

        GenreInfo genreInfo1 = map.get(list.get(0));
        genreInfo1.musicList.sort(
                (o1, o2) -> o2.playCount - o1.playCount);

        GenreInfo genreInfo2 = map.get(list.get(1));
        genreInfo2.musicList.sort(
                (o1, o2) -> o2.playCount - o1.playCount);


        return new int[]{
                genreInfo1.musicList.get(0).id,
                genreInfo1.musicList.get(1).id,
                genreInfo2.musicList.get(0).id,
                genreInfo2.musicList.get(1).id
        };

    }

    public static String[] solution(String[] genres, int[] plays) {

//        Map<String, Integer> map = new HashMap<>();
//
//
//
//
//        for(int i = 0; i < genres.length; i++) {
//            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
//        }
//
//        System.out.println(map);
//
//        List list = sortByValue(map);
//
//        String first = (String) list.get(0);
//        String second = (String) list.get(1);
//
//        for(int i = 0; i < genres.length; i++) {
//            if(genres[i].equals(first)) {
//                System.out.println("first: " + i + " - " + plays[i]);
//            } else if(genres[i].equals(second)) {
//                System.out.println("second: " + i + " - " + plays[i]);
//            }
//        }
//
//
//
//        return null;
//    }
//
//    public static List sortByValue(final Map map) {
//
//        List<String> list = new ArrayList();
//
//        list.addAll(map.keySet());
//
//
//
//        list.sort((Comparator) (o1, o2) -> {
//
//            Object v1 = map.get(o1);
//
//            Object v2 = map.get(o2);
//
//
//            return ((Comparable) v2).compareTo(v1);
//
//        });
//
////        Collections.reverse(list);
//
//        return list;
        return null;

    }
}
