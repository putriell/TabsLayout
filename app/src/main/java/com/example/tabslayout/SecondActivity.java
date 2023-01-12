package com.example.tabslayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class SecondActivity extends AppCompatActivity {
    TabLayoutMediator mediator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 pager2 = findViewById(R.id.viewPager);

        SampleAdaptor adaptor = new SampleAdaptor(getSupportFragmentManager(), getLifecycle());
        pager2.setAdapter(adaptor);

        mediator = new TabLayoutMediator(tabLayout, pager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0){
                    tab.setText("Masuk");
                }else{
                    tab.setText("Daftar");
                }
            }
        });
        mediator.attach();
    }
 
    public void showActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
