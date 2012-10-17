package au.com.redata.android.demo;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import de.akquinet.android.androlog.Log;

public class CordovaAndroidActivity extends DroidGap {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after
     * previously being shut down then this Bundle contains the data it most
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializes the logging
        Log.init();

        // Log a message (only on dev platform)
        Log.i(this, "onCreate");

        super.loadUrl("file:///android_asset/www/index.html",700);
    }

}

