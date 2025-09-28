package com.example.multihomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn_j_gotosquare;
    Button btn_j_gotorectangle;
    Button btn_j_gototriangle;
    Button btn_j_gotocircle;
    Intent square;
    Intent rectangle;
    Intent circle;
    Intent triangle;





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
        btn_j_gotosquare = findViewById(R.id.btn_v_main_gotosquare);
        btn_j_gotorectangle = findViewById(R.id.btn_v_main_gotorectangle);
        btn_j_gotocircle = findViewById(R.id.btn_v_main_gotocircle);
        btn_j_gototriangle = findViewById(R.id.btn_v_main_gototriangle);

        square = new Intent(MainActivity.this, square.class);
        rectangle = new Intent(MainActivity.this, rectangle.class);
        circle = new Intent(MainActivity.this, circle.class);
        triangle = new Intent(MainActivity.this, triangle.class);

        onclicklistnertointent();

    }
    private void onclicklistnertointent()
    {
        btn_j_gotosquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(square);
            }

        });
        btn_j_gotorectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(rectangle);
            }
        });
        btn_j_gotocircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(circle);

            }
        });
        btn_j_gototriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(triangle);

            }
        });
    }
}