package com.katsthings.personalrssfeed;


public class RssFeed {

    public String rssFeedTitle;
    public String rssFeedAddress;
    public int id;

    public RssFeed (String title, String address){
        rssFeedTitle = title;
        rssFeedAddress = address;

    }

    public RssFeed (int FeedId, String title, String address){
        rssFeedTitle = title;
        rssFeedAddress = address;
        id = FeedId;
    }

}
