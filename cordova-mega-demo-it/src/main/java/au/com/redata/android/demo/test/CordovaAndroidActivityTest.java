package au.com.redata.android.demo.test;

import android.test.ActivityInstrumentationTestCase2;
import au.com.redata.android.demo.*;

public class CordovaAndroidActivityTest extends ActivityInstrumentationTestCase2<CordovaAndroidActivity> {

    public CordovaAndroidActivityTest() {
        super(CordovaAndroidActivity.class); 
    }

    public void testActivity() {
        CordovaAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

