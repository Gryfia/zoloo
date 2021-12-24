package com.example.zooloo.database.entitas;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Waiduri {
    @PrimaryKey(autoGenerate = true)
    public int id_waiduri;

    public String Nama;
    public String Manfaat;
    public String Harga;
    public String Aroma;
    public String Size;
    public String Stock;

    public int getId_waiduri() {
        return id_waiduri;
    }

    public void setId_waiduri(int id_waiduri) {
        this.id_waiduri = id_waiduri;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getAroma() {
        return Aroma;
    }

    public void setAroma(String Aroma) {
        this.Aroma = Aroma;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        this.Harga = harga;
    }

    public String getManfaat() {
        return Manfaat;
    }

    public void setManfaat(String manfaat) {
        this.Manfaat = manfaat;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) { this.Size = size; }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        this.Stock = stock;
    }
}
