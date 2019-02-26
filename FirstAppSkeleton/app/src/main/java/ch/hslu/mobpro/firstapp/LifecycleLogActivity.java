package ch.hslu.mobpro.firstapp;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Logs lifecycle transitions into the LogCat view of the ADT-Debugger.
 *
 * @author Ruedi Arnold
 */

public class LifecycleLogActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onCreate() aufgerufen");
    }

    @Override
    public void onStart() {
        super.onStart();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onStart() aufgerufen");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onRestart() aufgerufen");
    }

    @Override
    public void onResume() {
        super.onResume();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onResume() aufgerufen");
    }

    @Override
    public void onPause() {
        super.onPause();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onPause() aufgerufen");
    }

    @Override
    public void onStop() {
        super.onStop();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onStop() aufgerufen");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.lifecycle_logger);
        Log.i("hslu_mobApp", "onDestroy() aufgerufen");
    }

}