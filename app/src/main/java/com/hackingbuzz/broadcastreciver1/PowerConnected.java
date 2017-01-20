package com.hackingbuzz.broadcastreciver1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 10/31/2016.
 */
public class PowerConnected extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Power is Connected", Toast.LENGTH_LONG).show(); // three parameters 1.context means this class 2. Message to print . 3 duration ..for long time or short time

    }
}
