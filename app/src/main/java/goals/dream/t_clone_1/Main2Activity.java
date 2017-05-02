package goals.dream.t_clone_1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static goals.dream.t_clone_1.MainActivity.MyPREFERENCES;
import static goals.dream.t_clone_1.MainActivity.key_1;
import static goals.dream.t_clone_1.MainActivity.key_2;
import static goals.dream.t_clone_1.MainActivity.key_3;
import static goals.dream.t_clone_1.R.id.et_email;
import static goals.dream.t_clone_1.R.id.my_check_box;

public class Main2Activity extends AppCompatActivity {
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

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //get the saved text
        TextView et_email_tv = (TextView)findViewById(R.id.et_email);
        TextView et_password_tv = (TextView)findViewById(R.id.et_password);
        TextView et_timer_main_tv = (TextView)findViewById(R.id.et_timer_main);
        TextView et_timer_sub_tv = (TextView)findViewById(R.id.et_timer_sub);

        CheckBox my_check_box_view = (CheckBox) findViewById(R.id.my_check_box);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        String email_x = sharedpreferences.getString(key_1,"default");
        et_email_tv.setText(email_x);
        String password_x = sharedpreferences.getString(key_2,"default");
        et_password_tv.setText(password_x);
        String timer_main_x = sharedpreferences.getString(key_3,"default");
        et_timer_main_tv.setText(timer_main_x);
        String timer_sub_x = sharedpreferences.getString(key_4,"default");
        et_timer_sub_tv.setText(timer_sub_x);
        String my_check_box_x = sharedpreferences.getString(key_5,"default");
        my_check_box_view.setChecked(Boolean.parseBoolean(my_check_box_x));

//click-save .... then home button then the +(plus) button to test

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
            Toast.makeText(this, "menu_2 is testing check box", Toast.LENGTH_SHORT).show();
            CheckBox my_check_box_view = (CheckBox) findViewById(R.id.my_check_box);
            my_check_box_view.setChecked(true); //to check
           // my_check_box_view.setChecked(false); //to uncheck


        }
        if (id == R.id.menu_3) {
            Toast.makeText(this, "menu_3", Toast.LENGTH_SHORT).show();

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
    public void click_act_2(View view) {
        int the_id = view.getId();
        if (the_id == R.id.act_b_1) {
            //save button
            TextView et_email_tv = (TextView)findViewById(R.id.et_email);
                String et_email_get_text = et_email_tv.getText().toString();
            TextView et_password_tv = (TextView)findViewById(R.id.et_password);
                String et_password_get_text = et_password_tv.getText().toString();

            TextView et_timer_main_tv = (TextView)findViewById(R.id.et_timer_main);
                String et_timer_main_get_text = et_timer_main_tv.getText().toString();
            TextView et_timer_sub_tv = (TextView)findViewById(R.id.et_timer_sub);
                String et_timer_sub_get_text = et_timer_sub_tv.getText().toString();

            //SharedPreferences========================================================
            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();
            //SharedPreferences========================================================
            editor.putString(key_1, String.valueOf(et_email_get_text));
            editor.putString(key_2, String.valueOf(et_password_get_text));

            editor.putString(key_3, String.valueOf(et_timer_main_get_text));
            editor.putString(key_4, String.valueOf(et_timer_sub_get_text));


            editor.putString(key_5, String.valueOf(et_timer_sub_get_text));
            editor.apply(); //replaced commit with apply



            // read it back to show you actually saved it
            //sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            //String email_x = sharedpreferences.getString(key_1,"default");
            //et_email_tv.setText(email_x);
            Toast.makeText(this, "\n = Saved", Toast.LENGTH_SHORT).show();
        }
        if (the_id == R.id.act_b_2) {
            TextView et_email_tv = (TextView)findViewById(R.id.et_email);

            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            String email_x = sharedpreferences.getString(key_1,"default");
            et_email_tv.setText(email_x);
            Toast.makeText(this, "act_b_2_works\n", Toast.LENGTH_SHORT).show();
        }
        if (the_id == R.id.my_check_box) {

            //CheckBox my_check_box_view = (CheckBox) findViewById(R.id.my_check_box);
            boolean check_state = ((CheckBox) findViewById(R.id.my_check_box)).isChecked();
            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString(key_5, String.valueOf(check_state));
            editor.apply(); //replaced commit with apply

            String temp_test = sharedpreferences.getString(key_5,"default");
            Toast.makeText(this, "my_check_box\n"+check_state+"\n"+temp_test, Toast.LENGTH_SHORT).show();
        }

    }

}


//public void some_function(){
//    //needs minum lolipop
//    wv1.evaluateJavascript(
//            "(function() {return ('<html>'+" +
//                    "document.getElementsById('div_1')[0].innerHTML+" +
//                    //"document.getElementsByTagName('html')[0].innerHTML+" +
//                    "'</html>'); })();",
//            new ValueCallback<String>() {
//                @Override
//                public void onReceiveValue(String xxx) {
//                    //Log.d("HTML", xxx);
//                    // code here
//                    //Toast.makeText(get, "icon_2", Toast.LENGTH_SHORT).show();
//                }
//            });
//
//}

//                    "(function() {return (''+" +
//                            "document.getElementById('div_1').innerHTML+" +
//                            //"document.getElementsById('div_1').innerHTML+" +
//                            //"document.getElementsByTagName('html')[0].innerHTML+" +
//                            "''); })();",