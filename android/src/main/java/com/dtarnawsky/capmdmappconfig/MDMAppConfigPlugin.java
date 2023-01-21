package com.dtarnawsky.capmdmappconfig;

import android.app.Activity;
import android.view.WindowManager;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "MDMAppConfig")
public class MDMAppConfigPlugin extends Plugin {

    @PluginMethod
    public void getValue(PluginCall call) {
        JSObject ret = new JSObject();
        call.resolve(
            new JSObject() {
                {
                    put("value", "test");
                }
            }
        );
    }
}
