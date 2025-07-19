package Inheritance.Example_2;

import Inheritance.Example_1.Programmer;

public class CseTeacher extends Teacher {
    String mainSubject = "CSE";

    public static void main(String[] args) {
        CseTeacher p = new CseTeacher();
        System.out.println("Designation name : " + p.designation);
        System.out.println("University name  : " + p.uniName);
        System.out.println("Subject name     : " + p.mainSubject);
    }
}
