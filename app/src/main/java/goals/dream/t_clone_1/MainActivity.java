package goals.dream.t_clone_1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import goals.dream.t_clone_1.R;
import goals.dream.t_clone_1.SettingsActivity;

import static android.R.attr.defaultValue;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    //SharedPreferences========================================================
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String key_1 = "k1";
    public static final String key_2 = "k2";
    public static final String key_3 = "k3";
    public static final String key_4 = "k4";
    public static final String key_5 = "k5";
    //can also use integers
    SharedPreferences sharedpreferences;
//SharedPreferences========================================================


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//SharedPreferences========================================================
        //sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
//SharedPreferences========================================================

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string_hold_it = "xxx";
                Snackbar.make(view, string_hold_it, Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action", null).show();
            }

        });
    }
//


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
    public void buttonOnClick(View view) {
        int the_id = view.getId();
        if (the_id == R.id.b_1) {
            Random rand = new Random();
            int my_rand = rand.nextInt(20);
            int my_rand_2 = rand.nextInt(20);
//SharedPreferences========================================================
            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();
//SharedPreferences========================================================
            editor.putString(key_1, String.valueOf(my_rand));
            editor.putString(key_2, String.valueOf(my_rand_2));
            editor.putString(key_3, "333333333333333333333");
            editor.apply(); //replaced commit with apply

            Toast.makeText(this, "but_1_works\n"
                    +String.valueOf(my_rand)+
                    "\n"+String.valueOf(my_rand_2), Toast.LENGTH_SHORT).show();
        }
        if (the_id == R.id.b_2) {


            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            String highScore = sharedpreferences.getString(key_1,"default");
            String some_name = sharedpreferences.getString(key_2,"default");
            Toast.makeText(this, "but_2_works -- key_1+key_2"+"\n"+
                            highScore+"\n"+
                            some_name+"\n"
                    , Toast.LENGTH_SHORT).show();



            Button b1_x=(Button)this.findViewById(R.id.b_1);
            b1_x.setText(highScore);
            b1_x.setTextColor(Color.parseColor("#0404B4"));
        }
        if (the_id == R.id.b_3) {
            //use this for the settings is using PREFERECE MANAGER
            sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
            //find the example_text in the pref_general.xml file
            String hhh = sharedpreferences.getString("example_text","xxx");
            Toast.makeText(this, "but_3_works\n"+hhh, Toast.LENGTH_SHORT).show();
        }

    }



}
//notes

/* ....

*
*
*
*/
