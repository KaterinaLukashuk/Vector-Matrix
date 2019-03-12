package by.epam.javatrening.lukashuk.model.data;

import java.util.Arrays;

public class Vector {
    int counter;
    double [] array;
    boolean dynamic;

    public Vector() {
        array = new double[0];
        counter = 0;
        dynamic = true;
    }

    public Vector(int size) {
        array = new double[size];
        counter = 0;
        dynamic = false;
    }

    public double[] getArray() {
        return array;
    }

    public boolean add(double element)
    {
        if (counter >= array.length)
        {
            if (!dynamic)
            {
                return false;
            }
            array = Arrays.copyOf(array, array.length + 1);
        }
        array[counter] = element;
        counter++;
        return true;
    }

    public double get(int index)
    {
        return array[index];
    }

    public int length()
    {
        return array.length;
    }

    public void swap(int i , int j)
    {
        double x = array[i];
        array[i] = array[j];
        array[j] = x;
    }
}
