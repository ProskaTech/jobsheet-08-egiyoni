package com.mycompany.tugas.js08;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class ArraySample3 {
    public static void main(String[] args) {
        
        //String array 4 baris x 2 kolom
        String[][] dogs = { {"Terry", "brown"}, //ini baris ke 0 dan kolom 1 dan 2
                            {"Kristin", "white"}, //ini baris ke 1 dan kolom 1 dan 2
                            {"Toby", "gray"}, //ini baris ke 2 dan kolom 1 dan 2
                            {"Fido", "black"} // ini baris ke 3 dan kolom 1 dan 2
                          };
        System.out.print(dogs[3][1]); //[3][1] akan menampilkan nama black, contoh lain misal [2][0] maka akan tampil nama toby
        //mengakses variabel dogs dengan indeks baris 0, indeks kolom 0
        }
    }