package org.example.utility.common;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamUtil {
    private static final StreamUtil o = new StreamUtil();

    /**
     * Type Change
     **/
    // int[] -> collection
    public Collection<Integer> intArrayToCollection(int[] array){
        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }

    // collection -> int[]
    public int[] collectionToIntArray(Collection<Integer> collection){
        return collection.stream().mapToInt(Integer::intValue).toArray();
    }

    // String -> int[]

    // int[] -> String

    /**
     * Order
     **/
    // int[] nature order

    // int[] reverse order

    // collection nature order

    // collection reverse order

    // int[][] nature order

    // int[][] reverse order
}
