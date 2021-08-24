package kr.hs.emirim.w2026.ex14_1_4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MusicService extends Service {
    MediaPlayer mp;

    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public void onCreate(){
        Log.i("서비스 테스트::", "onCreate(); 호출됨");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("서비스 테스트::", "onStartCommand(); 호출됨");
        Toast.makeText(getApplication(), "onStartCommand() 호출됨", Toast.LENGTH_LONG).show();
        mp = MediaPlayer.create(this, R.raw.woman);
//        mp.setLooping(true);
        mp.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("서비스 테스트::", "onDestroy(); 호출됨");
        mp.stop();
        super.onDestroy();
    }
}
