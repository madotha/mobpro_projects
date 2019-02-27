package ch.hslu.ui_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;

public class LayoutDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String layout = getIntent().getStringExtra("layout");
        if (layout.equals("layoutdemo_linearlayout")) {
            setContentView(R.layout.layoutdemo_linearlayout);
        } else if (layout.equals("layoutdemo_constraintlayout")) {
            setContentView(R.layout.layoutdemo_constraintlayout);
        } else {
            setContentView(R.layout.activity_layout_demo);
            // This'd show you did something kinda wrong, so try doing it again
        }
    }

}
