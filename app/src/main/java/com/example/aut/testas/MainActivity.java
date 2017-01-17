package com.example.aut.testas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.analytics.Analytics;
import com.microsoft.azure.mobile.crashes.Crashes;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //mobile center
        MobileCenter.start(getApplication(), "6f3a4d53-1291-40ec-8b4c-db7fea18990e",
                Analytics.class, Crashes.class);

        setContentView(R.layout.activity_main);
    }
}
