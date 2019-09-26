package com.e.tenggatwaktu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class TenggatWaktu extends AppCompatActivity {

    String[] items={
            "72140020	Brayen Chanzezar Saroinsong",
            "72140048	Arnold Stanley Rivaldy Tato",
            "72150019	Verina Kristanti Wiyono",
            "72150043	Yubelince Naomi Wakum",
            "72150066	Hendry Masiku",
            "72160033	Baskoro Adi Wicaksono",
            "72170092	Yos Rafel Kristanto",
            "72170106	Alfadeo Melody Jeremy Bulin",
            "72170110	Yashinta Novita Dewi",
            "72170112	Yalina Hosea",
            "72170125	Adrian Paskalis",
            "72170126	Desta Siwi P",
            "72170131	Cindy Claudya",
            "72170146	Angkie Octovaldo Elias Wangkay",
            "72170148	Christian Dorra",
            "72170154	Tita Marita Simangunsong",
            "72170155	Angga Dwi Kaharap",
            "72170158	Fransiska Ayu Gloria",
            "72170160	Mika Havennia Sirait",
            "72170166	Marni Eva Kristina Saragih",
            "72170168	Aristyo Rahadian Agung Nugroho",
            "72170170	Laurentia Yulia Cristi",
            "72170172	Putu Abdi Setiawan"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenggat_waktu);

        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(new ArrayAdapter<String>(TenggatWaktu.this,android.R.layout.simple_list_item_1,items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TenggatWaktu.this, "Anda Memilih " + items[position], Toast.LENGTH_SHORT).show();
            }
        });

        Button btnUpdate = (Button)findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(updateButtonListener);

    }
}
