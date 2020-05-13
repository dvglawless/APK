package saxobyte.web.utsakb;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;



public class activity_home extends AppCompatActivity {
    Toolbar mToolbar;
    ViewPager mViewPager;
    TabLayout mTabLayout;
    TabPageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setSubtitle("Created by : dudu");
        mViewPager = findViewById(R.id.main_viewpager);
        mAdapter = new TabPageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mTabLayout = findViewById(R.id.main_tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public void OpenGmail (View view){
        String url = "mailto:contact.adudu@gmail.com";
        Intent bukaGmail = new Intent(Intent.ACTION_VIEW);
        bukaGmail.setData(Uri.parse(url));
        startActivity(bukaGmail);
    }

    public void OpenWhatsapp (View view){
        String url = "https://api.whatsapp.com/send?phone=6287873760105";
        Intent bukaWhatsapp = new Intent(Intent.ACTION_VIEW);
        bukaWhatsapp.setData(Uri.parse(url));
        startActivity(bukaWhatsapp);
    }

    public void OpenInstagram (View view){
        String url = "https://www.instagram.com/mhdazd/";
        Intent bukaInstagram = new Intent(Intent.ACTION_VIEW);
        bukaInstagram.setData(Uri.parse(url));
        startActivity(bukaInstagram);
    }

    public void OpenFacebook (View view){
        String url = "https://m.twitter.com/dvglawless";
        Intent bukaGmail = new Intent(Intent.ACTION_VIEW);
        bukaGmail.setData(Uri.parse(url));
        startActivity(bukaGmail);
    }
}
