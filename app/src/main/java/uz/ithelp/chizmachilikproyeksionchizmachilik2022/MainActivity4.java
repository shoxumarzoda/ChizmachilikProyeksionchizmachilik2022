package uz.ithelp.chizmachilikproyeksionchizmachilik2022;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

//        this.getActionBar().hide();
        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(3000);  //Delay of 10 seconds
                } catch (Exception e) {

                } finally {

                    Intent i = new Intent(MainActivity4.this,
                            MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();


    }
}