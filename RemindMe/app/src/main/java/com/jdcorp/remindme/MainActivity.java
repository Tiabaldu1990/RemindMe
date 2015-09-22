package com.jdcorp.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Project RemindMe
 * Created by Евгений on 22.09.2015.
 */
public class MainActivity extends Activity {

    /* Я хз зачем это нужно, но, объявляем переменную */
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Функция вызова тулбара */
        initToolbar();
    }

    /* Описание функции вызова тулбара */
    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);
    }


}
