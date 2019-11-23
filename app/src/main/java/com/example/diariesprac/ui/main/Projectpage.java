package com.example.diariesprac.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.diariesprac.R;

public class Projectpage extends Fragment {



    public Projectpage () {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.main_fragment,container,false);
        WebView webView = v.findViewById(R.id.webview);

        webView.loadUrl("https://diariesuvce.firebaseapp.com/project");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);         //// Use cache resources when avaliable.....otherwise use network
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);

        return v;

    }



}
