

package com.example.android.cardview;

import android.app.Activity;
import android.os.Bundle;

/**
 * Launcher Activity for the CardView Basic app.
 */
public class CardViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);



        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, CardViewFragment.newInstance())
                    .commit();
        }
    }
}
