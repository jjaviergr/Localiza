package com.example.pc.localiza;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:36.8152359,-2.5784975?z=15"));
        startActivity(intent);

    }
}
