package maryamtask.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

public class addTaskActivity extends AppCompatActivity {
    private TextInputLayout etTitle,etSub;
    private Spinner spn;
    private SeekBar sbr;
    private ImageView img;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTitle=findViewById(R.id.etTitle);
       etSub=findViewById(R.id.etSub);
        spn=findViewById(R.id.spn);
        sbr=findViewById(R.id.sbr);
        img=findViewById(R.id.img);
        btnSave=findViewById(R.id.btnSave);
    }
}