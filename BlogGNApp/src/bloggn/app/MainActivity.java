package bloggn.app;

import java.util.ArrayList;
import java.util.List;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import bloggn.app.libs.MRelativeLayout;
import bloggn.app.libs.PicPagerAdapter;
import bloggn.app.util.Constants;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends MActivity implements OnClickListener {
	ViewPager viewPager;
	PicPagerAdapter ppa;
	List<View> mListViews;
	//Button menubtn;
	//SlidingMenu menu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sliding_menu);
		
		init();
	}

	private void init(){
		//menubtn = (Button)this.findViewById(R.id.main_menu_btn);
		//menubtn.setOnClickListener(this);
		viewPager = (ViewPager)this.findViewById(R.id.main_viewpager);
		
		/*menu = (SlidingMenu)this.findViewById(R.id.main_sidebar);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
		menu.setMode(SlidingMenu.LEFT);*/
		
		mListViews = new ArrayList<View>();
		for(int i=0; i<5; i++){
			MRelativeLayout mrl = new MRelativeLayout(this);
			mrl.setView(Constants.img_list[i], Constants.text_list[i]);
			//mrl.setOrientation(LinearLayout.VERTICAL);
			mListViews.add(mrl);
		}
		
		ppa = new PicPagerAdapter(mListViews);
		viewPager.setAdapter(ppa);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		/*if(arg0.getId() == menubtn.getId()){
			menu.showMenu();
		}*/
	}

}
