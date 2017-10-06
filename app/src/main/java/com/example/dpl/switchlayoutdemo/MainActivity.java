package com.example.dpl.switchlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tandong.swichlayout.BaseEffects;
import com.tandong.swichlayout.SwitchLayout;

public class MainActivity extends AppCompatActivity {
    private Button btn_ok, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7,
            btn_8, btn_9, btn_10, btn_11, btn_12, btn_13, btn_14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        // 设置进入Activity的Activity特效动画，同理可拓展为布局动画
        SwitchLayout.getSlideFromBottom(this, false,
                BaseEffects.getQuickToSlowEffect());
        // 三个参数分别为（Activity/View，是否关闭Activity，特效（可为空））
        initListener();

    }

    private void initListener() {
        btn_ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 0);
                MainActivity.this.startActivity(in);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 1);
                MainActivity.this.startActivity(in);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 2);
                MainActivity.this.startActivity(in);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 3);
                MainActivity.this.startActivity(in);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 4);
                MainActivity.this.startActivity(in);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 5);
                MainActivity.this.startActivity(in);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 6);
                MainActivity.this.startActivity(in);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 7);
                MainActivity.this.startActivity(in);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 8);
                MainActivity.this.startActivity(in);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 9);
                MainActivity.this.startActivity(in);
            }
        });
        btn_10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 10);
                MainActivity.this.startActivity(in);
            }
        });
        btn_11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 11);
                MainActivity.this.startActivity(in);
            }
        });
        btn_12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 12);
                MainActivity.this.startActivity(in);
            }
        });
        btn_13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 13);
                MainActivity.this.startActivity(in);
            }
        });
        btn_14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("key", 14);
                MainActivity.this.startActivity(in);
            }
        });
    }

    private void initView() {
        btn_ok = (Button) this.findViewById(R.id.btn_ok);
        btn_1 = (Button) this.findViewById(R.id.btn_1);
        btn_2 = (Button) this.findViewById(R.id.btn_2);
        btn_3 = (Button) this.findViewById(R.id.btn_3);
        btn_4 = (Button) this.findViewById(R.id.btn_4);
        btn_5 = (Button) this.findViewById(R.id.btn_5);
        btn_6 = (Button) this.findViewById(R.id.btn_6);
        btn_7 = (Button) this.findViewById(R.id.btn_7);
        btn_8 = (Button) this.findViewById(R.id.btn_8);
        btn_9 = (Button) this.findViewById(R.id.btn_9);
        btn_10 = (Button) this.findViewById(R.id.btn_10);
        btn_11 = (Button) this.findViewById(R.id.btn_11);
        btn_12 = (Button) this.findViewById(R.id.btn_12);
        btn_13 = (Button) this.findViewById(R.id.btn_13);
        btn_14 = (Button) this.findViewById(R.id.btn_14);

    }
}
