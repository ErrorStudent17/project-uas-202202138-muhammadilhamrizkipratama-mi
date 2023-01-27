/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.students;

/**
 *
 * @author obosc
 */
public class Mahasiswa2 extends Mahasiswa3{    
    public String getGrade(int grade){
        if(grade >= 80 && grade <= 100){
            return "Grade : A";
        }else if (grade >= 65 && grade <= 80){
            return "Grade : B";
        }else if (grade >= 56 && grade <= 65){
            return "Grade : C";
        }else if (grade >= 40 && grade <= 56){
            return "Grade : D";
        }
        return "error Grade...!";

//        return ("GRADE : " + grade);
    }
}