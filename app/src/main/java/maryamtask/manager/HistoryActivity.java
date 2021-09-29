package maryamtask.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HistoryActivity extends AppCompatActivity {
    private SearchView sv;
    private ListView lv;
    private FloatingActionButton fabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        sv=findViewById(R.id.sv);
        lv=findViewById(R.id.lv);
        fabtn=findViewById(R.id.fabtn);

    }
}