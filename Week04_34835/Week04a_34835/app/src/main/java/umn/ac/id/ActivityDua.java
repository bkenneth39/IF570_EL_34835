package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDua extends AppCompatActivity {

    private TextView tvPesanDiterima, tvJawaban;

    private EditText etJawaban;
    private Button btnBalasKirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        tvPesanDiterima = findViewById(R.id.pesanDiterima);
        etJawaban = findViewById(R.id.pesanBalik);
        btnBalasKirim = findViewById(R.id.kirimBalik);
        Intent mainIntent = getIntent();
        String pesanDiterima = mainIntent.getStringExtra("PesanMain");
        tvPesanDiterima.setText(pesanDiterima);
        tvJawaban = findViewById(R.id.jawaban);

        btnBalasKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(ActivityDua.this, MainActivity.class);
                String isian = etJawaban.getText().toString();
                mainIntent.putExtra("PesanMain",isian);
                startActivity(mainIntent);
            }
        });
    }


}