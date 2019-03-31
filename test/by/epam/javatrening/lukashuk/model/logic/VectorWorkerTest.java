package by.epam.javatrening.lukashuk.model.logic;

import by.epam.javatrening.lukashuk.model.data.Vector;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorWorkerTest {

        Vector vector;
        Vector sortedVector;
    {
        vector = new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(0);
        sortedVector = new Vector();
        sortedVector.add(0);
        sortedVector.add(1);
        sortedVector.add(2);
        sortedVector.add(3);
        sortedVector.add(4);
    }
    @Test
    public void getMax() {

        double expected = 4;
        assertEquals(expected, VectorWorker.getMax(vector),0.01);
    }

    @Test
    public void getMin() {
        double expected = 0;
        assertEquals(expected, VectorWorker.getMin(vector),0.01);
    }

    @Test
    public void getAverage() {
        double expected = 2;
        assertEquals(expected, VectorWorker.getAverage(vector),0.01);
    }

    @Test
    public void getGeometricMean() {

    }

    @Test
    public void isSorted() {
        boolean expected = false;
        assertEquals(expected, VectorWorker.isSorted(vector));
    }

    @Test
    public void firstLocalMinIndex() {
        int expected = 0;
        assertEquals(expected, VectorWorker.getFirstLocalMinIndex(vector));
    }

    @Test
    public void revers() {
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
        VectorWorker.qSort(vector , 0, vector.length() -1);
        assertArrayEquals(sortedVector.getArray(),vector.getArray(),0.01);
    }

    @Test
    public void bubbleSort() {
        VectorWorker.bubbleSort(vector);
        assertArrayEquals(sortedVector.getArray(),vector.getArray(),0.01);
    }

    @Test
    public void binarySearch() {

        double element = 3;
        int expected = 3;
        assertEquals(expected, VectorWorker.binarySearch(sortedVector, element));
    }

    @Test
    public void lineSearch() {

        double element = 2;
        int expected = 2;
        assertEquals(expected, VectorWorker.lineSearch(vector, element));
    }
}