/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asat_p3;

/**
 *
 * @author ASUS
 */
public class PP_Parameter {

    public void Luas(int p, int l) {
        int L = p * l;
        System.out.println(L);
    }

    public int Keliling(int p, int l) {
        int K = 2 * (p + l);
        return K;
    }

    public static void main(String[] args) {
        PP_Parameter lll = new PP_Parameter();
        lll.Luas(10, 7);
        //lll.Keliling(7, 3);
        System.out.println("keliling persegipanjang = " + lll.Keliling(7, 7));
    }
}
