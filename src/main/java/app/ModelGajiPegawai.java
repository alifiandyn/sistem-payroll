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
public class ModelGajiPegawai {
    private double gajiPokok,tunjanganTransport,tunjanganAnak,tunjanganKesehatan,upahLembur,tunjanganLain;
    
    private String komponenGajiPegawai;
    
    public ModelGajiPegawai(String komponenGajiPegawai){
        this.komponenGajiPegawai = komponenGajiPegawai;
    }
    
    public String GetKomponenGajiPegawai(){
        return komponenGajiPegawai;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjanganTransport() {
        return tunjanganTransport;
    }

    public void setTunjanganTransport(int tunjanganTransport) {
        this.tunjanganTransport = tunjanganTransport;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setTunjanganAnak(int tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public double getTunjanganKesehatan() {
        return tunjanganKesehatan;
    }

    public void setTunjanganKesehatan(int tunjanganKesehatan) {
        this.tunjanganKesehatan = tunjanganKesehatan;
    }

    public double getUpahLembur() {
        return upahLembur;
    }

    public void setUpahLembur(int upahLembur) {
        this.upahLembur = upahLembur;
    }

    public double getTunjanganLain() {
        return tunjanganLain;
    }

    public void setTunjanganLain(int tunjanganLain) {
        this.tunjanganLain = tunjanganLain;
    }
    
    @Override
    public String toString(){
        return komponenGajiPegawai;
    }
}
