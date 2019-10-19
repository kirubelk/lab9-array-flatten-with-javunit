package edu.mum.junit.arrayflattener;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayFlattenerTest {

    ArrayFlattener flattener = null;


    @Before
    public void setUp() throws Exception {
        this.flattener = new ArrayFlattener();

    }

    @After
    public void tearDown() throws Exception {
        this.flattener = null;

    }

    @Test
    public void arrayFlattenerHappyScenario() {
        int[] actual = flattener.ArrayFlattener(new int[][]{{1, 3}, {0}, {4, 5, 9}});
        int[] expected = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayFlattener() {
    int[] actual=flattener.ArrayFlattener(null);
    int[] expected=null;
    assertArrayEquals(expected, actual);
    }
}