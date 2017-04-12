package com.example.android.katetraveller;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void localization(View view) {
        // FInd the user name
        TextView local = (TextView) findViewById(R.id.textView3);


        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:51.0770048, 17.0428703"));
        if (intent.resolveActivity(getPackageManager()) !=null) {
            startActivity(intent);
        }

    }

}
