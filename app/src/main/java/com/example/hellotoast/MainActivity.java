package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){
        Toast.makeText(MainActivity.this, Integer.toString(mCount), Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        mCount++;
        TextView mShowCount = findViewById(R.id.show_count);
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
