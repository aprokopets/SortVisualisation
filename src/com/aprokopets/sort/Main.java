package com.aprokopets.sort;

/**
 * Created by aprokopets on 18.01.2016.
 */

import java.util.Random;
import javax.swing.*;
import java.awt.Dimension;

public class Main
{
    public static void main(String[] args)
    {
        int length = 20;
        int[] array = new int[length];
        Random generator = new Random(125);
        //System.out.print("Start array is: ");
        for (int i =0;i<length;i++)
        {
            array[i] = generator.nextInt(100);
            //System.out.print(array[i]+",");
        }
        // System.out.println();

        TestArray notSortedArray = new TestArray(array);
        notSortedArray.printArray("nonSorted array is: ");
        notSortedArray.selectionSort();
        notSortedArray.printArray("Sorted array is:    ");

        
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(100, 100, 200, 200);

        JLabel label = new JLabel("Test label");
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(200, 100));

        frame.pack();
        frame.setVisible(true);
    }
}

