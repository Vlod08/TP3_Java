package test;

import base.Complexe;
import historique.ComplexeMemoire;

import java.util.Arrays;
import java.util.Collections;

public class Test{
    public Test() {

        ComplexeMemoire cm1 = new ComplexeMemoire(1.0, 2.0);
        ComplexeMemoire cm2 = new ComplexeMemoire(3.0, 4.0);
        ComplexeMemoire cm3 = new ComplexeMemoire(5.0, 6.0);
        ComplexeMemoire cm4 = new ComplexeMemoire(-2.0, 7.0);
        ComplexeMemoire cm5 = new ComplexeMemoire(8.0, -4.0);
        cm1.addition(cm2);
        cm1.multiplication(cm3);
        cm1.addition(cm2);
        cm2.multiplication(cm3);
        cm3.addition(cm1);
        cm4.multiplication(cm5);
        cm5.addition(cm1);
        cm1.multiplication(cm3);
        cm2.addition(cm4);
        cm3.multiplication(cm5);
        cm4.addition(cm1);
        /*****
        Cm1 : 7 operations;
        Cm2: 4 operations;
        Cm3: 5 operations;
        Cm4: 3 operations;
        Cm5 : 3 operations;
        *****/
        ComplexeMemoire[] arr = {cm5,cm4,cm3,cm2,cm1};
        System.out.println("Before Sorting");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i].toString());
            System.out.println(arr[i].getHistorique().size());
        }

        Arrays.sort(arr);
        System.out.println("After Sorting");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i].toString());
            System.out.println(arr[i].getHistorique().size());
        }

    }

}

