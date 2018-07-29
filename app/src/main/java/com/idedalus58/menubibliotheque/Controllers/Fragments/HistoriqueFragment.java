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

    public class  HistoriqueFragment extends Fragment {

        public static com.idedalus58.menubibliotheque.Controllers.Fragments.HistoriqueFragment newInstance() {
            return (new com.idedalus58.menubibliotheque.Controllers.Fragments.HistoriqueFragment ());
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_historique, container, false);
        }
    }


