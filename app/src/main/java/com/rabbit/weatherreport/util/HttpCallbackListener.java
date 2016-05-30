package com.rabbit.weatherreport.util;

/**
 * Created by ComposerQ on 2016/5/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
