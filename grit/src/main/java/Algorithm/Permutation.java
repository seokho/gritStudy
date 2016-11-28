package Algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by odol on 2016. 11. 29..
 */
public class Permutation {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        perm(integerList, 0, 4, 4);
        System.out.println();
    }

    public static void perm(List<Integer> integerList, int depth, int n, int k) {

        if (depth == k) {
            print(integerList);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(integerList, i, depth);
            perm(integerList, depth + 1, n, k);
            swap(integerList, i, depth);
        }
    }

    public static void swap(List<Integer> integerList, int i, int j) {
        int temp = integerList.get(i);
        integerList.set(i, integerList.get(j));
        integerList.set(j, temp);
    }

    public static void print(List<Integer> integerList) {
        System.out.println(integerList.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }

}
