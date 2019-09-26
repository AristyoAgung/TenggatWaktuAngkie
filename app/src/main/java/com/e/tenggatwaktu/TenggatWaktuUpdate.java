package com.e.tenggatwaktu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenggatWaktuUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenggat_waktu_update);

        View.OnClickListener simpanButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenggatWaktuUpdate.this,MainActivity.class);
                startActivity(intent);
            }
        };
        Button simpanBtn = (Button)findViewById(R.id.btnSimpan);
        simpanBtn.setOnClickListener(simpanButtonListener);

    }
}
