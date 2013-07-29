package bloggn.app;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MActivity extends Activity {
	Button menubtn;
	SlidingMenu menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
		init();
	}


	private void init() {		
		menu = (SlidingMenu)this.findViewById(R.id.main_sidebar);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
		menu.setTouchModeBehind(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setMode(SlidingMenu.LEFT);
		
		menubtn = (Button)this.findViewById(R.id.main_menu_btn);
		menubtn.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				menu.showMenu();				
			}});
	}

}
