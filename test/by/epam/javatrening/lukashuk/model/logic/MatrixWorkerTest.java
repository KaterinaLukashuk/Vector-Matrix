package by.epam.javatrening.lukashuk.model.logic;

import by.epam.javatrening.lukashuk.model.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixWorkerTest {

    @Test
    public void getMax() {
        Matrix matrix = new Matrix(4 ,4);
        matrix.add(0,0, 1);
        matrix.add(0,1, 2);
        matrix.add(0,2, 2);
        matrix.add(0,3, 2);
        matrix.add(1,0, 1);
        matrix.add(1,1, 2);
        matrix.add(1,2, 2);
        matrix.add(1,3, 2);
        matrix.add(2,0, 1);
        matrix.add(2,1, 8);
        matrix.add(2,2, 2);
        matrix.add(2,3, 2);
        matrix.add(3,0, 1);
        matrix.add(3,1, 2);
        matrix.add(3,2, 2);
        matrix.add(3,3, 2);
        int expected = 8;
        assertEquals(expected, MatrixWorker.getMax(matrix), 0.01);
    }

    @Test
    public void isSymmetric() {
        Matrix matrix = new Matrix(4 ,4);
        matrix.add(0,0, 1);
        matrix.add(0,1, 2);
        matrix.add(0,2, 2);
        matrix.add(0,3, 2);
        matrix.add(1,0, 1);
        matrix.add(1,1, 2);
        matrix.add(1,2, 2);
        matrix.add(1,3, 2);
        matrix.add(2,0, 1);
        matrix.add(2,1, 8);
        matrix.add(2,2, 2);
        matrix.add(2,3, 2);
        matrix.add(3,0, 1);
        matrix.add(3,1, 2);
        matrix.add(3,2, 2);
        matrix.add(3,3, 2);
        boolean expected = false;
        assertEquals(expected, MatrixWorker.isSymmetric(matrix));
    }

}