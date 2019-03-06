package ch.hslu.persistenz;

import android.app.Activity;
import android.preference.PreferenceFragment;
import android.os.Bundle;

public class TeaPreferenceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new TeaPreferenceInitializer()).commit();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
    }

    public static final class TeaPreferenceInitializer extends PreferenceFragment {
        @Override
        public void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }

    }



}
