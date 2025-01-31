package arrayAlg;

public class TestArrayAlg {
    public static void main(String[] args) {
        VideoGame[] videoGames = new VideoGame[]{
                new VideoGame("Game 1", "Developer 1", 3.2F),
                new VideoGame("Game 2", "Developer 2", 4.1F),
                new VideoGame("Game 3", "Developer 1", 2.7F)
        };
        System.out.println(findMaxIndex(videoGames));
    }

    public static <T extends Comparable<T>> int findMaxIndex(T[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex].compareTo(array[i]) < 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
