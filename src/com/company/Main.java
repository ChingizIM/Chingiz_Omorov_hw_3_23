package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double chislo[] = {1.1, -2.2, -3.3, 4.4, 5.5, -6.6, 7.7, 8.8, 9.9, 10.10, -11.11, -12.12, 13.13, -14.14, 15.15};
        System.out.println(Arrays.toString(chislo));

        double sum = 0.0;
        double middle = 0.0;
        boolean minus = false;
        int plus = 0;


        for (double element : chislo)
            if (element < 0) {
                minus = true;
            } else if (minus && element > 1) {
                sum = sum + element;
                plus++;
                System.out.println("Количество положительных =" + plus);

            }
        middle = sum / plus;

        System.out.println("Сумма" + "=" + sum);
        System.out.println("Среднее Арифметическое =" + middle);
        System.out.println("----------------------------------");
        
        for (int i = 0; i < chislo.length; i++) {
            int minIndex = i;
            for (int j = i; j < chislo.length; j++) {
                if (chislo[j] < chislo[minIndex]) {
                    minIndex = j;
                }
            }
            //if (minIndex != i) {
            double temp = chislo[i];
            chislo[i] = chislo[minIndex];
            chislo[minIndex] = temp;
            System.out.println(Arrays.toString(chislo));
        }
    } }

        //double[] arr1 = {1.1, -2.2, -3.3, 4.4, 5.5, -6.6, 7.7, 8.8, 9.9, 10.10, -11.11, -12.12, 13.13, -14.14, 15.15};

   // }

        //double value = scanner.nextDouble();
        //double[] array = new double[value];
        //Double[][] poVozrastaniu = new Double[][]{{-6.6, -2.2, -3.3, -11.11, -12.12, -14.14},
               // {1.1, 4.4, 5.5, 7.7, 8.8, 9.9, 15.15, 10.10, 13.13}};
        //Scanner in = new Scanner(System.in);
        //for (int i = 0; i < poVozrastaniu.length; i++) {
           // for (Double[] doubles : poVozrastaniu) {

           // }

        //}
       // for (int i = 0; i < poVozrastaniu.length; i--) {
           // for (int j = 0; j < poVozrastaniu.length; j++) {
             //   if (poVozrastaniu[j].length()>poVozrastaniu[j+1].length()){
               //     double tmp = poVozrastaniu[j];
                 //   poVozrastaniu[j] = poVozrastaniu[j+1];
                   // poVozrastaniu[j+1] = tmp;
                //}
            //}
        //}
        //for (int i = 0; i < poVozrastaniu.length; i++) {
          //  System.out.println(poVozrastaniu[i]);
        //}
        //Arrays.sort(Comparator.reverseOrder(), poVozrastaniu);
        //System.out.println(Arrays.toString(poVozrastaniu));
       // for (int i = 0; i < poVozrastaniu.length; i++) {
            //for (int j = 0; j < poVozrastaniu.length; j++)

                //System.out.println(poVozrastaniu[i] + "");ZZ


   // }}

