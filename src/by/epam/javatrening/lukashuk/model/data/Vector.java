package by.epam.javatrening.lukashuk.model.data;

import java.util.Arrays;

public class Vector {
    private int counter;
    private double [] array;
    private boolean dynamic;

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

    public Vector(Vector vector) {
        Vector copyOfVector = new Vector();
        for (int i = 0 ; i < vector.length(); i++)
        {
            copyOfVector.array[i] = vector.array[i];
        }
        copyOfVector.counter = vector.counter;
        copyOfVector.dynamic = vector.dynamic;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < array.length; i++)
        {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append('\n');
        return  stringBuilder.toString();
    }
}
