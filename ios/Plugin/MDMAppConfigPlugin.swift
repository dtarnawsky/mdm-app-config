import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(MDMAppConfigPlugin)
public class MDMAppConfigPlugin: CAPPlugin {
    
    @objc func getValue(_ call: CAPPluginCall) {
        call.resolve([
            "value": "test"
        ])        
    }
}
