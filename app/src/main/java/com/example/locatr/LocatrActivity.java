package com.example.locatr;

import androidx.fragment.app.Fragment;


public class LocatrActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return LocatrFragment.newInstance();
    }
}
