package com.example.zooloo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.waiduriid.R;

public class ActivityTampil extends AppCompatActivity {
    TextView tampilNama, tampilManfaat, tampilHarga, tampilAroma, tampilSize, tampilStock;
    String nama, manfaat, harga, aroma, size, stock;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        tampilNama = (TextView) findViewById(R.id.tampilNama);
        tampilManfaat = (TextView) findViewById(R.id.tampilManfaat);
        tampilHarga = (TextView) findViewById(R.id.tampilHarga);
        tampilAroma = (TextView) findViewById(R.id.tampilAroma);
        tampilSize = (TextView) findViewById(R.id.tampilSize);
        tampilStock = (TextView) findViewById(R.id.tampilStock);

        if (getIntent().getStringExtra("nama") != "") {
            nama = getIntent().getStringExtra("nama");
            tampilNama.setText(nama);
        }
        if (getIntent().getStringExtra("manfaat") != "") {
            manfaat = getIntent().getStringExtra("manfaat");
            tampilManfaat.setText(manfaat);
        }
        if (getIntent().getStringExtra("harga") != "") {
            harga = getIntent().getStringExtra("harga");
            tampilHarga.setText(harga);
        }
        if (getIntent().getStringExtra("aroma") != "") {
            aroma = getIntent().getStringExtra("aroma");
            tampilAroma.setText(aroma);
        }
        if (getIntent().getStringExtra("size") != "") {
            size = getIntent().getStringExtra("size");
            tampilSize.setText(size);
        }
        if (getIntent().getStringExtra("stock") != "") {
            stock = getIntent().getStringExtra("stock");
            tampilStock.setText(stock);
    }
}
    public void  submit (View view) {
        Intent intent = new Intent(ActivityTampil.this, MainActivity.class);
        startActivity(intent);
    }
}


