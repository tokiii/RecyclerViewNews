package com.wch.recyclerviewnews.adapters.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wch.recyclerviewnews.R;

/**
 * Created by WuChangHe on 2016/9/15.
 */
public class NewsWithMoreImageHolder extends RecyclerView.ViewHolder {

    private TextView tv_news_title;

    private ImageView iv_news_1;
    private ImageView iv_news_2;
    private ImageView iv_news_3;

    public NewsWithMoreImageHolder(View itemView) {
        super(itemView);
        tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
        iv_news_1 = (ImageView) itemView.findViewById(R.id.iv_news_1);
        iv_news_2 = (ImageView) itemView.findViewById(R.id.iv_news_2);
        iv_news_3 = (ImageView) itemView.findViewById(R.id.iv_news_3);
    }
}
