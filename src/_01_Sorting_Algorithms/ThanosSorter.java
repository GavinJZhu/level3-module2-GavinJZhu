package _01_Sorting_Algorithms;

import _00_Intro_to_Sorting_Algorithms._01_SortedArrayChecker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ThanosSorter extends Sorter {
    public ThanosSorter() {
        type = "Thanos";
    }

    /*
     * Thanos Sort is the sorting algorithm used by mighty titan Thanos.
     * When Thanos observes that the array is unsorted, he simply snaps his
     * fingers and removes half of the array items to bring balance to the
     * array. Thanos will keep snapping his fingers until the remaining
     * elements are completely sorted.
     * For example:
     * int[] arr = {12, 100, 200, 201, 97, 33, 100, 687};
     *
     * Thanos looks at this array from left to right and sees the first
     * element that isn't greater than the previous one is 97
     * (12, 100, 200, 201 are all in order). In quiet rage, Thanos randomly
     * picks half of the elements in the array and removes them. In this case
     * he removes the second half, so the array now looks like:
     * {12, 100, 200, 201, 0, 0, 0, 0} // second half removed
     *
     * The remaining non-0 values are now in order and balance is restored to
     * the array. If Thanos removed the first half, the array would be:
     * {0, 0, 0, 0, 97, 33, 100, 687}
     *
     * The first unordered number is 33, so Thanos snaps his fingers and removes
     * half again:
     * {0, 0, 0, 0, 0, 0, 100, 687} // first half
     * or
     * {0, 0, 0, 0, 97, 33, 0, 0} // second half
     *
     * If the first half is removed the result is sorted. If the second half is
     * removed 33 isn't sorted so Thanos snaps his fingers again! The result is
     * either:
     * {0, 0, 0, 0, 0, 33, 0, 0} // first half
     * or
     * {0, 0, 0, 0, 97, 0, 0, 0} // second half
     *
     * NOTE: The algorithm doesn't necessarily have to take away half from the
     * front or back of the array. You can implement an algorithm that takes
     * elements away randomly until half (in this case (n-1)/2) remain. The
     * algorithm is up to you!
     */
    ArrayList<Integer> remainingIndexes = new ArrayList<>();
    @Override
    void sort(int[] arr, SortingVisualizer display) {
        // add temporary ArrayList, which only accounts for non-zero numbers
        ArrayList<Integer> temp = new ArrayList<>();
        for (int integer : arr) {
            if (integer != 0) {
                temp.add(integer);
            }
        }

        //translate temp ArrayList to temp array
        int[] arrWithoutZeroes = new int[temp.size()];
        for (int i = 0; i<temp.size(); i++){
            arrWithoutZeroes[i] = temp.get(i);
        }

        //check if temp array is sorted
        if (_01_SortedArrayChecker.intArraySorted(arrWithoutZeroes)) {
            return;
        }

        //otherwise, turn half of arrays into 0s

        else {
            for (int k = 0; k<arrWithoutZeroes.length; k++){
                remainingIndexes.add(k);
            }
            for (int j = remainingIndexes.size()/2; j<arrWithoutZeroes.length; j++){
                arr[j] = 0;
            }
            for (int m = 0; m<remainingIndexes.size()-1; m++){
                remainingIndexes.remove(m);
            }
            display.updateDisplay();
            System.out.println("test");
            sort(arr, display);
        }

    }
}
