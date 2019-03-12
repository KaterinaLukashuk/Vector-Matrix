package by.epam.javatrening.lukashuk.model.logic;


import by.epam.javatrening.lukashuk.model.data.Vector;

public class VectorWorker {
    public static double getMax(Vector vector)
    {
        double max = vector.get(0);
        for (int i = 0; i < vector.length(); i++)
        {
            if (max < vector.get(i))
            {
                max = vector.get(i);
            }
        }
        return max;
    }

    public static double getMin(Vector vector)
    {
        double min = vector.get(0);
        for (int i = 0; i < vector.length(); i++)
        {
            if (min > vector.get(i))
            {
                min = vector.get(i);
            }
        }
        return min;
    }

    public static  double getAverage(Vector vector)
    {
        double sum = 0;
        for (int i = 0; i < vector.length(); i++)
        {
            sum += vector.get(i);
        }
        return sum /= vector.length();
    }
    public static  double getGeometricMean(Vector vector)
    {
        double product = 1;
        for (int i = 0; i < vector.length(); i++)
        {
            if (vector.get(i) > 0)
            {
                product *= vector.get(i);
            }else {
                return -1;
            }
        }
        return Math.pow(product, 1.0/vector.length());
    }

    public static  boolean  isSorted(Vector vector)
    {
        for (int i = 0; i + 1 < vector.length(); i++)
        {
            if (vector.get(i) > vector.get(i + 1))
            {
                return false;
            }
        }
        return true;
    }

    public static  int getFirstLocalMinIndex(Vector vector)
    {
        if (vector.get(0) < vector.get(1))
        {
            return 0;
        }
        for (int i = 1; i + 1 < vector.length(); i++)
        {
            if ( vector.get(i) < vector.get(i-1) &&  vector.get(i) < vector.get(i+1) )
            {
                return i;
            }
        }
        if ( vector.get(vector.length() - 1) < vector.get(vector.length() - 2) )
        {
            return vector.length() - 1;
        }
        return -1;
    }

    public static  Vector revers(Vector vector)
    {
        int i = 0;
        int j = vector.length() - 1;
        while (i != j)
        {
            vector.swap(i, j);
            i++;
            j--;
        }
        return vector;
    }

    public static  void qSort(Vector vector, int left, int right)
    {

        int lt = left;
        int rt= right;
        Double middle = vector.get((rt + lt )/2);
        while (lt <=  rt)
        {
            while (vector.get(lt) < middle)
            {
                lt++;
            }
            while (vector.get(rt) > middle)
            {

                rt--;
            }

            if (lt <= rt)
            {
                vector.swap(lt++, rt--);
            }
        }
        if (left < rt)
        {
            qSort(vector, left, rt);
        }
        if (right > lt)
        {
            qSort(vector, lt, right);
        }
    }
    public static  void bubbleSort(Vector vector)
    {
        int swap = 1;

        while (swap != 0)
        {
            swap = 0;
            for (int i = 0; i + 1 < vector.length(); i++)
            {
                if (vector.get(i) > vector.get(i + 1))
                {
                    vector.swap(i ,i + 1);
                    swap++;
                }
            }
        }
    }
    public static  int binarySearch(Vector vector, double element)
    {
        if (isSorted(vector))
        {
            int i = 0;
            int j = vector.length() - 1;
            while (i < j)
            {
                int index = (j + i)/2;
                if (vector.get(index) == element)
                {
                    return index;
                }
                if (vector.get(index)> element)
                {
                    j = index;
                }else
                    {
                        i = index;
                    }
            }
            return -1;
        }
        return -2;
    }

    public static  int lineSearch(Vector vector, double element)
    {
        for (int i = 0; i < vector.length(); i++)
        {
            if (vector.get(i) == element)
            {
                return i;
            }
        }
        return -1;
    }
}
