package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextCihazAdi,editTextCihazGucu ,editTextSaat;
    Button buttonHesapla;
    TextView textViewTuketim;



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
        editTextCihazAdi=findViewById(R.id.editTextTextCihazAdi);
        editTextCihazGucu=findViewById(R.id.editTextNumberDecimalCihazGucu);
        editTextSaat=findViewById(R.id.editTextTextCihazSaat);
        buttonHesapla=findViewById(R.id.buttonHesapla);
        textViewTuketim=findViewById(R.id.textViewAylik);

        buttonHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cihazAdi=editTextCihazAdi.getText().toString();
                double guc=Integer.parseInt(editTextCihazGucu.getText().toString());
                double saat=Double.parseDouble(editTextSaat.getText().toString());

                ElektirikliCihaz cihaz=new ElektirikliCihaz();
                cihaz.CihazAdi=cihazAdi;
                cihaz.CihazGucu=guc;
                cihaz.GunlukKullanimSaaati=saat;

                double sonuc=cihaz.aylikTuketim();
                textViewTuketim.setText("Aylık Tüketim: "+ sonuc);

            }
        });
    }

}