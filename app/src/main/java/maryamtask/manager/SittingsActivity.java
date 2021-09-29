package maryamtask.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SittingsActivity extends AppCompatActivity {
    private TextView tv;
    private ToggleButton tbtn;
    private Button btnsignout;
    private RadioGroup rg;
    private RadioButton rbtn1;
    private RadioButton rbtn2;
    private RadioButton rbtn3;
    private Switch sch;
    private Button btnch;
    private TextView tvet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sittings);
       tv=findViewById(R.id.tv);
        tbtn=findViewById(R.id.tbtn);
        btnsignout=findViewById(R.id.btnsignout);
        rg=findViewById(R.id.rg);
        rbtn1=findViewById(R.id.rbtn1);
        rbtn2=findViewById(R.id.rbtn2);
        rbtn3=findViewById(R.id.rbtn3);
        sch=findViewById(R.id.sch);
        btnch=findViewById(R.id.btnch);
        tvet=findViewById(R.id.tvet);




    }
}