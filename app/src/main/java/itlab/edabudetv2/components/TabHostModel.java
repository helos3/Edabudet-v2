package itlab.edabudetv2.components;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;
import itlab.edabudetv2.R;

public class TabHostModel implements MaterialTabListener {

    private MaterialTabHost mTabHost;
    private ViewPager mPager;
    private Resources mResources;

    public TabHostModel(MaterialTabHost tabhost, ViewPager pager, Resources resources) {
        mTabHost = tabhost;
        mPager = pager;
        mResources = resources;

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mTabHost.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        for (int i = 0; i < 4; i++) {
            mTabHost.addTab(
                    mTabHost.newTab()
                            .setIcon(getIcon(i))
                            .setTabListener(this)
            );
        }

    }

    private Drawable getIcon(int i) {
        return mResources.getDrawable(R.drawable.abc_btn_rating_star_off_mtrl_alpha);
    }

    @Override
    public void onTabReselected(MaterialTab materialTab) {

    }

    @Override
    public void onTabUnselected(MaterialTab materialTab) {

    }

    @Override
    public void onTabSelected(MaterialTab tab) {
        mPager.setCurrentItem(tab.getPosition());
    }


}
