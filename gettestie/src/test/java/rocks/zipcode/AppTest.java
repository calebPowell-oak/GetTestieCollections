package rocks.zipcode;

import com.sun.tools.hat.internal.model.HackJavaValue;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        // Given

        // When

        // Assert
    }

    @Test
    public void hashSetTest1() {
        // Given
        HashSet<Integer> mySet = new HashSet<>(10);
        Integer[] arr = {1,2,3,4,5,11,22,33,44,55};
        mySet.addAll(Arrays.asList(arr));

        // When
        Integer before = mySet.size();
        mySet.add(111);
        Integer after = mySet.size();

        // Assert
        Assert.assertTrue(after > before);
    }

    @Test
    public void hashSetTest2() {
        // Given
        HashSet<Integer> mySet = new HashSet<>(10);
        Integer[] arr = {1,2,3,4,5};
        mySet.addAll(Arrays.asList(arr));

        // When
        Integer before = mySet.size();
        mySet.remove(1);
        Integer after = mySet.size();

        // Assert
        Assert.assertTrue(before > after);
    }

    @Test
    public void arrayListTest() {
        // Given
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Caleb");
        myList.add("Powell");

        // When
        String actual = myList.get(myList.size() - 1);

        // Assert
        Assert.assertEquals("Powell", actual);
    }

    @Test
    public void hashMapTest() {
        // Given
        HashMap<Integer, String> myHash = new HashMap<>(10);

        // When
        myHash.put(1, "Caleb");
        String actual = myHash.get(1);

        // Assert
        Assert.assertEquals("Caleb", actual);
    }

    @Test
    public void linkedListTest() {
        // Given
        LinkedList<Integer> myList = new LinkedList<>();
        Integer[] ints = {1,2,3,4,5};
        myList.addAll(Arrays.asList(ints));

        // When
        Integer expected = 8;
        myList.add(0, expected);
        Integer actual = myList.get(0);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayDequeTest() {
        // Given
        ArrayDeque<Integer> myDQ = new ArrayDeque<>();
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        myDQ.addAll(Arrays.asList(arr));
        myDQ.addFirst(11);

        // When
        Integer actual = myDQ.removeLast();

        // Assert
        Assert.assertTrue(actual.equals(9));
    }

    @Test
    public void vectorTest() {
        // Given

        // When
        Integer actual = myDQ.removeLast();

        // Assert
        Assert.assertTrue(actual.equals(9));
    }
}
