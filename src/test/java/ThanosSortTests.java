import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThanosSortTests {
    @Test
    public void zeroarrayTest(){
        int[] zeroarray = {};
        int[] expectedarray = {};
        ThanosSort.thanossort(zeroarray,0, zeroarray.length);
        Assertions.assertArrayEquals(expectedarray,zeroarray);
    }
    @Test
    public void nosortarrayTest(){
        int[] sortarray = {1,8,22,45,61,1008};
        int[] expectedarray = {1,8,22,45,61,1008};
        ThanosSort.thanossort(sortarray,0, sortarray.length);
        Assertions.assertArrayEquals(expectedarray,sortarray);
    }
    @Test
    public void limitIntTest(){
        int[] limitIntarray = {2147483647,1,2147483646};
        int[] expectedarray = {1,2147483646,2147483647};
        ThanosSort.thanossort(limitIntarray,0, limitIntarray.length);
        Assertions.assertArrayEquals(expectedarray,limitIntarray);
    }
    @Test
    public void lengtharrayTest(){
        int[] sortarray = {5,8,19,22,33,60,71,210};
        int expectedlength = (ThanosSort.thanossort(sortarray,0, sortarray.length)).length;
        Assertions.assertEquals(expectedlength,8);
    }
    @Test
    public void SamearrayTest(){
        int[] sortarray = {67,10,987,301,2};
        int[] expectedarray = ThanosSort.thanossort(sortarray,0, sortarray.length);
        Assertions.assertSame(sortarray,expectedarray);
    }
    @Test
    public void SamevaluesarrayTest(){
        int[] sortarray = {5,5,5,5,5,5,5,5};
        int[] expectedarray = {5,5,5,5,5,5,5,5};
        ThanosSort.thanossort(sortarray,0, sortarray.length);
        Assertions.assertArrayEquals(sortarray,expectedarray);
    }
    @Test
    public void notnullarrayTest(){
        int[] nullarray = {};
        ThanosSort.thanossort(nullarray,0, nullarray.length);
        Assertions.assertNotNull(nullarray);
    }
    @Test
    public void sortarrayTest(){
        int[] nosortarray = {9,0,121,4,78,16,1,3,0};
        int[] expectedarray = {0,0,1,3,4,9,16,78,121};
        int[]resultsort = ThanosSort.thanossort(nosortarray,0, nosortarray.length);
        Assertions.assertArrayEquals(expectedarray,resultsort);
    }
}
