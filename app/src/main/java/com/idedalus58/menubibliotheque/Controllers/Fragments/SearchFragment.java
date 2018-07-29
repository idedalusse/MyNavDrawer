package com.idedalus58.menubibliotheque.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idedalus58.menubibliotheque.R;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SearchView;
import android.widget.Toast;


/**
 * Créer par Ben senouci Nidhal on 08/07/2018.
 */

public class  SearchFragment extends Fragment {

    public static com.idedalus58.menubibliotheque.Controllers.Fragments.SearchFragment newInstance() {
        return (new com.idedalus58.menubibliotheque.Controllers.Fragments.SearchFragment ());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }



    /*public class SimpleAndroidSearchViewExample extends AppCompatActivity{

        SearchView searchView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.searchview_android_example);

            searchView=(SearchView) findViewById(R.id.searchView);
            searchView.setQueryHint("Search View");

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String query) {
                    Toast.makeText(getBaseContext(), query, Toast.LENGTH_LONG).show();
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    Toast.makeText(getBaseContext(), newText, Toast.LENGTH_LONG).show();
                    return false;
                }
            });
        }
    }*/
}

