package com.bboalasad.app;
import android.app.*;import android.os.*;import android.webkit.*;import android.Manifest;import android.content.pm.PackageManager;
public class MainActivity extends Activity{
 public void onCreate(Bundle b){super.onCreate(b); if(Build.VERSION.SDK_INT>=23&&checkSelfPermission(Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED)requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO},5); WebView w=new WebView(this); w.getSettings().setJavaScriptEnabled(true); w.getSettings().setDomStorageEnabled(true); w.setWebViewClient(new WebViewClient()); w.loadUrl("file:///android_asset/index.html"); setContentView(w);}
}
