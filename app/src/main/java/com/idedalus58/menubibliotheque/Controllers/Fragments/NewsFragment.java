package com.idedalus58.menubibliotheque.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idedalus58.menubibliotheque.R;

/**
 * Created by Philippe on 20/11/2017.
 */

public class NewsFragment extends Fragment {

    public static NewsFragment newInstance() {
        return (new NewsFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }
}