package com.wnw.wnw.editor;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

/**
 * @author wnw
 * @date 2017/11/17 0017 15:51
 */
public class EditorActivity extends Activity{

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        //去掉默认背景图片，防止过度绘制
        getWindow().setBackgroundDrawable(null);
        //init view
        initView();
    }

    /**
     * init view
     * */
    private void initView(){

    }
}
