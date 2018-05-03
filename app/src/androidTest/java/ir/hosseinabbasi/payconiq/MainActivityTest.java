package ir.hosseinabbasi.payconiq;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ir.hosseinabbasi.payconiq.ui.main.MainActivity;



/**
 * Created by Dr.jacky on 2018/05/03.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void MainActivityCreatedTest(){
        Assert.assertEquals(
                true,
                mActivityRule.getActivity() != null);
    }
}
