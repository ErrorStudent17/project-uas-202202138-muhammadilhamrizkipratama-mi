/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.students;

import java.util.Scanner;

/**
 *
 * @author obosc
 */
public class Mahasiswa3{
    public static void main(String[] args) {
        Mahasiswa1 findRecord = new Mahasiswa1();
        Mahasiswa2 findMahasiswa2 = new Mahasiswa2();
        Scanner masuk = new Scanner (System.in);
              
        System.out.println("--------------------------------------------");
        System.out.println("|Menentukan Nilai Akhir dan Grade Mahasiswa|");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan NIM : ");
        findRecord.nim = masuk.nextInt ();
        
        System.out.print("Masukkan Nama Mahasiswa : "); 
        masuk.nextLine();
        findRecord.nama = masuk.nextLine();
        
        System.out.print("Masukkan Nilai Absen : ");
        findRecord.nilai_absen = masuk.nextInt ();
        
        System.out.print("Masukkan Nilai Tugas : ");
        findRecord.nilai_tugas = masuk.nextInt ();
        
        System.out.print("Masukkan Nilai UTS : ");
        findRecord.nilai_uts = masuk.nextInt ();
        
        System.out.print("Masukkan Nilai UAS : ");
        findRecord.nilai_uas = masuk.nextInt ();
        
        findRecord.setNilaiAkhir();
        
        System.out.println ("---------------------------------------");
        System.out.println ("|Hasil Nilai Akhir dan Grade Mahasiswa|");
        System.out.println ("---------------------------------------");
        System.out.println ("NIM : " + findRecord.nim);
        System.out.println ("Nama : " + findRecord.nama);
        System.out.println ("Nilai Absen : " + findRecord.nilai_absen);
        System.out.println ("Nilai Tugas : " + findRecord.nilai_tugas);
        System.out.println ("Nilai UTS : " + findRecord.nilai_uts);
        System.out.println ("Nilai UAS : " + findRecord.nilai_uas);
        System.out.println ("Nilai Akhir : " + findRecord.getNilaiAkhir());
        System.out.println (findMahasiswa2.getGrade(findRecord.getNilaiAkhir()));
    }
}
