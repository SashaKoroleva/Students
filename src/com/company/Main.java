package com.company;

import student.Catalog;
import student.Student;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Catalog BSU = new Catalog();

        BSU.sortOfList();

        for (int i = 0; i < BSU.getStudentsOfBSU().size(); i++) {
            System.out.println(BSU.getStudentsOfBSU().get(i));
        }


    }
}
