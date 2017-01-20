package com.hackingbuzz.broadcastreciver1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 10/31/2016.
 */
public class PowerDisconnected extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Power is Disconnected", Toast.LENGTH_SHORT).show();
    }
}
