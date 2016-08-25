package com.mobileaders.tamm.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.mobileaders.tamm.R;
import com.mobileaders.tamm.utilties.UtilitiesClass;

public class RegistrationActivity extends AppCompatActivity {

    EditText name, country, city, locCoord, phoneNum, email, pass, rePass;
    Button register;

    String nameTxt, countryTxt, cityTxt, locCoordTxt, phoneNumTxt, emailTxt, passTxt, rePassTxt;

    private void setUpViewsReferences() {
        name = (EditText) findViewById(R.id.name);
        country = (EditText) findViewById(R.id.country);
        city = (EditText) findViewById(R.id.city);
        locCoord = (EditText) findViewById(R.id.locationCoord);
        phoneNum = (EditText) findViewById(R.id.phoneNum);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        rePass = (EditText) findViewById(R.id.rePass);
        register = (Button) findViewById(R.id.register);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        setUpViewsReferences();
        setUpViewsFonts();

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFields()) {

                } else {

                }
            }
        });
    }

    private void setUpViewsFonts() {
        UtilitiesClass.setFont(name, this, 1);
        UtilitiesClass.setFont(country, this, 1);
        UtilitiesClass.setFont(city, this, 1);
        UtilitiesClass.setFont(locCoord, this, 1);
        UtilitiesClass.setFont(phoneNum, this, 1);
        UtilitiesClass.setFont(email, this, 1);
        UtilitiesClass.setFont(pass, this, 1);
        UtilitiesClass.setFont(rePass, this, 1);
        UtilitiesClass.setFont(register, this, 0);
    }

    public boolean validateFields() {

        boolean valid = true;
        nameTxt = name.getText().toString();
        countryTxt = country.getText().toString();
        cityTxt = city.getText().toString();
        locCoordTxt = locCoord.getText().toString();
        phoneNumTxt = phoneNum.getText().toString();
        emailTxt = email.getText().toString();
        passTxt = pass.getText().toString();
        rePassTxt = rePass.getText().toString();


        if (nameTxt.isEmpty()) {
            name.setError("أدخل إسم ثلاثي صحيح");
            valid = false;
        } else {
            name.setError(null);
        }

        if (countryTxt.isEmpty()) {
            country.setError("أدخل إسم دولة صحيح");
            valid = false;
        } else {
            country.setError(null);
        }

        if (cityTxt.isEmpty()) {
            city.setError("أدخل إسم مدينة صحيح");
            valid = false;
        } else {
            city.setError(null);
        }

        if (locCoordTxt.isEmpty()) {
            locCoord.setError("إحداثيات غير صحيحة");
            valid = false;
        } else {
            locCoord.setError(null);
        }

        if (phoneNumTxt.isEmpty()) {
            phoneNum.setError("أدخل رقم جوال صحيح");
            valid = false;
        } else {
            phoneNum.setError(null);
        }

        if (emailTxt.isEmpty() && !android.util.Patterns.EMAIL_ADDRESS.matcher(emailTxt).matches()) {
            email.setError("أدخل بريد إلكتروني صحيح");
            valid = false;
        } else {
            email.setError(null);
        }


        if (passTxt.isEmpty() && passTxt.length() >= 8) {
            pass.setError("كلمة المرور أقل من 8 أحرف");
            valid = false;
        } else {
            pass.setError(null);
        }

        if (rePassTxt.isEmpty() && !rePassTxt.equals(passTxt)) {
            rePass.setError("غير صحيح");
            valid = false;
        } else {
            rePass.setError(null);
        }

        return valid;
    }
}
