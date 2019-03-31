package by.epam.javatrening.lukashuk.model.data;

import java.util.Arrays;

public class Matrix
{
    private double [][]array;
    private int columns;
    private int rows;

    public Matrix() {
        array = new double[0][];
    }

    public Matrix(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        array = new double[columns][rows];
    }

    public double get(int i, int j)
    {
        return array[i][j];
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public boolean add(int i , int j , double value)
    {
        if (i < columns && j < rows)
        {
            array[i][j] = value;
            return true;
        }
        return false;
    }


    public void swap(int i, int j, int k , int l)
    {
        double x = array[i][j];
        array[i][j] = array[k][l];
        array[k][l] = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Matrix{");
        for (int i = 0; i < columns; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                sb.append(array[i][j]).append(" ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
