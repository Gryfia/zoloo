package com.example.zooloo.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;

import com.example.zooloo.database.entitas.Waiduri;

import java.util.List;

@Dao
public interface WaiduriDao {
    @Query("SELECT * FROM Waiduri")
    List<Waiduri> getAll();

    @Query("INSERT INTO Waiduri (nama, manfaat, harga, aroma, size, stock) VALUES(:Nama,:Manfaat,:Harga,:Aroma,:Size,:Stock)")
    void insertWaiduri(String Nama, String Manfaat, String Harga, String Aroma, String Size, String Stock);

    @Query("UPDATE Waiduri SET nama=:Nama , manfaat=:Manfaat, harga=:Harga , aroma=:Aroma , size=:Size , stock=:Stock WHERE id_waiduri=:id_waiduri")
    void update(int id_waiduri, String Nama, String Manfaat, String Harga, String Aroma, String Size, String Stock);

    @Query("SELECT * FROM Waiduri WHERE id_waiduri=:id_waiduri")
    Waiduri get(int id_waiduri);

    @Delete
    void delete(Waiduri Waiduri);

}


