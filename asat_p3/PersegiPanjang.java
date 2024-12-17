/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asat_p3;

/**
 *
 * @author ASUS
 */
class PersegiPanjang {

    int P = 7;
    int L = 10;

    public void Luas() {
        int l = P * L;
        System.out.println("luas Persegi Panjang = " + l);
    }

    public int Keliling() {
        int K = 2 * (P * L);
        return K;
    }

    public static void main(String[] args) {
        PersegiPanjang PP = new PersegiPanjang();
        //PP.Luas();
        PP.Luas();
        //PP.Keliling();
        System.out.println(" keliling = " + PP.Keliling());
    }
}
