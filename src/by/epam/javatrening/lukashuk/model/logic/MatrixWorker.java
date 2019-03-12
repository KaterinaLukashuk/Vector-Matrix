package by.epam.javatrening.lukashuk.model.logic;

import by.epam.javatrening.lukashuk.model.data.Matrix;

public class MatrixWorker {
    public static double getMax(Matrix matrix)
    {
        double max = matrix.get(0,0);
        for (int i = 0; i < matrix.getColumns(); i++)
        {
            for (int j = 0; j < matrix.getRows(); j++)
            {
                if (matrix.get(i , j) > max)
                {
                    max = matrix.get(i , j);
                }
            }
        }
        return max;
    }

    public static boolean isSymmetric(Matrix matrix)
    {
        if (matrix.getColumns() == matrix.getRows()) {
            for (int i = 0; i < matrix.getRows(); i++) {
                for (int j = 0; j < matrix.getColumns(); j++) {
                    if (matrix.get(i, j) != matrix.get(j, i) && i != j) {
                        return false;
                    }
                }
            }
            return true;
        }else {
        return false;
        }
    }

    public static Matrix transpose(Matrix matrix)
    {
        if (matrix.getRows() != matrix.getColumns())
        {
        Matrix temp = new Matrix(matrix.getRows(), matrix.getColumns());
            for (int i = 0; i < temp.getColumns(); i++)
            {
                for (int j = 0; j < temp.getRows(); j++)
                {
                    temp.add(i , j , matrix.get(j, i));
                }
            }
            matrix = temp;
        }
        else {
            for (int i = 0; i < matrix.getColumns(); i++) {
                for (int j = i; j < matrix.getRows(); j++) {
                    matrix.swap(i, j, j, i);
                }
            }
        }
        return matrix;
    }
}
