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
public class Petugas implements user {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas() {
        this.namaPetugas.add("admin");
        this.alamat.add("kedung kandang");
        this.telepon.add("081112223333");
        this.jabatan.add(0);
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int id) {
        return this.jabatan.get(id);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

}
