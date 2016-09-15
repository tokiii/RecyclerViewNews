package com.wch.recyclerviewnews.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wch.recyclerviewnews.R;
import com.wch.recyclerviewnews.adapters.Holders.NewsAdvisementHolder;
import com.wch.recyclerviewnews.adapters.Holders.NewsNoImageHolder;
import com.wch.recyclerviewnews.adapters.Holders.NewsWithMoreImageHolder;
import com.wch.recyclerviewnews.adapters.Holders.NewsWithOneImageHolder;
import com.wch.recyclerviewnews.adapters.Holders.NewsWithVideoHolder;
import com.wch.recyclerviewnews.bean.News;

import java.util.List;

/**
 * news adapter
 * Created by WuChangHe on 2016/9/14.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private final int ITEM_TYPE_NO_IMAGE = 0;
    private final int ITEM_TYPE_WITH_ONE_IMAGE = 3;
    private final int ITEM_TYPE_WITH_MORE_IMAGE = 2;
    private final int ITEM_TYPE_WITH_ADVISEMENT = 5;
    private final int ITEM_TYPE_WITH_VIDEO = 4;
    private LayoutInflater layoutInflater;

    private List<News> mLists;
    private Context context;

    public RecyclerViewAdapter(Context context, List<News> lists) {
        this.mLists = lists;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View newsAdvisementView = layoutInflater.inflate(R.layout.item_news_with_advisement, parent);
        View newsNoImageView = layoutInflater.inflate(R.layout.item_news_with_no_image, parent);
        View newsOneImageView = layoutInflater.inflate(R.layout.item_news_with_one_image, parent);
        View newsVideoView = layoutInflater.inflate(R.layout.item_news_with_video, parent);
        View newsMoreImageView = layoutInflater.inflate(R.layout.item_news_with_more_image, parent);

        if (viewType == ITEM_TYPE_NO_IMAGE)
            return new NewsNoImageHolder(newsNoImageView);
        if (viewType == ITEM_TYPE_WITH_ADVISEMENT)
            return new NewsAdvisementHolder(newsAdvisementView);
        if (viewType == ITEM_TYPE_WITH_MORE_IMAGE)
            return new NewsWithMoreImageHolder(newsMoreImageView);
        if (viewType == ITEM_TYPE_WITH_VIDEO)
            return new NewsWithVideoHolder(newsVideoView);
        if (viewType == ITEM_TYPE_WITH_ONE_IMAGE)
            return new NewsWithOneImageHolder(newsOneImageView);

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof NewsWithOneImageHolder) {

        }

        if (holder instanceof NewsNoImageHolder) {

        }

        if (holder instanceof NewsWithVideoHolder) {

        }

        if (holder instanceof NewsWithMoreImageHolder) {

        }

        if (holder instanceof NewsAdvisementHolder) {

        }

    }

    @Override
    public int getItemCount() {
        return mLists.size();
    }


    @Override
    public int getItemViewType(int position) {
        final int showType = mLists.get(position).getShowType();
        switch (showType) {
            case ITEM_TYPE_NO_IMAGE:
                return ITEM_TYPE_NO_IMAGE;
            case ITEM_TYPE_WITH_ADVISEMENT:
                return ITEM_TYPE_WITH_ADVISEMENT;
            case ITEM_TYPE_WITH_MORE_IMAGE:
                return ITEM_TYPE_WITH_MORE_IMAGE;
            case ITEM_TYPE_WITH_VIDEO:
                return ITEM_TYPE_WITH_VIDEO;
            case ITEM_TYPE_WITH_ONE_IMAGE:
                return ITEM_TYPE_WITH_ONE_IMAGE;
        }
        return super.getItemViewType(position);
    }
}
