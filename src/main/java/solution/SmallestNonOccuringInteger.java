package solution;

import java.util.Set;
import java.util.TreeSet;

public class SmallestNonOccuringInteger {
    public static void main(String[] args) {
        System.out.println(smallestNonOccuringInteger(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(smallestNonOccuringInteger(new int[]{5, -1, -3}));
    }

    public static int smallestNonOccuringInteger(int[] array){
        Set<Integer> setOfPositiveIntegers = new TreeSet<>();
        //The elements inserted into a tree set ordered using their natural ordering, or by a Comparator provided at set creation time,

        for (int number : array) {
            if (number > 0) {
                setOfPositiveIntegers.add(number);
            }
        }

        for (int i = 1; i <= array.length + 1; i++) {
            if (!setOfPositiveIntegers.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}
