package com.tws.commonlib.wificonfig;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/24.
 */

public class WiFiConfigureContext {

    public static  final int VOICE_TYPE_FACEBER = 0;
    public static  final int VOICE_TYPE_HICHIP = 1;

    private List<BaseConfig> configList;

    public void setReceiveListner(BaseConfig.OnReceivedListener l) {
        for (BaseConfig cf : configList) {
            cf.setReceiveListner(l);
        }
    }

    public void clearReceiveListner() {
        for (BaseConfig cf : configList) {
            cf.setReceiveListner(null);
        }
    }

    public WiFiConfigureContext() {
        this.configList = new ArrayList<BaseConfig>();
        this.configList.add(HiSmartLink.singleInstance());
        this.configList.add(CooConfig.singleInstance());
        this.configList.add(FaceberConfig.singleInstance());
    }
    public WiFiConfigureContext(Context context, int type) {
        this.configList = new ArrayList<BaseConfig>();
        if(type == VOICE_TYPE_FACEBER) {
            this.configList.add(FaceberConfig.singleInstance());
            this.configList.add(CooConfig.singleInstance());
        }
        else if(type == VOICE_TYPE_HICHIP){
            HiVoiceConfig.singleInstance().setContext(context);
            this.configList.add(HiVoiceConfig.singleInstance());
        }
        //
        this.configList.add(HiSmartLink.singleInstance());
    }
    public void add(BaseConfig config) {
        for (BaseConfig c : configList) {
            if (c.getClass() == config.getClass()) {
                return;
            }
        }
        this.configList.add(config);
    }

    public void remove(BaseConfig config) {
        this.configList.remove(config);
    }

    public void setData(String ssid, String pwd, int authmode) {
        for (BaseConfig config : configList) {
            config.set(ssid, pwd);
            config.setAuthMode(authmode);
        }
    }

    public void setUid(String uid) {
        for (BaseConfig config : configList) {
            config.setUid(uid);
        }
    }

    public void startConfig() {
        for (BaseConfig config : configList) {
            config.runConfig();
        }
    }

    public void stopConfig() {
        for (BaseConfig config : configList) {
            config.stopConfig();
        }
    }
}
