package hello.hellonuma.com.hellonuma;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cara meng-assign / mencari button object berdasarkan ID.
        final Button myButton1 = (Button) findViewById(R.id.go_button1);

        // Mengeset text button
        myButton1.setText("Pencet sini");

        // Cara mengeset warna button
        int myColor = Color.parseColor("#FF5733"); // Color.parseColor mengembalikan integer (int)
        myButton1.setBackgroundColor(myColor); // setBackgroundColor mengharapkan integer (int) -> myColor adalah integer

        // Ketika myButton1 ditekan (onClick) maka, jalankan fungsi di bawah ini
        myButton1.setOnClickListener(
                // jalankan fungsi ini
                new Button.OnClickListener() {
                    // Ini (public void onClick(View v) adalah function yang dijalankan ketika button di-click
                    @Override
                    public void onClick(View v) {
                        myButton1.setText("Sudah kepencet!");

                        Intent myIntent = new Intent(MainActivity.this, Example2Activity.class);

                        myIntent.putExtra("intent_kepada", "Numa");
                        myIntent.putExtra("intent_pesan", "Selamat datang");

                        MainActivity.this.startActivity(myIntent);
                    }

                }
        );

        Button HSCodeButton = (Button) findViewById(R.id.go_button2);
        HSCodeButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hsIntent = new Intent(MainActivity.this, Example3Activity.class);

                MainActivity.this.startActivity(hsIntent);
            }
        });
    }
}
