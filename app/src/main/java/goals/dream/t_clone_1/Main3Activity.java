package goals.dream.t_clone_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
//icons
        if (id == R.id.icon_1) {
            Toast.makeText(this, "icon_1", Toast.LENGTH_SHORT).show();
            Intent start_act_home = new Intent(this,MainActivity.class);
            startActivity(start_act_home);
            //start_act_2.putExtra(EXTRA_MESSAGE.message);
        }
        if (id == R.id.icon_2) {
            Intent start_act_2 = new Intent(this,Main2Activity.class);
            startActivity(start_act_2);
            //start_act_2.putExtra(EXTRA_MESSAGE.message);
            Toast.makeText(this, "icon_2", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icon_3) {
            Intent start_act_3 = new Intent(this,Main3Activity.class);
            startActivity(start_act_3);
            Toast.makeText(this, "icon_3", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icon_4) {
            Toast.makeText(this, "icon_4", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icon_5) {
            Toast.makeText(this, "icon_5", Toast.LENGTH_SHORT).show();
        }

        //menu
        if (id == R.id.menu_1) {
            Toast.makeText(this, "menu_1", Toast.LENGTH_SHORT).show();
            //starts the settings activity
            Intent my_intent=new Intent(this,SettingsActivity.class);
            startActivity(my_intent);
            //
        }
        if (id == R.id.menu_2) {
            Toast.makeText(this, "menu_2", Toast.LENGTH_SHORT).show();
            //
        }
        if (id == R.id.menu_3) {
            Toast.makeText(this, "menu_3", Toast.LENGTH_SHORT).show();
            //
        }
        if (id == R.id.menu_4) {
            Toast.makeText(this, "menu_4", Toast.LENGTH_SHORT).show();
            //
        }
        if (id == R.id.menu_5) {
            Toast.makeText(this, "menu_5", Toast.LENGTH_SHORT).show();
            //
        }
        return super.onOptionsItemSelected(item);
    }

    //button clicks------------------------------------------------------------------
    public void click_act_3(View view) {
        int the_id = view.getId();
        if (the_id == R.id.act_3_b_1) {
            Toast.makeText(this, "act_3_b_1", Toast.LENGTH_SHORT).show();
        }
        if (the_id == R.id.act_3_b_2) {
            Toast.makeText(this, "act_3_b_2", Toast.LENGTH_SHORT).show();
        }
        }

}
