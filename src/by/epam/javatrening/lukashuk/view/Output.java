package by.epam.javatrening.lukashuk.view;

import by.epam.javatrening.lukashuk.model.data.Matrix;
import by.epam.javatrening.lukashuk.model.data.Vector;

public class Output {
    public static void print(String s)
    {
        System.out.println(s);
    }

    public static void printMatrix(Matrix matrix)
    {
        for (int i = 0; i < matrix.getColumns(); i++)
        {
            for (int j = 0; j < matrix.getRows(); j++)
            {
                System.out.print(matrix.get(i , j) + " ");
            }
            System.out.println();
        }
    }

    public static void printVector(Vector vector)
    {
        for (int i = 0 ; i < vector.length() ; i++)
        {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();
    }
}
