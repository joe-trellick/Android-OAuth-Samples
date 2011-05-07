package com.retrovirus.android.oauthsamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AndroidOAuthSamplesActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.android_oauth_samples_activity);
    
    Button calendarButton = (Button) findViewById(R.id.google_calendar_via_java_api);
    calendarButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
      }
    });
  }

}
