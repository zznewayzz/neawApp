package com.example.mynamekarn.neaw03;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by New on 5/14/16 AD.
 */
public class res1 extends Activity implements View.OnClickListener{
    Button fac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res1);
        init();
        fac.setOnClickListener(this);
    }
    private void init(){
        fac = (Button) findViewById(R.id.button);
    }
    @Override
    public void onClick(View view){
        Uri uri = Uri.parse("https://goo.gl/uaK1VL"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
