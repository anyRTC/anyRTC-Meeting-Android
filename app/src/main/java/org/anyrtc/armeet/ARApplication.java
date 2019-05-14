package org.anyrtc.armeet;

import android.app.Application;

import org.ar.meet_kit.ARMeetEngine;


/**
 * Created by liuxiaozhong on 2019/3/12.
 */
public class ARApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARMeetEngine.Inst().initEngineWithARInfo(getApplicationContext(),DeveloperInfo.DEVELOPERID, DeveloperInfo.APPID,DeveloperInfo.APPKEY,DeveloperInfo.APPTOKEN);
    }
}
