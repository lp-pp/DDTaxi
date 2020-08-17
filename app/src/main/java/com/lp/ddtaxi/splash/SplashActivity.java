package com.lp.ddtaxi.splash;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.lp.ddtaxi.R;

public class SplashActivity extends Activity {
    private String TAG = SplashActivity.class.getSimpleName();

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_splash_beforemain);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            final ImageView imageView = findViewById(R.id.logo);
            final AnimatedVectorDrawable anim = (AnimatedVectorDrawable) imageView.getDrawable();
            anim.start();

            mMediaPlayer = MediaPlayer.create(this, R.raw.didi_hello);
            mMediaPlayer.start();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    /**
                     *要执行的操作
                     */
                    Intent intent = new Intent(SplashActivity.this, SplashPicActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 4000);//动画完成后执行Runnable中的run方法
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mMediaPlayer != null) {
            if(mMediaPlayer.isPlaying()){
                mMediaPlayer.stop();//停止音频的播放
            }
            mMediaPlayer.release();//释放资源
        }
    }
}