package com.idedalus58.menubibliotheque.Controllers.Activities;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.idedalus58.menubibliotheque.Controllers.Fragments.AproposFragment;
import com.idedalus58.menubibliotheque.Controllers.Fragments.HistoriqueFragment;
import com.idedalus58.menubibliotheque.Controllers.Fragments.HomeFragment;
import com.idedalus58.menubibliotheque.Controllers.Fragments.NewsFragment;
import com.idedalus58.menubibliotheque.Controllers.Fragments.SettingFragment;
import com.idedalus58.menubibliotheque.Controllers.Fragments.ProfileFragment;
import com.idedalus58.menubibliotheque.Controllers.Fragments.SearchFragment;
import com.idedalus58.menubibliotheque.R;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

//================================================================================================//

    //Pour le Design
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

//================================================================================================//

    //Pour les Fragments
    private Fragment fragmentNews;
    private Fragment fragmentProfile;
    private Fragment fragmentSetting;
    private Fragment fragmentApropos;
    private Fragment fragmentHome;
    private Fragment fragmentHistorique;
    private Fragment fragmentSearch;

//================================================================================================//

    //Pour les Fragments
    private static final int FRAGMENT_NEWS = 0;
    private static final int FRAGMENT_PROFILE = 1;
    private static final int FRAGMENT_SETTING = 2;
    private static final int FRAGMENT_APROPOS = 3;
    private static final int FRAGMENT_HOME = 4;
    private static final int FRAGMENT_HISTORIQUE = 5;
    private static final int FRAGMENT_SEARCH = 6;

//================================================================================================//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // configurer tous les affichages
        this.configureToolBar();
        this.configureDrawerLayout();
        this.configureNavigationView();

        // Afficher le premier fragment
        this.showFirstFragment();
    }
//================================================================================================//
    @Override
    public void onBackPressed() {
        // cliquez pour fermer le menu

        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//================================================================================================//
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        // Afficher le fragment après que l'utilisateur est cliqué sur un élément du menu

        switch (id){
            case R.id.activity_main_drawer_news :
                this.showFragment(FRAGMENT_NEWS);
                break;
            case R.id.activity_main_drawer_profile:
                this.showFragment(FRAGMENT_PROFILE);
                break;
            case R.id.activity_main_drawer_setting:
                this.showFragment(FRAGMENT_SETTING);
                break;
            case R.id.activity_main_drawer_apropos:
                this.showFragment(FRAGMENT_APROPOS);
                break;
            case R.id.activity_main_drawer_home:
                this.showFragment(FRAGMENT_HOME);
                break;
            case R.id.activity_main_drawer_historique:
                this.showFragment(FRAGMENT_HISTORIQUE);
                break;
            case R.id.activity_main_drawer_serch:
                this.showFragment(FRAGMENT_SEARCH);
                break;
            default:
                break;
        }

        this.drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

//================================ Configurations ================================================//

    // Configuration la barre d'outils

    private void configureToolBar(){
        this.toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);
    }

    // Configuration  de la disposition des tiroirs (Drawer)

    private void configureDrawerLayout(){
        this.drawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    // Configuration du  NavigationView

    private void configureNavigationView(){
        this.navigationView = (NavigationView) findViewById(R.id.activity_main_nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //================================== Fragments ===============================================//

    // Affichage  du  premier fragment lorsque l'activité est créée

    private void showFirstFragment(){
        Fragment visibleFragment = getSupportFragmentManager().findFragmentById(R.id.activity_main_frame_layout);
        if (visibleFragment == null){

            // Affichage du fragment d'actualités

            this.showFragment(FRAGMENT_NEWS);

            // Marquer comme sélectionné l'élément de menu correspondant à NewsFragment

            this.navigationView.getMenu().getItem(0).setChecked(true);
        }
    }
//================================================================================================//

    // Affichage du fragment selon les identifiants

    private void showFragment(int fragmentIdentifier){
        switch (fragmentIdentifier){
            case FRAGMENT_NEWS :
                this.showNewsFragment();
                break;
            case FRAGMENT_PROFILE:
                this.showProfileFragment();
                break;
            case FRAGMENT_SETTING:
                this.showSettingFragment();
                break;
            case FRAGMENT_APROPOS:
                this.showAproposFragment();
                break;
            case FRAGMENT_HOME:
                this.showHomeFragment();
                break;
            case FRAGMENT_HISTORIQUE:
                this.showHistoriqueFragment();
                break;
            case FRAGMENT_SEARCH:
                this.showSearchFragment();
                break;
            default:
                break;
        }
    }
//================================================================================================//


    // Créations de  chaque page de fragment et affichage de cette derniere

    private void showNewsFragment(){
        if (this.fragmentNews == null) this.fragmentNews = NewsFragment.newInstance();
        this.startTransactionFragment(this.fragmentNews);
    }
    private void showSettingFragment(){
        if (this.fragmentSetting == null) this.fragmentSetting = SettingFragment.newInstance();
        this.startTransactionFragment(this.fragmentSetting);
    }
    private void showProfileFragment(){
        if (this.fragmentProfile == null) this.fragmentProfile = ProfileFragment.newInstance();
        this.startTransactionFragment(this.fragmentProfile);
    }
    private void showAproposFragment(){
        if (this.fragmentApropos == null) this.fragmentApropos = AproposFragment.newInstance();
        this.startTransactionFragment(this.fragmentApropos);
    }
    private void showHomeFragment(){
        if (this.fragmentHome == null) this.fragmentHome = HomeFragment.newInstance();
        this.startTransactionFragment(this.fragmentHome);
    }
    private void showHistoriqueFragment(){
        if (this.fragmentHistorique == null) this.fragmentHistorique = HistoriqueFragment.newInstance();
        this.startTransactionFragment(this.fragmentHistorique);
    }
    private void showSearchFragment(){
        if (this.fragmentSearch == null) this.fragmentSearch = SearchFragment.newInstance();
        this.startTransactionFragment(this.fragmentSearch);
    }

//================================================================================================//

    // Méthode générique qui remplacera et affichera un fragment à l'intérieur de la structure MainActivity Frame

    private void startTransactionFragment(Fragment fragment){
        if (!fragment.isVisible()){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity_main_frame_layout, fragment).commit();
        }
    }
//================================================================================================//
}