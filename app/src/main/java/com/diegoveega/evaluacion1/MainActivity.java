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
    Integer contador1=0;
    Integer contador2=0;

    Integer contador3=0;
    Integer contador4=0;
    Integer contador5=0;

    Integer contador6=0;
    Integer contador7=0;
    Integer contador8=0;

    LinearLayout bt_11;
    TextView bt_11R;
    LinearLayout bt_12;
    TextView bt_12R;
    LinearLayout bt_13;
    TextView bt_13R;

    LinearLayout bt_21;
    TextView bt_21R;
    LinearLayout bt_22;
    TextView bt_22R;
    LinearLayout bt_23;
    TextView bt_23R;

    LinearLayout bt_31;
    TextView bt_31R;
    LinearLayout bt_32;
    TextView bt_32R;
    LinearLayout bt_33;
    TextView bt_33R;

    Button mbt_submit;
    String Aux_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNombre = findViewById(R.id.et_nombre);
        mCorreo = findViewById(R.id.et_correo);
        mbt_submit = findViewById(R.id.bt_send);



        bt_11=findViewById(R.id.bt_11);
        bt_11R= findViewById(R.id.bt_11R);

        bt_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                bt_11R.setText(String.valueOf(contador));
            }
        });
        //////////////////////////////////////////////////////////////
        bt_12=findViewById(R.id.bt_12);
        bt_12R= findViewById(R.id.bt_12R);

        bt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                bt_12R.setText(String.valueOf(contador1));
            }
        });
        /////////////////////////////////////////////////////////////
        bt_13=findViewById(R.id.bt_13);
        bt_13R= findViewById(R.id.bt_13R);

        bt_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                bt_13R.setText(String.valueOf(contador2));
            }
        });
        //////////////////////////////////////////////////////////////


        bt_21=findViewById(R.id.bt_21);
        bt_21R= findViewById(R.id.bt_21R);

        bt_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                bt_21R.setText(String.valueOf(contador3));
            }
        });
        //////////////////////////////////////////////////////////////
        bt_22=findViewById(R.id.bt_22);
        bt_22R= findViewById(R.id.bt_22R);

        bt_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                bt_22R.setText(String.valueOf(contador4));
            }
        });
        /////////////////////////////////////////////////////////////
        bt_23=findViewById(R.id.bt_23);
        bt_23R= findViewById(R.id.bt_23R);

        bt_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador5++;
                bt_23R.setText(String.valueOf(contador5));
            }
        });
        //////////////////////////////////////////////////////////////


        bt_31=findViewById(R.id.bt_31);
        bt_31R= findViewById(R.id.bt_31R);

        bt_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador6++;
                bt_31R.setText(String.valueOf(contador6));
            }
        });
        //////////////////////////////////////////////////////////////
        bt_32=findViewById(R.id.bt_32);
        bt_32R= findViewById(R.id.bt_32R);

        bt_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador7++;
                bt_32R.setText(String.valueOf(contador7));
            }
        });
        /////////////////////////////////////////////////////////////
        bt_33=findViewById(R.id.bt_33);
        bt_33R= findViewById(R.id.bt_33R);

        bt_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador8++;
                bt_33R.setText(String.valueOf(contador8));
            }
        });
        //////////////////////////////////////////////////////////////


        mbt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent = new Intent(MainActivity.this, NewFactura.class);

                m_intent.putExtra(AppConstant.Nombre_key,mNombre.getText().toString());
                m_intent.putExtra(AppConstant.Correo_key,mCorreo.getText().toString());
                Aux_Text = String.valueOf(contador+contador1+contador3+contador4+contador5+contador6+contador7+contador8);
                m_intent.putExtra(Intent.EXTRA_TEXT, Aux_Text);

                startActivity(m_intent);
            }
        });
    }
}
