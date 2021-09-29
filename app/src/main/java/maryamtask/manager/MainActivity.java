package maryamtask.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton floatactbtn;
    private SearchView svSearchTask;
    private ListView lstvAllTasks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2.
        floatactbtn=findViewById(R.id.floatactbtn);
        svSearchTask=findViewById(R.id.svSearchTask);
        lstvAllTasks=findViewById(R.id.lstvAllTasks);

    }
}