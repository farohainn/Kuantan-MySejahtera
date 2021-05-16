package com.example.kuantansejahtera_a170567;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.kuantansejahtera_a170567.adapter.DeviceFragmentPagerAdapter;
import com.example.kuantansejahtera_a170567.adapter.SlidingTabLayout;
import com.example.kuantansejahtera_a170567.toolbar.EmergencyActivity;
import com.example.kuantansejahtera_a170567.toolbar.ProfileActivity;
import com.example.kuantansejahtera_a170567.toolbar.SettingActivity;


public class Dashboard extends AppCompatActivity {
    Toolbar toolbar;
   private SlidingTabLayout slidingtablayout;
   private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        viewpager = findViewById(R.id.view_pager_main);
        viewpager.setAdapter(new DeviceFragmentPagerAdapter(getSupportFragmentManager(),this));

        slidingtablayout = findViewById(R.id.tabs_main);
        slidingtablayout.setDistributeEvenly(true);
        slidingtablayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        slidingtablayout.setSelectedIndicatorColors(getResources().getColor(R.color.colorAccent));
        slidingtablayout.setCustomTabView(R.layout.tab_view,R.id.tv_tab);
        slidingtablayout.setViewPager(viewpager);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch(item.getItemId()) {
            case R.id.menu_emergency:
                Toast.makeText(Dashboard.this, "Emergency Call", Toast.LENGTH_SHORT).show();
                intent = new Intent(Dashboard.this, EmergencyActivity.class);
                startActivity(intent);
                break;

            case R.id.menu_profile:
                Toast.makeText(Dashboard.this, "Profile", Toast.LENGTH_SHORT).show();
                intent = new Intent(Dashboard.this, ProfileActivity.class);
                startActivity(intent);
                break;

            case R.id.menu_setting:

                Toast.makeText(Dashboard.this, "Setting", Toast.LENGTH_SHORT).show();
                intent = new Intent(Dashboard.this, SettingActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
