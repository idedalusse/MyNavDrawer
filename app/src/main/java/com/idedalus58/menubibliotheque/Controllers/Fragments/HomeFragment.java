package com.idedalus58.menubibliotheque.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idedalus58.menubibliotheque.R;


/**
 * Creér par Ben senouci Nidhal on 08/07/2018.
 */

public class  HomeFragment extends Fragment {

    public static com.idedalus58.menubibliotheque.Controllers.Fragments.HomeFragment newInstance() {
        return (new com.idedalus58.menubibliotheque.Controllers.Fragments.HomeFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}


