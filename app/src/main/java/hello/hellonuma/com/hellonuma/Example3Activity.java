package hello.hellonuma.com.hellonuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Example3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example3);

        Button requestButton = (Button) findViewById(R.id.hs_code_request_button);

        requestButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView hsCode = (TextView) findViewById(R.id.hsCodeInputText);
                String inputHSCode = (String) hsCode.getText().toString();

                // Prepare Request
                // Perform Request
                // Prepare Intent
                // Send Intent to HSCode Result Activity
            }
        });
    }
}
