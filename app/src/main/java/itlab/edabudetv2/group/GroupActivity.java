package itlab.edabudetv2.group;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import java.util.ArrayList;

import it.neokree.materialtabs.MaterialTabHost;
import itlab.edabudetv2.R;
import itlab.edabudetv2.components.MyFragmentPagerAdapter;
import itlab.edabudetv2.components.TabHostModel;

public class GroupActivity extends FragmentActivity {
    private ViewPager mPager;
    private MaterialTabHost mMaterialTabHost;
    private TabHostModel mTabHostModel;
    private FragmentPagerAdapter mFragmentPagerAdapter;
    private ArrayList<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        mMaterialTabHost = (MaterialTabHost) findViewById(R.id.materialTabHost);
        mPager = (ViewPager) findViewById(R.id.pager);
        mFragments = new ArrayList<>();

        mFragments.add(new PageOrdersFragment());
        mFragments.add(new PageOrdersFragment());
        mFragments.add(new PageOrdersFragment());
        mFragments.add(new PageOrdersFragment());


        mFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), mFragments);
        mPager.setAdapter(mFragmentPagerAdapter);
        mTabHostModel = new TabHostModel(mMaterialTabHost, mPager, getResources());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_group, menu);
        return true;
    }

}
