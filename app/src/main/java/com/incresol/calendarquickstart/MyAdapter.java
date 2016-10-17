package com.incresol.calendarquickstart;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Incresol-078 on 16-09-2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private static ArrayList<String> mDataset;
    Context mContext;
public MyAdapter(){
    super();
}

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView_description;
        public RelativeLayout rowLayout_main;
        public android.support.v7.widget.SwitchCompat switchCompat;


        public ViewHolder(View itemView) {
            super(itemView);
            textView_description=(TextView)itemView.findViewById(R.id.textView_description);
            rowLayout_main=(RelativeLayout)itemView.findViewById(R.id.rowlayout_main);
            switchCompat=(android.support.v7.widget.SwitchCompat)itemView.findViewById(R.id.list_item_switch);
        }

    }

    public void add(int position, String item){
        mDataset.add(position,item);
        notifyItemInserted(position);
    }

    public void remove(String item){
        int position=mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }


    public MyAdapter(ArrayList<String> myDataSet, Context context){
        mDataset=myDataSet;
        mContext = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name=mDataset.get(position);

        if(position%2 == 0){
            holder.rowLayout_main.setBackgroundResource(R.drawable.custom_even_listlayout);
        }else{
            holder.rowLayout_main.setBackgroundResource(R.drawable.custom_odd_listlayout);
        }


        System.out.println("==========>>>>>>>>>>>>>>>>>>>>onBindViewHolder");
        holder.textView_description.setText(mDataset.get(position));
        holder.switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });
        /*holder.rowlayout_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(name);
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
