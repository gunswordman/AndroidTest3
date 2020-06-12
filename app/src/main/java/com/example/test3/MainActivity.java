package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //组件定义
    private EditText edit;
    private TextView viem;
    private Button btn;

    //存储edittext中内容
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        //组件初始化
        edit=(EditText)findViewById(R.id.editText);
        viem=(TextView)findViewById(R.id.textView );
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=edit.getText().toString();
                viem.setText(text);
            }
        });
    }
}
