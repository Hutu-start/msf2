# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
-keep class com.alibaba.msf.performance.sdk.** { *; }
# 支付宝混淆
-keep class com.alibaba.fastjson.** { *; }
-keep class fvv.** { *; }
-keepclassmembers class ** {
     @com.squareup.otto.Subscribe public *;
     @com.squareup.otto.Produce public *;
}
-keep class com.alipay.mobile.android.verify.** { *; }
# 高德混淆
 -keep class com.amap.api.location.**{*;}
 -keep class com.amap.api.fence.**{*;}
 -keep class com.loc.**{*;}
 -keep class com.autonavi.aps.amapapi.model.**{*;}
