package urgroup.in.dbmssqlcompleteguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.ShareCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public MainActivity() {

    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        ViewPager Pager = (ViewPager) findViewById(R.id.viewpage);

        TabpageAdapter tabpageAdapter = new TabpageAdapter(getSupportFragmentManager());
        Pager.setAdapter(tabpageAdapter);
        tabLayout.setupWithViewPager(Pager);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        Fragment fragment;

        if (id == R.id.nav_rate) {
            Uri marketUri = Uri.parse("https://play.google.com/store/apps");
            Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
            startActivity(marketIntent);

        } else if (id == R.id.nav_concept) {
            /*fragment = new right();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rig,fragment);
            ft.commit();*/
            Intent marketIntent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(marketIntent);


        }  else if (id == R.id.teacher) {
            /*fragment = new right();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rig,fragment);
            ft.commit();*/
            Intent marketIntent = new Intent(MainActivity.this, teacher.class);
            startActivity(marketIntent);


        } else if (id == R.id.nav_share) {
            ShareCompat.IntentBuilder.from(MainActivity.this)
                    .setType("text/plain")
                    .setChooserTitle("Chooser title")
                    .setText("http://play.google.com/store/apps/details?id=" + MainActivity.this.getPackageName())
                    .startChooser();

        } else if (id == R.id.privacy_policy) {
            Intent marketIntent = new Intent(MainActivity.this,privacy_policy.class);
            startActivity(marketIntent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
