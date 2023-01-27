///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// */
//
//package com.mycompany.students;
//
//import java.util.Scanner;
//
///**
// *
// * @author obosc
// */
//public class Students {
//    public static void main (String [] args) {
//        Scanner masuk = new Scanner (System.in);
//        
//        String nama;
//        int nim, nilai_absen, nilai_tugas, nilai_uts, nilai_uas, nilai_akhir;
//        
//        System.out.println("--------------------------------------------");
//        System.out.println("|Menentukan Nilai Akhir dan Grade Mahasiswa|");
//        System.out.println("--------------------------------------------");
//        System.out.println("Masukkan NIM : ");
//        nim = masuk.nextInt ();
//        
//        System.out.println("Masukkan Nama Mahasiswa : "); 
//        masuk.nextLine();
//        nama = masuk.nextLine();
//        
//        System.out.println("Masukkan Nilai Absen : ");
//        nilai_absen = masuk.nextInt ();
//        
//        System.out.println("Masukkan Nilai Tugas : ");
//        nilai_tugas = masuk.nextInt ();
//        
//        System.out.println("Masukkan Nilai UTS : ");
//        nilai_uts = masuk.nextInt ();
//        
//        System.out.println("Masukkan Nilai UAS : ");
//        nilai_uas = masuk.nextInt ();
//        
//        nilai_akhir = (nilai_absen*10/100) + (nilai_tugas*20/100) + (nilai_uts*30/100) + (nilai_uas*40/100);
//        
//        System.out.println ("---------------------------------------");
//        System.out.println ("|Hasil Nilai Akhir dan Grade Mahasiswa|");
//        System.out.println ("---------------------------------------");
//        System.out.println ("NIM : " + nim);
//        System.out.println ("Nama : " + nama);
//        System.out.println ("Nilai Absen : " + nilai_absen);
//        System.out.println ("Nilai Tugas : " + nilai_tugas);
//        System.out.println ("Nilai UTS : " + nilai_uts);
//        System.out.println ("Nilai UAS : " + nilai_uas);
//        System.out.println ("Nilai Akhir : " + nilai_akhir);
//        
//        if (nilai_akhir >= 80&& nilai_akhir <=100){
//            System.out.println("Grade A");
//        }else if (nilai_akhir >= 65&& nilai_akhir <=80){
//            System.out.println("Grade B");
//        }else if (nilai_akhir >= 50&& nilai_akhir <=65){
//            System.out.println("Grade C");
//        }else if (nilai_akhir >= 40&& nilai_akhir <=50){
//            System.out.println("Grade D");
//        }else if (nilai_akhir <= 40){
//            System.out.println("Grade E");
//        }
//    }
//}
