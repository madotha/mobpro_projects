package ch.hslu.ui_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class ViewsDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String loglabel_dyn = getString(R.string.viewdemo_logLabel_dyn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views_demo);

        final TextView logLabel = (TextView) findViewById(R.id.logLabel);

        final RatingBar ratingbar = (RatingBar) findViewById(R.id.ratingBar);
        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                logLabel.setText(loglabel_dyn+rating);
            }
        });
    }

}
