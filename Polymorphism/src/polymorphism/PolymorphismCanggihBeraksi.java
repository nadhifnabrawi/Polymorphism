/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author nadhif
 */
public class PolymorphismCanggihBeraksi {
     public static void main(String[] args) {
        PolymorphismCanggih mtk = new PolymorphismCanggih();

        mtk.setPertambahan(23, 34);
        System.out.println("Hasil dari Pertambahan (2 int) = " + mtk.getPertambahan());

        mtk.setPertambahan(12, 28, 14);
        System.out.println("Hasil dari Pertambahan (3 int) = " + mtk.getPertambahan());

        mtk.setPertambahan(3.4, 4.9);
        System.out.println("Hasil dari Pertambahan (2 double) = " + mtk.getDoublePertambahan());

        mtk.setPertambahan(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Pertambahan (3 double) = " + String.format("%.2f",mtk.getDoublePertambahan()));

        mtk.setPengurangan(23, 34);
        System.out.println("Hasil dari Pengurangan (2 int) = " + mtk.getPengurangan());

        mtk.setPengurangan(12, 28, 14);
        System.out.println("Hasil dari Pengurangan (3 int) = " + mtk.getPengurangan());

        mtk.setPengurangan(3.4, 4.9);
        System.out.println("Hasil dari Pengurangan (2 double) = " + mtk.getDoublePengurangan());

        mtk.setPengurangan(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Pengurangan (3 double) = " + String.format("%.2f",mtk.getDoublePengurangan()));

        mtk.setPerkalian(23, 34);
        System.out.println("Hasil dari Perkalian (2 int) = " + mtk.getPerkalian());

        mtk.setPerkalian(12, 28, 14);
        System.out.println("Hasil dari Perkalian (3 int) = " + mtk.getPerkalian());

        mtk.setPerkalian(3.4, 4.9);;
        System.out.println("Hasil dari Perkalian (2 double) = " + mtk.getDoublePerkalian());

        mtk.setPerkalian(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Perkalian (3 double) = " + String.format("%.2f",mtk.getDoublePerkalian()));

        mtk.setPembagian(23, 34);
        System.out.println("Hasil dari Pembagian (2 int) = " + mtk.getPembagian());

        mtk.setPembagian(12, 28, 14);
        System.out.println("Hasil dari Pembagian (3 int) = " + mtk.getPembagian());

        mtk.setPembagian(3.4, 4.9);
        System.out.println("Hasil dari Pembagian (2 double) = " + mtk.getDoublePembagian());

        mtk.setPembagian(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Pembagian (3 double) = " + String.format("%.2f",mtk.getDoublePembagian()));

        mtk.setModulus(23, 34);
        System.out.println("Hasil dari Modulus (2 int) = " + mtk.getModulus());

        mtk.setModulus(12, 28, 14);
        System.out.println("Hasil dari Modulus (3 int) = " + mtk.getModulus());

        mtk.setModulus(3.4, 4.9);
        System.out.println("Hasil dari Modulus (2 double) = " + mtk.getDoubleModulus());

        mtk.setModulus(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Modulus (3 double) = " + String.format("%.2f",mtk.getDoubleModulus()));
    }
}

