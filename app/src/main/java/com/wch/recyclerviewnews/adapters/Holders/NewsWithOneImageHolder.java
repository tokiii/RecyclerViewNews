package com.wch.recyclerviewnews.adapters.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wch.recyclerviewnews.R;

/**
 * Created by WuChangHe on 2016/9/15.
 */
public class NewsWithOneImageHolder extends RecyclerView.ViewHolder {

    private TextView tv_news_title;
    private TextView tv_news_type;
    private TextView tv_news_time;
    private ImageView iv_news_image;

    public NewsWithOneImageHolder(View itemView) {
        super(itemView);
        tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
        tv_news_type = (TextView) itemView.findViewById(R.id.tv_news_type);
        iv_news_image = (ImageView) itemView.findViewById(R.id.iv_news_image);
        tv_news_time = (TextView) itemView.findViewById(R.id.tv_news_time);
    }
}
