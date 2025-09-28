package com.example.multihomework;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class square extends AppCompatActivity {
    EditText et_j_rectangle_length3;
    EditText et_j_rectangle_width3;
    TextView tv_j_rectangle_answer3;
    Button btn_j_rectangle_gotomain3;
    Intent MainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_square);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        et_j_rectangle_length3 = findViewById(R.id.et_v_rectangle_length3);
        et_j_rectangle_width3 = findViewById(R.id.et_v_rectangle_width3);
        tv_j_rectangle_answer3 = findViewById(R.id.tv_v_rectangle_answer3);
        btn_j_rectangle_gotomain3 = findViewById(R.id.btn_v_rectangle_gotomain3);
        MainActivity = new Intent(square.this, MainActivity.class);
        onClickLeave();
        textChangeListenerSquareRect();
    }
    public void onClickLeave()
    {
        btn_j_rectangle_gotomain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity);
            }
        });

    }
    public void setAreaAndPerimeterSquareRect(String lengthS, String widthS)
    {

        if(lengthS.isEmpty() || widthS.isEmpty())
        {
            return;
        }
        //convert the string to an integer so we can do math.
        double length = Double.parseDouble(lengthS);
        double width = Double.parseDouble(widthS);

        double area = length * width;

        double perimeter = length + length + width + width;

        tv_j_rectangle_answer3.setText("area = " + area + "\nPerimeter = " + perimeter);
    }
    public void textChangeListenerSquareRect()
    {
        et_j_rectangle_width3.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setAreaAndPerimeterSquareRect(et_j_rectangle_length3.getText().toString(),et_j_rectangle_width3.getText().toString());
            }
        });

        et_j_rectangle_length3.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setAreaAndPerimeterSquareRect(et_j_rectangle_length3.getText().toString(),et_j_rectangle_width3.getText().toString());
            }
        });
    }
}
