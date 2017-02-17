package com.lizengyunle.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class CustomView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        LinearLayout root =new LinearLayout(this);
//        super.setContentView(root);
//        //创建DrawView组件
//        final DrawView draw = new DrawView(this);
//        //设置自定义组件的最大宽度、高度
//        draw.setMinimumHeight(500);
//        draw.setMinimumWidth(300);
//        root.addView(draw);
        setContentView(R.layout.first_app);
    }

}
