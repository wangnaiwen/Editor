package com.wnw.wnw.editor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 *
 * @author wnw
 *
 * @date 2017/11/17 15:15
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_open_editor)
    public void openEditor(){
        Log.d("wnw", "wnwnwnwnnw");
        startActivity(new Intent(this, EditorActivity.class));
    }
}
