package com.lizengyunle.activitytest0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","the SecondActivity Task id is"+ getTaskId());
        setContentView(R.layout.second_layout);
        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Intent intent = new Intent();
//                intent.putExtra("data_return","Hello MainActivity");
//                setResult(RESULT_OK,intent);
//                finish();
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }

        });
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity",data);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("FirstActivitySecond","onDestroy");
    }
}
