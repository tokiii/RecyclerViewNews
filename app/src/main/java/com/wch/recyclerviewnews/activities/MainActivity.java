package com.wch.recyclerviewnews.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.gson.reflect.TypeToken;
import com.wch.recyclerviewnews.R;
import com.wch.recyclerviewnews.bean.News;
import com.wch.recyclerviewnews.utils.JsonUtils;
import com.wch.recyclerviewnews.utils.LogUtils;

import org.json.JSONException;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        String newsJson = JsonUtils.getJson(this, "newsrecommend.json");
        try {
            String advisementListsJson = JsonUtils.getValueFromJson(newsJson, "guanggao").toString();
            String newsListsJson = JsonUtils.getValueFromJson(newsJson, "news").toString();
            List<News> advisementLists = JsonUtils.jsonToList(advisementListsJson, new TypeToken<List<News>>() {
            });
            List<News> newsList = JsonUtils.jsonToList(newsListsJson, new TypeToken<List<News>>() {
            });
            LogUtils.i("the advisement is " + advisementListsJson);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
