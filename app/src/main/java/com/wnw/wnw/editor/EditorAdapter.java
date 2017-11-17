package com.wnw.wnw.editor;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 *
 * @author wnw
 *
 * @date 2017/11/17 15:18
 *
 */

public class EditorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private EditorListener mEditorListener;

    public void setEditorListener(EditorListener  editorListener){
        this.mEditorListener = editorListener;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
