package com.ahmad.cv.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.base.R;
import com.ahmad.cv.model.DemoItem;

import java.util.List;


public class SkillsAdapter extends RecyclerView.Adapter <SkillsAdapter.SkillsViewHolder>{
String []data;
public SkillsAdapter(String []da){
    this.data=da;
}
    @NonNull
    @Override
    public SkillsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row      = inflater.inflate(R.layout.skills, parent, false);

        return new SkillsViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull SkillsViewHolder holder, int position) {
    String t=data[position];
    holder.txt.setText(t);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class SkillsViewHolder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView txt;
        public SkillsViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView);
            txt=itemView.findViewById(R.id.textView2);
        }
    }
}
