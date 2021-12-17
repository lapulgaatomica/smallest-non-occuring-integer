# smallest-non-occuring-integer
a simple and efficient Java program that returns the smallest non-occurring integer in a given Array

The solution to the challenge can be found in the solution package, the method name is `smallestNonOccuringInteger`

```
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
```