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
public class lapor {

    public void lapor(Jenislaundry jenislaundry) {
        int x = jenislaundry.getJenisLaundry();

        System.out.println();
        System.out.println("Tabel Jenis Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tHarga \tDurasi");
        for (int i = 0; i < x; i++) {
            System.out.println(jenislaundry.getJenisLaundry(i) + "\t"
                    + jenislaundry.getHarga(i) + "\t" + jenislaundry.getdurasi(i));
        }
    }

    public void lapor(Client client) {
        int x = client.getJmlClient();

        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama    \tAlamat    \t\tTelepon         \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t"
                    + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t"
                    + client.getSaldo(i));
        }
    }

    public void lapor(Transaksi transaksi, Jenislaundry jnslaundry) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Jenis transaksi\tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyak(i) * jnslaundry.getHarga(transaksi.idjenislaundry(i));
            total += jumlah;

            System.out.println(jnslaundry.getJenisLaundry(transaksi.idjenislaundry(i)) + "\t" + transaksi.getBanyak(i) + "\t" + jnslaundry.getHarga(transaksi.idjenislaundry(i)) + "\t"
                    + jumlah);
        }
        System.out.println("Total Omset =" + total);
    }
}
