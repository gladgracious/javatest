package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/**
 * Arraymethods
 */
public class Arraymethods {

    public static void main(String[] args) {
        
        int a[]=new int[3];
        System.out.println(a);
        Arrays.asList( new Employee(1,"amith",7000),new Employee(2,"devi",6000),new Employee(3,"vikram",4000));
        
    Comparator<Employee> comp=null;
    int sval=7000;
    int rval=Arrays.binarySearch(a, 1);
    System.out.println(rval);




}}