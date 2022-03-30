/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundry;

/**
 *
 * @author felix ryan
 */
public class Laundry {

    public static void main(String[] args) {
        Client m = new Client();
        Petugas k = new Petugas();
        Jenislaundry b = new Jenislaundry();
        Transaksi t = new Transaksi();
        lapor l = new lapor();
        l.lapor(b);
        l.lapor(m);
        l.lapor(t, b);
        t.prosesTransaksi(m, t, b);
        l.lapor(t, b);
        l.lapor(b);
        l.lapor(m);
    }
}
