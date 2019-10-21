package com.stonecolders.checkmate.dash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.stonecolders.checkmate.R;

public class NewsFragment extends Fragment {

    CardView News1, News2, News3;
    WebView webView;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_news, container, false);
        News1 = rootView.findViewById(R.id.card1);
        News2 = rootView.findViewById(R.id.card2);
        News3 = rootView.findViewById(R.id.card3);
        webView = rootView.findViewWithTag(R.id.webview);
        News1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl("https://thehackernews.com/2019/10/election-software-hacking.html");
            }
        });
        News2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl("https://thehackernews.com/2019/10/chrome-site-isolation-android.html");
            }
        });
        News3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl("https://thehackernews.com/2019/10/dark-web-child-abuse.html");
            }
        });
        return rootView;
    }
}
