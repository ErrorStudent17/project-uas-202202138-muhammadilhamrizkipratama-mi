/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.students;
/**
 *
 * @author obosc
 */
public class Mahasiswa1{
    public String nama;
    public int nim, nilai_absen, nilai_tugas, nilai_uts, nilai_uas, nilai_akhir;
    
    public void setNilaiAkhir(){
        nilai_akhir = (nilai_absen*10/100) + (nilai_tugas*20/100) + (nilai_uts*30/100) + (nilai_uas*40/100);
    }
    
    public int getNilaiAkhir(){
        return nilai_akhir;
    }
}