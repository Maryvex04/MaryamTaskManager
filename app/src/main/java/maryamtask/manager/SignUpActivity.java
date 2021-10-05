package maryamtask.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;


public class SignUpActivity extends AppCompatActivity {
    private TextInputLayout etfirstname;
    private TextInputLayout etlastname;
    private TextInputLayout etpass;
    private TextInputLayout etpconfirmation;
    private TextInputLayout etmail2;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etfirstname=findViewById(R.id.etfirstname);
        etlastname=findViewById(R.id.etlastname);
        etpass=findViewById(R.id.etpass);
        etpconfirmation=findViewById(R.id.etpconfirmation);
        etmail2=findViewById(R.id.etmail2);
        btnSave=findViewById(R.id.btnSave);
    }

}