package com.diegoveega.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private String Aux_Text;
    TextView mShared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mShared=findViewById(R.id.shared);

        Intent Intent_shared=getIntent();

        if(Intent_shared != null){
            Aux_Text = Intent_shared.getStringExtra(Intent.EXTRA_TEXT);
        }

        mShared.setText(Aux_Text);
    }
}
