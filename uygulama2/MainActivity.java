package com.example.uygulama2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewTakim;
    RadioButton radioButtonGalatasaray,radioButtonBesiktas,radioButtonTrabzon,radioButtonFenerbahce;
    Button buttonSec;

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
        imageViewTakim=findViewById(R.id.imageButton_takim);
        radioButtonGalatasaray=findViewById(R.id.radioButton_galatasaray);
        radioButtonBesiktas=findViewById(R.id.radioButton_besiktas);
        radioButtonTrabzon=findViewById(R.id.radioButton_trabzon);
        radioButtonFenerbahce=findViewById(R.id.radioButton_fener);
        buttonSec=findViewById(R.id.button_sec);
        buttonSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonGalatasaray.isChecked()){
                    imageViewTakim.setImageResource(R.drawable.gs);
                }
                else if(radioButtonBesiktas.isChecked()){
                    imageViewTakim.setImageResource(R.drawable.bjk);
                }
                else if(radioButtonTrabzon.isChecked()){
                    imageViewTakim.setImageResource(R.drawable.ts);
                }
                else{
                    imageViewTakim.setImageResource(R.drawable.fb);
                }
            }
        });
    }
}