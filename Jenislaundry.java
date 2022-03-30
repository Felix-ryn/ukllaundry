/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllaundry;

import java.util.ArrayList;

/**
 *
 * @author felix ryan
 */
public class Jenislaundry {

    private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public Jenislaundry() {
        this.JenisLaundry.add("laundry 1 kilo");
        this.harga.add(10000);
        this.durasi.add(3);
        this.JenisLaundry.add("dry clean");
        this.harga.add(15000);
        this.durasi.add(2);
        this.JenisLaundry.add("Self Service");
        this.harga.add(7000);
        this.durasi.add(2);
        this.JenisLaundry.add("On Demand ");
        this.harga.add(20000);
        this.durasi.add(1);

    }

    public int getJenisLaundry() {
        return this.JenisLaundry.size();
    }

    public void setJenisLaundry(String JenisLaundry) {
        this.JenisLaundry.add(JenisLaundry);
    }

    public String getJenisLaundry(int JenisLaundry) {
        return this.JenisLaundry.get(JenisLaundry);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idJenisLaundry) {
        return this.harga.get(idJenisLaundry);
    }

    public void editharga(int idJenisLaundry, int Harga) {
        this.harga.set(idJenisLaundry, Harga);;
    }

    public void setdurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public int getdurasi(int idJenisLaundry) {
        return this.durasi.get(idJenisLaundry);
    }

    void editHarga(int idJenislaundry, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
