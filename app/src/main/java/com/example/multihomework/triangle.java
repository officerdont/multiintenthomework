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

public class triangle extends AppCompatActivity {
    EditText et_j_triangle_sidea;
    EditText et_j_triangle_sideb;
    EditText et_j_triangle_sidec;
    EditText et_j_triangle_height;
    Button btn_j_triangle_gotomain;
    Intent MainActivity;
    TextView tv_j_triangle_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_triangle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        et_j_triangle_sidea = findViewById(R.id.et_v_triangle_sidea);
        et_j_triangle_sideb = findViewById(R.id.et_v_triangle_sideb);
        et_j_triangle_sidec = findViewById(R.id.et_v_triangle_sidec);
        et_j_triangle_height = findViewById(R.id.et_v_triangle_height);
        btn_j_triangle_gotomain = findViewById(R.id.btn_v_triangle_gotomain);
        tv_j_triangle_answer = findViewById(R.id.tv_v_triangle_answer);
        MainActivity = new Intent(triangle.this, MainActivity.class);

       textChangeListenerTriangleSides();
        onClickLeave();
    }
    public void onClickLeave()
    {
        btn_j_triangle_gotomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity);
            }
        });

    }
    public void setTriangleSides(String SideA,String SideB,String SideC,String Height)
    {

        if(SideA.isEmpty() || SideB.isEmpty() || SideC.isEmpty() || Height.isEmpty())
        {

            return;
        }
        double Sidea = Double.parseDouble(SideA);
        double Sideb = Double.parseDouble(SideB);
        double Sidec = Double.parseDouble(SideC);
        double height =  Double.parseDouble(Height);

        double perimeter = Sidea + Sideb + Sidec;
        double area = .5 * Sidec * height;

        tv_j_triangle_answer.setText("area = " + area + "\nPerimeter = " + perimeter);

    }

    public void textChangeListenerTriangleSides()
    {
        et_j_triangle_sidea.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s)
            {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //setAreaAndPerimeterSquareRect(et_j_length.getText().toString(),et_j_width.getText().toString());
                setTriangleSides(et_j_triangle_sidea.getText().toString(),et_j_triangle_sideb.getText().toString(),et_j_triangle_sidec.getText().toString(),et_j_triangle_height.getText().toString());
            }
        });
        et_j_triangle_sideb.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setTriangleSides(et_j_triangle_sidea.getText().toString(),et_j_triangle_sideb.getText().toString(),et_j_triangle_sidec.getText().toString(),et_j_triangle_height.getText().toString());
            }
        });
        et_j_triangle_sidec.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setTriangleSides(et_j_triangle_sidea.getText().toString(),et_j_triangle_sideb.getText().toString(),et_j_triangle_sidec.getText().toString(),et_j_triangle_height.getText().toString());
            }
        });
        et_j_triangle_height.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setTriangleSides(et_j_triangle_sidea.getText().toString(),et_j_triangle_sideb.getText().toString(),et_j_triangle_sidec.getText().toString(),et_j_triangle_height.getText().toString());
            }
        });
    }
}