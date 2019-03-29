package com.diegoveega.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText mNombre;
    EditText mCorreo;
    Integer contador=0;

    Button bt_11;
    TextView bt_11R;

    Button mbt_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNombre = findViewById(R.id.et_nombre);
        mCorreo = findViewById(R.id.et_correo);



        bt_11=findViewById(R.id.bt_11);
       // bt_11R= findViewById(R.id.bt_11R);

        bt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                bt_11R.setText(String.valueOf(contador));
            }
        });


        mbt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent = new Intent(MainActivity.this, NewFactura.class);

                m_intent.putExtra(AppConstant.Nombre_key,mNombre.getText().toString());
                m_intent.putExtra(AppConstant.Correo_key,mCorreo.getText().toString());

                startActivity(m_intent);
            }
        });
    }
}
