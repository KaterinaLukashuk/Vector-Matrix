package by.epam.javatrening.lukashuk.controller;
import by.epam.javatrening.lukashuk.model.data.*;
import by.epam.javatrening.lukashuk.view.Output;

import java.util.Random;

import static by.epam.javatrening.lukashuk.model.logic.VectorWorker.*;

public class Main {
    public static final int SIZE_OF_VECTOR = 15;
    public static void main(String [] args)
    {
        Random random = new Random();
        Vector vector = new Vector();
        for (int i = 0 ; i < SIZE_OF_VECTOR; i++)
        {
            vector.add(random.nextDouble());
        }
        Output.printVector(vector);
        Output.printVector(vector);
        qSort(vector, 0 , vector.length() - 1);
        vector = revers(vector);
        bubbleSort(vector);
        binarySearch(vector, 0);
        lineSearch( vector, 0);
        getAverage(vector);
        getGeometricMean(vector);
        getFirstLocalMinIndex(vector);
        getMax(vector);
    }
}
