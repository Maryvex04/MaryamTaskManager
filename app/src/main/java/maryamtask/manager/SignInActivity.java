package maryamtask.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class SignInActivity extends AppCompatActivity {
    private TextInputLayout et;
    private TextInputLayout etPassword;
    private Button btnLogIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        et=findViewById(R.id.et);
        etPassword=findViewById(R.id.etpassword);
        btnLogIn=findViewById(R.id.btnLogIn);
        btnSignUp=findViewById(R.id.btnSignUp);

    }
}