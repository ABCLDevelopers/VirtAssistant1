package com.example.bharat.virtassistant.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.bharat.virtassistant.R;
import com.example.bharat.virtassistant.models.chmodel;
import com.github.library.bubbleview.BubbleTextView;

import java.util.List;
/**
 * Created by BHARAT on 19-10-2017.
 */

public class Customadapter extends BaseAdapter {
    private List<chmodel> list_chat_models;
    private Context context;
    private LayoutInflater layoutInflater;

    public Customadapter(List<chmodel> list_chat_models, Context context) {
        this.list_chat_models = list_chat_models;
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list_chat_models.size();
    }

    @Override
    public Object getItem(int position) {
        return list_chat_models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null)
        {
            if(list_chat_models.get(position).isSend)
                view = layoutInflater.inflate(R.layout.list_item_message_send,null);
            else
                view = layoutInflater.inflate(R.layout.list_item_message_recv,null);

            BubbleTextView text_message = (BubbleTextView)view.findViewById(R.id.text_message);
            text_message.setText(list_chat_models.get(position).message);

        }
        return view;
    }
}
