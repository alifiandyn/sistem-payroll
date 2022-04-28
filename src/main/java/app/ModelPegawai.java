/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Alif
 */
public class ModelPegawai {
    private String nip, nama, tempatLahir, tglLahir, alamatEmail,noTelp;
    
    public ModelPegawai(String nip, String nama, String tempatLahir, String tglLahir, String alamatEmail, String noTelp){
        this.nip=nip;
        this.nama=nama;
        this.tempatLahir=tempatLahir;
        this.tglLahir=tglLahir;
        this.alamatEmail=alamatEmail;
        this.noTelp=noTelp;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    @Override
    public String toString(){
        return nama;
    }
}
