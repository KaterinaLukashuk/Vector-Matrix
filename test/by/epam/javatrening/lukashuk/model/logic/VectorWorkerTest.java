package by.epam.javatrening.lukashuk.model.logic;

import by.epam.javatrening.lukashuk.model.data.Vector;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorWorkerTest {

    @Test
    public void getMax() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        double expected = 4;
        assertEquals(expected, VectorWorker.getMax(vector),0.01);
    }

    @Test
    public void getMin() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        double expected = 0;
        assertEquals(expected, VectorWorker.getMin(vector),0.01);
    }

    @Test
    public void getAverage() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        double expected = 2;
        assertEquals(expected, VectorWorker.getAverage(vector),0.01);
    }

    @Test
    public void getGeometricMean() {

    }

    @Test
    public void isSorted() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        boolean expected = false;
        assertEquals(expected, VectorWorker.isSorted(vector));
    }

    @Test
    public void firstLocalMinIndex() {
        Vector vector = new Vector();
        vector.add(6);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        int expected = 2;
        assertEquals(expected, VectorWorker.getFirstLocalMinIndex(vector));
    }

    @Test
    public void revers() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        Vector expected = new Vector();
        expected.add(0);
        expected.add(3);
        expected.add(2);
        expected.add(4);
        expected.add(1);
        assertArrayEquals(expected.getArray(),VectorWorker.revers(vector).getArray(),0.01);
    }

    @Test
    public void qSort() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        Vector expected = new Vector();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        VectorWorker.qSort(vector , 0, vector.length() -1);
        assertArrayEquals(expected.getArray(),vector.getArray(),0.01);
    }

    @Test
    public void bubbleSort() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        Vector expected = new Vector();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        VectorWorker.bubbleSort(vector);
        assertArrayEquals(expected.getArray(),vector.getArray(),0.01);

    }

    @Test
    public void binarySearch() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        double element = 4;
        int expected = 3;
        assertEquals(expected, VectorWorker.binarySearch(vector, element));
    }

    @Test
    public void lineSearch() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(5);
        vector.add(1);
        vector.add(9);
        double element = 5;
        int expected = 2;
        assertEquals(expected, VectorWorker.lineSearch(vector, element));
    }
}