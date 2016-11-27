package com.example.a403.new44037;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RenewalayoutActivity extends AppCompatActivity {
    EditText editText, editText2;
    Button button, button2, button3, button4, button5;
    TextView textResult;
    int num1, num2,sr;
    Integer Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.renewalayout);
        setTitle("초간단 계산기(수정)");

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button =  (Button) findViewById(R.id.button);
        button2 =  (Button) findViewById(R.id.button2);
        button3 =  (Button) findViewById(R.id.button3);
        button4 =  (Button) findViewById(R.id.button4);
        button5 =  (Button) findViewById(R.id.button5);
        textResult= (TextView) findViewById(R.id.textView);

        View.OnClickListener clisten = new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Integer.parseInt(editText.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());

                switch (v.getId()) {
                    case R.id.button:
                            Result = num1 + num2;
                            break;
                    case R.id.button2:
                        Result = num1 - num2;
                        break;
                    case R.id.button3:
                        Result = num1 * num2;
                        break;
                    case R.id.button4:
                        Result = num1 / num2;
                        break;
                    case R.id.button5:
                        if(num1 == 0 || num2 ==0){
                            Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_LONG).show();
                            Result = 0;
                            break;
                        }
                        Result = num1 % num2;
                        break;
                }
                textResult.setText("계산결과: " + Result);
            }
        };
        button.setOnClickListener(clisten);
        button2.setOnClickListener(clisten);
        button3.setOnClickListener(clisten);
        button4.setOnClickListener(clisten);
        button5.setOnClickListener(clisten);

    }
}
