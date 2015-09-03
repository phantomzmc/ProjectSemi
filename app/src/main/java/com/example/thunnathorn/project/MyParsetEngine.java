package com.example.thunnathorn.project;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Thunnathorn on 25/8/2558.
 */
public class MyParsetEngine {
    private static String tagName;
    private static int item;


    public static class NewsItem {
        public String title;
        public String link;

        @Override
        public String toString() {
            return title;
        }
    }

    public static ArrayList<NewsItem> parse(InputStream stream)
            throws XmlPullParserException, IOException {

        ArrayList<NewsItem> items = new ArrayList<NewsItem>();

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        XmlPullParser parser = factory.newPullParser();
        parser.setInput(stream, "UTF-8");

        while (parser.next() != XmlPullParser.END_DOCUMENT) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            if (parser.getName().equals("item")) {
                NewsItem item = parseItem(parser);
                items.add(item);
            }
        }
        return items;
    }

    private static NewsItem parseItem(XmlPullParser parser) throws XmlPullParserException, IOException {
        NewsItem item = new NewsItem();

        while (parser.next() != XmlPullParser.START_TAG) {
            continue;
        }
        if (tagName.equals("title")) {
            item.title = readContent(parser);
        } else if (tagName.equals("link")) {
            item.link = readContent(parser);
        } else {
            while (parser.next() != XmlPullParser.END_TAG) {
            }
        }
        return item;
    }


    private static String readContent(XmlPullParser parser) throws XmlPullParserException, IOException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.next();
        }
        return result;

    }
}