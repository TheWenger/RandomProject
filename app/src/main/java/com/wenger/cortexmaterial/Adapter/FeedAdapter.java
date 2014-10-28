package com.wenger.cortexmaterial.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wenger.cortexmaterial.R;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder>{

    @Override
    public FeedAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if(viewType == 0){
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_status, parent, false);
        }
        else{
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_photo, parent, false);
        }

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public int getItemViewType(int position) {
        if(position%2==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public void onBindViewHolder(FeedAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 25;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
