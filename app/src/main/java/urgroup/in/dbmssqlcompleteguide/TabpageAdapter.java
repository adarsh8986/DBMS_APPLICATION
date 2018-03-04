package urgroup.in.dbmssqlcompleteguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ujjwal on 2/7/2018.
 */

public class TabpageAdapter extends FragmentPagerAdapter {
    String[] tabarray=new String[]{"Concept","Practical","Quiz"};
    int[] tabimage = { R.drawable.jv,
            R.drawable.jv,
            R.drawable.jv
          };

    public TabpageAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];//ass title
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                left left1 = new left();
                return left1;

            case 1:
                center center1 = new center();
                return center1;

            case 2:
                right right1 = new right();
                return right1;
        }
        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
}
