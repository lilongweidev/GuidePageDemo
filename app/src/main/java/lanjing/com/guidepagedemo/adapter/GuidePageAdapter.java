package lanjing.com.guidepagedemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;



public class GuidePageAdapter extends FragmentStatePagerAdapter {

    // 界面列表
    private List<Fragment> fragments;

    public GuidePageAdapter(FragmentManager manager, List<Fragment> fragments) {

        super(manager);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }
}
