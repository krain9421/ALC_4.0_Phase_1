package com.example.alc40phase1;

import android.graphics.Picture;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fillProfileText();
        //fillProfileImage();
    }

    private void fillProfileText() {
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);

        editText.setCursorVisible(false);
        editText.setText("Nwigwe Chidubem");
        textView.setText("Track:    Android");
        textView2.setText("Country:  Nigeria");
        textView3.setText("Email:   krain9421@gmail.com");
        textView4.setText("Phone Number:    2348123277862");
        textView5.setText("Slack Username:  @NWIGWE CHIDUBEM WILLIAM");
    }

    private void fillProfileImage() {
        ImageView avatar = findViewById(R.id.avatar);
        avatar.setImageResource(R.drawable.profile);
    }

}