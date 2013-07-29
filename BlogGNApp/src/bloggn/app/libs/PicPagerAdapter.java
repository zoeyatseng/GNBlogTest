package bloggn.app.libs;

import java.util.List;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

public class PicPagerAdapter extends PagerAdapter {

	private List<View> mListViews;
	
	public PicPagerAdapter(List<View> mListViews){
		this.mListViews = mListViews;
	}
	
	@Override
	public void finishUpdate(View container) {
		
	}

	@Override
	public int getCount() {
		return this.mListViews.size();
	}

	@Override
	public void destroyItem(View container, int position, Object object) {
		((ViewPager)container).removeView(this.mListViews.get(position));
	}

	@Override
	public Object instantiateItem(View container, int position) {
		((ViewPager) container).addView(mListViews.get(position),0);
        return mListViews.get(position);
	}

	@Override
	public int getItemPosition(Object object) {
		return POSITION_NONE;
	}

	@Override
	public void restoreState(Parcelable state, ClassLoader loader) {
		Log.d("k", "restoreState");
	}

	@Override
	public Parcelable saveState() {
		return null;
	}

	@Override
	public void startUpdate(View container) {
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == (arg1);
	}
}
