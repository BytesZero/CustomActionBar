package com.zsl.customactionbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {


    TextView tv_left,tv_title,tv_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActionBar();

    }

    private void initActionBar() {
        tv_left= (TextView) findViewById(R.id.ui_myactionbar_tv_left);
        tv_title= (TextView) findViewById(R.id.ui_myactionbar_tv_title);
        tv_right= (TextView) findViewById(R.id.ui_myactionbar_tv_right);

        tv_left.setText("返回");
        tv_title.setText("标题");
        tv_right.setText("完成");

    }
}
