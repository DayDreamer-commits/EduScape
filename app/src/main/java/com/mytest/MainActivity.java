package com.mytest;

import androidx.fragment.app.FragmentActivity;

import android.app.ActionBar;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.mytest.Fragments.WelcomeFragment;

public class MainActivity extends FragmentActivity implements WelcomeFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();

        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = getActionBar();

        if (actionBar != null) {
            actionBar.hide();
        }

        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
            WelcomeFragment welcomeFragment = WelcomeFragment.newInstance();


            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            welcomeFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, welcomeFragment).commit();
        }

    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void signInFragment(View view) {

    }
}
