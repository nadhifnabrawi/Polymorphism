/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author nadhif
 */
public class Polymorphism {
     int tambah;
    int kurang;
    int kali;
    int bagi;
    double doubleTambah;
    double doubleKurang;
    double doubleKali;
    double doubleBagi;

    void setPertambahan (int a, int b){
        tambah = a + b;
    }
    void setPertambahan (int a, int b, int c){
        tambah = a + b + c;
    }
    void setPertambahan (double a, double b){
        doubleTambah = a + b;
    }
    void setPertambahan (double a, double b, double c){
        doubleTambah = a + b + c;
    }
    void setPengurangan(int a, int b){
        kurang = a - b;
    }
    void setPengurangan(int a, int b, int c){
        kurang = a - b - c;
    }
    void setPengurangan(double a, double b){
        doubleKurang = a - b;
    }
    void setPengurangan(double a, double b, double c){
        doubleKurang = a - b - c;
    }
    void setPerkalian(int a, int b){
        kali = a * b;
    }
    void setPerkalian(int a, int b,int c){
        kali = a * b * c;
    }
    void setPerkalian(double a, double b){
        doubleKali = a * b ;
    }
    void setPerkalian(double a, double b, double c){
        doubleKali = a * b * c;
    }
    void setPembagian(int a, int b){
        bagi = a / b;
    }
    void setPembagian(int a, int b,int c){
        bagi = a / b / c;
    }
    void setPembagian(double a, double b){
        doubleBagi = a / b;
    }
    void setPembagian(double a, double b, double c){
        doubleBagi = a / b / c;
    }
    int getPertambahan (){
        return tambah;
    }
    double getDoublePertambahan(){
        return doubleTambah;
    }
    int getPengurangan (){
        return kurang;
    }
    double getDoublePengurangan(){
        return doubleKurang;
    }
    int getPerkalian (){
        return kali;
    }
    double getDoublePerkalian(){
        return doubleKali;
    }
    int getPembagian (){
        return bagi;
    }
    double getDoublePembagian(){
        return doubleBagi;
    }
}

