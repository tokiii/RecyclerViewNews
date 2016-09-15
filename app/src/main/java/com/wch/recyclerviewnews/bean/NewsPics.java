package com.wch.recyclerviewnews.bean;

/**
 * Created by WuChangHe on 2016/9/14.
 */
public class NewsPics {

    private String NewsPicId;
    private String PicUrl;
    private String SortIndex;
    private String NewsId;
    private String CMS_NewsInfo;

    public String getNewsPicId() {
        return NewsPicId;
    }

    public void setNewsPicId(String newsPicId) {
        NewsPicId = newsPicId;
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getSortIndex() {
        return SortIndex;
    }

    public void setSortIndex(String sortIndex) {
        SortIndex = sortIndex;
    }

    public String getNewsId() {
        return NewsId;
    }

    public void setNewsId(String newsId) {
        NewsId = newsId;
    }

    public String getCMS_NewsInfo() {
        return CMS_NewsInfo;
    }

    public void setCMS_NewsInfo(String CMS_NewsInfo) {
        this.CMS_NewsInfo = CMS_NewsInfo;
    }
}
