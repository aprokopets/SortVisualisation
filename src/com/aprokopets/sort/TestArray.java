package com.aprokopets.sort;

/**
 * Created by aprokopets on 18.01.2016.
 */
public class TestArray {
    // instance variables - replace the example below with your own
    private int[] Array;

    /**
     * Constructor for objects of class ArraySort
     */
    public TestArray(int[] Ar)
    {
        // initialise instance variables
        Array = new int[Ar.length];
        int j;
        for (int i=0; i<Ar.length;i++)
        {
            Array[i] = Ar[i];
            j = Array[i];
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void selectionSort()
    {
        // put your code here
        int temp = -1;
        int index = -1;
        for (int i=0; i< Array.length-1; i++)
        {
            int min = 200000000;
            for (int j = i; j< Array.length; j++)
            {
                if (Array[j]<min)
                {
                    min = Array[j];
                    index = j;
                }
            }
            temp = Array[i];
            Array[i] = Array[index];
            Array[index] = temp;
        }
    }

    public void printArray(String prefix)
    {
        System.out.print(prefix);
        int length = Array.length;
        for (int i=0; i<Array.length; i++)
        {
            System.out.print(Array[i]+" ");
        }
        System.out.println();
    }
}
