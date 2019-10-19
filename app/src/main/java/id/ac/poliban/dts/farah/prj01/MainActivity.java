package id.ac.poliban.dts.farah.prj01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel
    EditText TextNama;
    TextView Hasil;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil variabel berdasarkan id
        TextNama = (EditText) findViewById(R.id.TxtNama);
        Hasil = (TextView) findViewById(R.id.Lbl_Nama);
    }

        //Buat method TampilNama sesuai dengan property onClick pada button
        public void TampilNama(View v){
            Hasil.setText("Nama Anda: "+TextNama.getText());
        }
    }

