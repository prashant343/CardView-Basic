

package com.example.android.cardview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

/**
 * Fragment that demonstrates how to use CardView.
 */
public class CardViewFragment extends Fragment {

    private static final String TAG = CardViewFragment.class.getSimpleName();


    CardView mCardView;




    public static CardViewFragment newInstance() {
        CardViewFragment fragment = new CardViewFragment();
        //fragment.setRetainInstance(true);
        return fragment;
    }

    public CardViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card_view, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mCardView = (CardView) view.findViewById(R.id.cardview);

    }
}

