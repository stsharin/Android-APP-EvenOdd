package com.example.evenodd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    TextView result;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.ed_num1);
        result = findViewById(R.id.tv_output);
        show = findViewById(R.id.btn_add);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());

                if (n1%2==0){
                    result.setText("Even");
                }
                else {
                    result.setText("Odd");
                }
            }
        });
    }
}
