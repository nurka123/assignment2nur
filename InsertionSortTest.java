import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class InsertionSortTest {

    @Test
    void testRandomArray() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};

        InsertionSort.sort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        InsertionSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        InsertionSort.sort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        InsertionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        InsertionSort.sort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {1, 5, 3, 3, 2, 5};
        int[] expected = {1, 2, 3, 3, 5, 5};

        InsertionSort.sort(arr);

        assertArrayEquals(expected, arr);
    }
}
