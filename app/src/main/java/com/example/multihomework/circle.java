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

public class circle extends AppCompatActivity {

    EditText et_j_circle_Radius;
    TextView tv_j_circle_answer;
    Button btn_j_circle_gotomain;
    Intent MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_circle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        et_j_circle_Radius = findViewById(R.id.et_v_circle_Radius);
        tv_j_circle_answer = findViewById(R.id.tv_v_circle_answer);
        btn_j_circle_gotomain = findViewById(R.id.btn_v_circle_gotomain);
        MainActivity = new Intent(circle.this, MainActivity.class);


        textChangeListenerRadius();
        onClickLeave();
    }
    public void textChangeListenerRadius()
    {
        et_j_circle_Radius.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                setAreaPerimeterCircle(et_j_circle_Radius.getText().toString());

            }
        });
    }
    public void setAreaPerimeterCircle(String radiusS)
    {
        if(radiusS.isEmpty())
        {
            return;
        }

        double radius = Double.parseDouble(radiusS);
        double pi = Math.PI;

        double area = pi * Math.pow(radius, 2);

        double perimeter = 2 * pi * radius;

        tv_j_circle_answer.setText("area = " + area + "\nPerimeter = " + perimeter);
    }
    public void onClickLeave()
    {
        btn_j_circle_gotomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity);
            }
        });

    }

}