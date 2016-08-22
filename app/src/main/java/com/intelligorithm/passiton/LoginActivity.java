package com.intelligorithm.passiton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LoginActivity extends AppCompatActivity {

    private String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        final TextView toggleViewLoginSignup = (TextView) findViewById(R.id.toggleViewLoginSignup);
        final TextView boxTitle = (TextView) findViewById(R.id.boxTitle);
        final EditText username = (EditText) findViewById(R.id.username);
        final Button loginSignUpButton = (Button) findViewById(R.id.login_signup_button);
        final TextView accountText = (TextView) findViewById(R.id.account_text);


        toggleViewLoginSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(boxTitle.getText().toString().equals(getResources().getString(R.string.box_signin_title))){
                   //show register ui elements
                    boxTitle.setText(getResources().getString(R.string.box_register_title));

                    username.setVisibility(View.VISIBLE);
                    loginSignUpButton.setText(getString(R.string.signup_text));
                    accountText.setText(getString(R.string.has_account_text));
                    toggleViewLoginSignup.setText(getString(R.string.login_text));


                } else {
                    //show login ui elements
                    boxTitle.setText(getResources().getString(R.string.box_signin_title));
                    username.setVisibility(View.GONE);
                    loginSignUpButton.setText(getString(R.string.login_text));
                    accountText.setText(getString(R.string.no_account_text));
                    toggleViewLoginSignup.setText(getString(R.string.create_one_text));

                }
            }
        });



        loginSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(boxTitle.getText().toString().equals(getResources().getString(R.string.box_signin_title))){
                    //login


                } else {
                    //signup



                }
            }
        });



    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
