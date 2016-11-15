package uk.cjmalone.usagestats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.UsageStatsActivity");

        //intent.addCategory("com.android.settings.SHORTCUT");

        startActivity(intent);

        finish();
        super.onCreate(savedInstanceState);
    }
}
