package hello.hellonuma.com.hellonuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Example1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);

        Intent myIntent = getIntent();

        String kepada = myIntent.getStringExtra("intent_kepada"); // Mengambil isi dari `intent_kepada`
        String pesan = myIntent.getStringExtra("intent_pesan"); // Mengambil isi dari `intent_pesan`

        TextView kepadaTextView = (TextView) findViewById(R.id.textKepada);
        TextView pesanTextView = (TextView) findViewById(R.id.textPesan);

        String kepadaString = "Halo, " + kepada;
        String pesanString = "Pesan untuk anda: " + pesan;

        kepadaTextView.setText(kepadaString);
        pesanTextView.setText(pesanString);
    }
}
