package bloggn.app.libs;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MRelativeLayout extends RelativeLayout {
	Context mContext;

	public MRelativeLayout(Context context) {
		super(context);
		this.mContext = context;
	}
	
	public void setView(int resId, String text){
		this.addView(setImageView(resId));
		this.addView(setTextView(text));
	}
	
	private ImageView setImageView(int resId){
		ImageView iv = new ImageView(mContext);
		iv.setImageResource(resId);
		iv.setLayoutParams(new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.MATCH_PARENT, 
				RelativeLayout.LayoutParams.WRAP_CONTENT));
		return iv;
	}
	
	private TextView setTextView(String text){
		TextView tv = new TextView(mContext);
		tv.setText(text);
		
		RelativeLayout.LayoutParams rl = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.MATCH_PARENT, 
				RelativeLayout.LayoutParams.WRAP_CONTENT);
		
		rl.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		tv.setLayoutParams(rl);
		
		//tv.setTextColor(Color.WHITE);
		
		return tv;
	}
}
