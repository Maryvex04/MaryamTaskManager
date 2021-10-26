package maryamtask.manager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
   //listener 1.
public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main_menu,menu);
      return true;
    }
    //
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId()==R.id.Itemstngs){
            Intent i=new Intent(getApplicationContext(),SittingsActivity.class);
            startActivity(i);
        }
        if (item.getItemId()==R.id.Itemhstry){
            Intent i=new Intent(getApplicationContext(),HistoryActivity.class);
            startActivity(i);

        }
        if (item.getItemId()==R.id.Itemsot){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Are you sure?");
            builder.setCancelable(true);
            builder.setPositiveButton("Yes",this);
            builder.setNegativeButton("No",this);

            AlertDialog dialog= builder.create();
            dialog.show();

        }
        return true;
    }

       @Override
       public void onClick(DialogInterface dialogInterface, int i) {

       }
   }
