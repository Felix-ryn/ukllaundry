/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package ukllaundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felix ryan
 */
public class Transaksi {

    private final ArrayList<Integer> idjenislaundry = new ArrayList<Integer>();
    private final ArrayList<Integer> banyak = new ArrayList<Integer>();
    private final ArrayList<Integer> idclient = new ArrayList<Integer>();

    public Transaksi() {
        this.idclient.add(0);
        this.idjenislaundry.add(0);
        this.banyak.add(0);
        this.idclient.add(0);
        this.idjenislaundry.add(1);
        this.banyak.add(0);
        this.idclient.add(0);
        this.idjenislaundry.add(2);
        this.banyak.add(0);
        this.idclient.add(0);
        this.idjenislaundry.add(3);
        this.banyak.add(0);
        //        this.idclient.add(0);
        //        this.idjenislaundry.add(4);
        //        this.banyak.add(0);
        //        this.idclient.add(0);
        //        this.idjenislaundry.add(5);
        //        this.banyak.add(0);
        //        this.idclient.add(0);
        //        this.idjenislaundry.add(6);
        //        this.banyak.add(0);
    }

    public void prosesTransaksi(Client client, Transaksi transaksi, Jenislaundry jenislaundry) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan masukan ID Client dan  pilih jenis laundry ");
        System.out.println("Masukkan ID Client");
        int idclient = myObj.nextInt();
        System.out.println("Selamat datang " + client.getNama(idclient));
        ArrayList<Integer> idJenislaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode jenis Luandry:");
            temp = myObj.nextInt();
            if (temp != 99) {
                idJenislaundry.add(temp);
                System.out.print(jenislaundry.getJenisLaundry(idJenislaundry.get(i)) + "sebanyak :");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println("Transaksi belanja " + client.getNama(idclient)+ "sebagai berikut");
        System.out.println("Jenis laundry \tQty   \tharga \tdurasi   \t");

       int total = 0; 
        int x = idJenislaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenislaundry.getHarga(idJenislaundry.get(j));
            total += jumlah;
            System.out.println(jenislaundry.getJenisLaundry(idJenislaundry.get(j)) + "\t"
                    + banyak.get(j) + "\t"
                    + jenislaundry.getHarga(idJenislaundry.get(j)) + "\t"
                    + jumlah);
            transaksi.setTransaksi(jenislaundry, idclient, idJenislaundry.get(j), banyak.get(j));
        }

        System.out.println("Total Belanja : " + total);
        client.editSaldo(idclient, client.getSaldo(idclient) - total);
// int total = 0;
//        int x = idBarang.size();
//        for (int j = 0; j < x; j++) {
//            int jumlah = banyak.get(j) * barang.getHarga(idBarang.get(j));
//            total += jumlah;
//            System.out.println(barang.getNamaBarang(idBarang.get(j)) + "\t"
//                    + banyak.get(j) + "\t"
//                    + barang.getHarga(idBarang.get(j)) + "\t"
//                    + jumlah);
//            transaksi.setTransaksi(barang, idMember, idBarang.get(j),
//                    banyak.get(j));
//        }
//
//        System.out.println("Total Belanja : " + total);
//        member.editSaldo(idMember, member.getSaldo(idMember) - total);
//    }       
    }

    public void setTransaksi(Jenislaundry jenislaundry, int idclient, int idJenislaundry, int banyaknya) {
        this.idclient.add(idclient);
        this.idjenislaundry.add(idJenislaundry);
        this.banyak.add(banyaknya);
        jenislaundry.editharga(idJenislaundry, jenislaundry.getHarga(idJenislaundry) - banyaknya);
    }

    public int idjenislaundry(int id) {
        return this.idjenislaundry.get(id);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }

    public int idclient(int id) {
        return this.idjenislaundry.get(id);
    }

    public int getJmlTransaksi() {
        return this.idclient.size();
    }

}
