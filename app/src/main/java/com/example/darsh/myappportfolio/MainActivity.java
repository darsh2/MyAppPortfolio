package com.example.darsh.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by darshan on 25/3/16.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        String buttonText;
        switch (v.getId()) {
            case R.id.bigger: {
                buttonText = getString(R.string.build);
                break;
            }

            case R.id.capstone: {
                buttonText = getString(R.string.toast_capstone);
                break;
            }

            case R.id.library: {
                buttonText = getString(R.string.library);
                break;
            }

            case R.id.reader: {
                buttonText = getString(R.string.reader);
                break;
            }

            case R.id.scores: {
                buttonText = getString(R.string.scores);
                break;
            }

            case R.id.streamer: {
                buttonText = getString(R.string.streamer);
                break;
            }

            default: {
                buttonText = "";
            }
        }

        String toastText = getString(R.string.toast_text) +
                buttonText +
                getString(R.string.toast_app);
        Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT).show();
    }
}
