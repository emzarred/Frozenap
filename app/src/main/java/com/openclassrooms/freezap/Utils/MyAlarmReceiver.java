package com.openclassrooms.freezap.Utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by pc on 14/03/2018.
 */

public class MyAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "We love you so much guys...", Toast.LENGTH_SHORT).show();
    }
}
