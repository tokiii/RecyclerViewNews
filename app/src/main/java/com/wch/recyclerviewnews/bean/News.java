package com.wch.recyclerviewnews.bean;

import java.util.List;

/**
 * Created by WuChangHe on 2016/9/14.
 */
public class News {
    private String NewsId;
    private String LogoImageUrl;
    private String Author;
    private String Description;
    private String LinkUrl;
    private String Source;
    private String ShowTime;
    private String CreateTime;
    private String NewsTitle;
    private int ShowType;
    private int NewsType;
    private List<String> NewsPicDetailList;

    public String getNewsId() {
        return NewsId;
    }

    public void setNewsId(String newsId) {
        NewsId = newsId;
    }

    public String getLogoImageUrl() {
        return LogoImageUrl;
    }

    public void setLogoImageUrl(String logoImageUrl) {
        LogoImageUrl = logoImageUrl;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLinkUrl() {
        return LinkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        LinkUrl = linkUrl;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getShowTime() {
        return ShowTime;
    }

    public void setShowTime(String showTime) {
        ShowTime = showTime;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getNewsTitle() {
        return NewsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        NewsTitle = newsTitle;
    }

    public int getShowType() {
        return ShowType;
    }

    public void setShowType(int showType) {
        ShowType = showType;
    }

    public int getNewsType() {
        return NewsType;
    }

    public void setNewsType(int newsType) {
        NewsType = newsType;
    }

    public List<String> getNewsPicDetailList() {
        return NewsPicDetailList;
    }

    public void setNewsPicDetailList(List<String> newsPicDetailList) {
        NewsPicDetailList = newsPicDetailList;
    }
}
