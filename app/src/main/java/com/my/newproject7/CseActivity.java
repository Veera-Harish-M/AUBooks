package com.my.newproject7;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class CseActivity extends Activity {
	
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview2;
	private HorizontalScrollView hscroll1;
	private TextView textview3;
	private HorizontalScrollView hscroll2;
	private TextView textview4;
	private HorizontalScrollView hscroll3;
	private TextView textview5;
	private HorizontalScrollView hscroll4;
	private TextView textview6;
	private HorizontalScrollView hscroll5;
	private TextView textview8;
	private HorizontalScrollView hscroll7;
	private TextView textview7;
	private HorizontalScrollView hscroll6;
	private LinearLayout linear2;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private LinearLayout linear3;
	private ImageView imageview8;
	private ImageView imageview11;
	private ImageView imageview12;
	private ImageView imageview7;
	private ImageView imageview9;
	private ImageView imageview10;
	private LinearLayout linear4;
	private ImageView imageview13;
	private ImageView imageview23;
	private ImageView imageview39;
	private ImageView imageview22;
	private ImageView imageview38;
	private ImageView imageview21;
	private ImageView imageview20;
	private LinearLayout linear5;
	private ImageView imageview24;
	private ImageView imageview27;
	private ImageView imageview41;
	private ImageView imageview29;
	private ImageView imageview40;
	private ImageView imageview28;
	private ImageView imageview26;
	private ImageView imageview42;
	private ImageView imageview25;
	private ImageView imageview43;
	private LinearLayout linear6;
	private ImageView imageview35;
	private ImageView imageview34;
	private ImageView imageview33;
	private ImageView imageview32;
	private ImageView imageview36;
	private ImageView imageview53;
	private ImageView imageview37;
	private ImageView imageview31;
	private LinearLayout linear7;
	private ImageView imageview44;
	private ImageView imageview54;
	private ImageView imageview46;
	private ImageView imageview47;
	private ImageView imageview48;
	private ImageView imageview49;
	private ImageView imageview56;
	private ImageView imageview45;
	private LinearLayout linear8;
	private ImageView imageview50;
	private ImageView imageview51;
	private ImageView imageview52;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.cse);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview2 = (TextView) findViewById(R.id.textview2);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		textview3 = (TextView) findViewById(R.id.textview3);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		textview4 = (TextView) findViewById(R.id.textview4);
		hscroll3 = (HorizontalScrollView) findViewById(R.id.hscroll3);
		textview5 = (TextView) findViewById(R.id.textview5);
		hscroll4 = (HorizontalScrollView) findViewById(R.id.hscroll4);
		textview6 = (TextView) findViewById(R.id.textview6);
		hscroll5 = (HorizontalScrollView) findViewById(R.id.hscroll5);
		textview8 = (TextView) findViewById(R.id.textview8);
		hscroll7 = (HorizontalScrollView) findViewById(R.id.hscroll7);
		textview7 = (TextView) findViewById(R.id.textview7);
		hscroll6 = (HorizontalScrollView) findViewById(R.id.hscroll6);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		imageview39 = (ImageView) findViewById(R.id.imageview39);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		imageview38 = (ImageView) findViewById(R.id.imageview38);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		imageview27 = (ImageView) findViewById(R.id.imageview27);
		imageview41 = (ImageView) findViewById(R.id.imageview41);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		imageview40 = (ImageView) findViewById(R.id.imageview40);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		imageview42 = (ImageView) findViewById(R.id.imageview42);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		imageview43 = (ImageView) findViewById(R.id.imageview43);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview35 = (ImageView) findViewById(R.id.imageview35);
		imageview34 = (ImageView) findViewById(R.id.imageview34);
		imageview33 = (ImageView) findViewById(R.id.imageview33);
		imageview32 = (ImageView) findViewById(R.id.imageview32);
		imageview36 = (ImageView) findViewById(R.id.imageview36);
		imageview53 = (ImageView) findViewById(R.id.imageview53);
		imageview37 = (ImageView) findViewById(R.id.imageview37);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview44 = (ImageView) findViewById(R.id.imageview44);
		imageview54 = (ImageView) findViewById(R.id.imageview54);
		imageview46 = (ImageView) findViewById(R.id.imageview46);
		imageview47 = (ImageView) findViewById(R.id.imageview47);
		imageview48 = (ImageView) findViewById(R.id.imageview48);
		imageview49 = (ImageView) findViewById(R.id.imageview49);
		imageview56 = (ImageView) findViewById(R.id.imageview56);
		imageview45 = (ImageView) findViewById(R.id.imageview45);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview50 = (ImageView) findViewById(R.id.imageview50);
		imageview51 = (ImageView) findViewById(R.id.imageview51);
		imageview52 = (ImageView) findViewById(R.id.imageview52);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview56.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview51.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
		
		imageview52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), DisplayActivity.class);
				i.putExtra("url", "url");
				startActivity(i);
			}
		});
	}
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("#FF000000"));
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
