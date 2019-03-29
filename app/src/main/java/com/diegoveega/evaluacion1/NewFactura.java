package com.diegoveega.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewFactura extends AppCompatActivity {

    TextView mtv_esuser, mtv_escorreo, mtv_estotal ;
    Button mbt_share;
    String Aux_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_factura);


        mtv_esuser=findViewById(R.id.tv_esuser);
        mtv_escorreo=findViewById(R.id.tv_escorreo);
        mtv_estotal=findViewById(R.id.tv_estotal);


        mbt_share=findViewById(R.id.bt_share);

        Intent m_newintent = getIntent();

        if(m_newintent != null){
            mtv_esuser.setText(m_newintent.getStringExtra(AppConstant.Nombre_key));
            mtv_escorreo.setText(m_newintent.getStringExtra(AppConstant.Correo_key));
        }

        mbt_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");

                startActivity(m_intent2);
            }
        });

    }
}
