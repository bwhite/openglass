package com.dappervision.wearscript.activities;

import android.app.Activity;
import android.os.Bundle;

import com.dappervision.wearscript.core.Utils;
import com.dappervision.wearscript.core.events.ShutdownEvent;

public class StopActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.getEventBus().post(new ShutdownEvent());
        finish();
    }
}
