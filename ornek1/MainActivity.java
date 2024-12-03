package com.example.ornek1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnTikla;

    EditText etAd;
    TextView tvMesaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvMesaj=findViewById(R.id.textView_mesaj);
        btnTikla=findViewById(R.id.button_tikla);
        etAd=findViewById(R.id.editText_ad);
        btnTikla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ad=etAd.getText().toString();
                Toast.makeText(MainActivity.this, "Hoşgeldiniz" +ad, Toast.LENGTH_SHORT).show();
                tvMesaj.setText("Hoşgeldin "+ad);

                MesajVer(ad);
            }

            private void MesajVer() {
                Toast.makeText(MainActivity.this, "Hoşgeldiniz "+ad, Toast.LENGTH_SHORT).show();
            }
        });
    }
}