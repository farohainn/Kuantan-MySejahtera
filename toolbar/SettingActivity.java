package com.example.kuantansejahtera_a170567.toolbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.kuantansejahtera_a170567.R;

public class SettingActivity extends AppCompatActivity {

    TextView tv_language;
    LinearLayout ll_setting_language, ll_setting_notificattion;
    Switch switch_notification;

    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    String SP_LANGUAGE = " language";
    String SP_NOTIFICATION = "notification";

    String[] values = {"English", "Melayu", "Chinese", "Tamil"};
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        tv_language = findViewById(R.id.tv_language);
        switch_notification = findViewById(R.id.switch_notification);
        ll_setting_language = findViewById(R.id.ll_profile_language);
        ll_setting_notificattion = findViewById(R.id.ll_profile_notification);

        sharedPref = getSharedPreferences("app.settings", MODE_PRIVATE);
        editor = sharedPref.edit();
        switch_notification.setChecked(sharedPref.getBoolean(SP_NOTIFICATION,false));
        tv_language.setText((values[sharedPref.getInt(SP_LANGUAGE, 0)]));


        switch_notification.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                editor.putBoolean(SP_NOTIFICATION,b);
                editor.commit();
            }
        });

        ll_setting_notificattion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean switchState = switch_notification.isChecked();
                switch_notification.setChecked(!switchState);
                editor.putBoolean(SP_NOTIFICATION,!switchState);
                editor.commit();
            }
        });

        ll_setting_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowLanguagaeOptions();
            }
        });
    }

    public void ShowLanguagaeOptions(){

        AlertDialog.Builder builder = new AlertDialog.Builder(SettingActivity.this);
        builder.setTitle("Select your language");
        builder.setSingleChoiceItems(values, sharedPref.getInt(SP_LANGUAGE, 0), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                switch (i){
                    case 0:
                        editor.putInt(SP_LANGUAGE,0);
                        editor.commit();
                        break;
                    case 1:
                        editor.putInt(SP_LANGUAGE,1);
                        editor.commit();
                        break;
                    case 2:
                        editor.putInt(SP_LANGUAGE,2);
                        editor.commit();
                        break;
                    case 3:
                        editor.putInt(SP_LANGUAGE,3);
                        editor.commit();
                        break;
                }
                alertDialog.dismiss();
                tv_language.setText((values[sharedPref.getInt(SP_LANGUAGE, 0)]));
            }
        });
        alertDialog = builder.create();
        alertDialog.show();
    }
}
