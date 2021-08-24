package kr.hs.emirim.w2026.ex14_1_4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MysicService extends Service {
    public MysicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}