package itlab.edabudetv2.group;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import itlab.edabudetv2.R;


public class PageOrdersFragment extends Fragment {


    public PageOrdersFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_group_page_container, container, false);
    }


}
