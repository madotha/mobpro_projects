package ch.hslu.ui_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startLinearLayoutDemo(View v) {
        Intent layoutdemo = new Intent(this, LayoutDemoActivity.class);
        layoutdemo.putExtra("layout", "layoutdemo_linearlayout");
        startActivity(layoutdemo);
    }

    public void startConstraintLayoutDemo(View v) {
        Intent layoutdemo = new Intent(this, LayoutDemoActivity.class);
        layoutdemo.putExtra("layout", "layoutdemo_constraintlayout");
        startActivity(layoutdemo);
    }

    public void startViewsDemoActivity(View v) {
        Intent viewsdemo = new Intent(this, ViewsDemoActivity.class);
        startActivity(viewsdemo);
    }

}
