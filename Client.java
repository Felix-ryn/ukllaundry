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
public class Client implements user {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        this.namaClient.add("felix      ");
        this.alamat.add("bulan bintang      ");
        this.telepon.add("08198778878       ");
        this.saldo.add(400000);

        this.namaClient.add("haikals ");
        this.alamat.add("matahari bersinar   ");
        this.telepon.add("081222233344      ");
        this.saldo.add(200000);

        this.namaClient.add("radit hyoks");
        this.alamat.add("cemoro laut     ");
        this.telepon.add("081222233344      ");
        this.saldo.add(200000);

        this.namaClient.add("maul      ");
        this.alamat.add("kelurahan pluto    ");
        this.telepon.add("0819875876        ");
        this.saldo.add(300000);

        this.namaClient.add("ahrasoy    ");
        this.alamat.add("benua mergosono    ");
        this.telepon.add("0815678765        ");
        this.saldo.add(500000);

        this.namaClient.add("clatem    ");
        this.alamat.add("jombang pride       ");
        this.telepon.add("08156678876        ");
        this.saldo.add(250000);

        this.namaClient.add("nabilaradin    ");
        this.alamat.add("mojokerto bersatu  ");
        this.telepon.add("0815667765        ");
        this.saldo.add(320000);

        this.namaClient.add("eka dian     ");
        this.alamat.add("omah e mak'e       ");
        this.telepon.add("0815664543        ");
        this.saldo.add(270000);

        this.namaClient.add("vreku     ");
        this.alamat.add("omah e mak'e       ");
        this.telepon.add("0815664543        ");
        this.saldo.add(370000);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }

    public void editSaldo(int idMember, int saldo) {
        this.saldo.set(idMember, saldo);
    }

    public int getJmlClient() {
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaMember) {
        this.namaClient.add(namaMember);

    }

    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String Telepon) {
        this.telepon.add(Telepon); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama(int idMember) {
        return this.namaClient.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }
}
