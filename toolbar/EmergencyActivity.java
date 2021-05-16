package com.example.kuantansejahtera_a170567.toolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.kuantansejahtera_a170567.R;

public class EmergencyActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton IB_call1,IB_call2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        IB_call1=findViewById(R.id.IB_call1);
        IB_call2=findViewById(R.id.IB_call2);

        IB_call1.setOnClickListener(this);
        IB_call2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

       switch (view.getId()){
           case R.id.IB_call1:
               Intent callIntent = new Intent(Intent.ACTION_DIAL);
               callIntent.setData(Uri.parse("tel: 0388810200"));

               if (callIntent.resolveActivity(getPackageManager()) != null) {
                   startActivity(callIntent);
               } else{
                   Toast.makeText(EmergencyActivity.this, "Sorry line is busy", Toast.LENGTH_SHORT).show();
               }

           break;

           case R.id.IB_call2:
               Intent callIntent2 = new Intent(Intent.ACTION_DIAL);
               callIntent2.setData(Uri.parse("tel: 15999"));

               if (callIntent2.resolveActivity(getPackageManager()) != null) {
                   startActivity(callIntent2);
               } else{
                   Toast.makeText(EmergencyActivity.this, "Sorry line is busy", Toast.LENGTH_SHORT).show();
               }
           break;
       }

    }
}
