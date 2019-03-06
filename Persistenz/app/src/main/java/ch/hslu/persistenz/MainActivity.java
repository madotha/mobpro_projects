package ch.hslu.persistenz;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        // Initialisierung der SharedPreferences und Counter hochzählen
        final SharedPreferences sharedPreferences = getSharedPreferences("ch.hslu.persistenz", MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        final int newResumeCount = sharedPreferences.getInt("counterKey", 0) + 1;
        // Editieren der SharedPreferences
        editor.putInt("counterKey", newResumeCount);
        editor.apply();

        // Änderung der TextView
        final TextView counterView = (TextView) findViewById(R.id.main_section1_counter);
        int counterForLabel = sharedPreferences.getInt("counterKey", 0);
        counterView.setText("MainActivity.onResume() wurde seit der Installation dieser App "+counterForLabel+" mal aufgerufen.");

        this.setTeaPreferences();

    }

    public void editTeaPreferences(View v) {
        Intent teaPrefs = new Intent(this, TeaPreferenceActivity.class);
        startActivity(teaPrefs);
    }

    public void resetTeaPreferences(View v) {
        SharedPreferences teaPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = teaPrefs.edit();
        editor.putString("teaPreferred", "Lipton/Pfefferminztee");
        editor.putString("teaSweetener", "natural");
        editor.putBoolean("teaWithSugar", true);
        editor.apply();

        this.setTeaPreferences();
    }

    public void setTeaPreferences() {
        SharedPreferences teaPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        String teaSweetener = teaPrefs.getString("teaSweetener","unicorn");
        String teaPreferred = teaPrefs.getString("teaPreferred", "Grüntee");
        System.out.print(teaSweetener);
        final TextView prefsView = (TextView) findViewById(R.id.main_section1_preferences);
        prefsView.setText("Ich trinke am liebsten "+teaPreferred+", mit "+teaSweetener+" gesüsst.");

        // TODO: zeigt noch EntryValue anstatt Entry an

    }

}
