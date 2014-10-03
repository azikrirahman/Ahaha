package com.dor.ahaha;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ahira extends BaseAdapter {
private Context mContext;
//keep all images in array
public Integer[]mThumbIds = {
R.drawable.ahira, R.drawable.ihira,
R.drawable.uhira, R.drawable.ehira,
R.drawable.ohira, R.drawable.kahira,
R.drawable.kihira, R.drawable.kuhira,
R.drawable.kehira, R.drawable.kohira,
R.drawable.sahira, R.drawable.shihira,
R.drawable.suhira, R.drawable.sehira,
R.drawable.sohira, R.drawable.tahira,
R.drawable.chihira, R.drawable.tsuhira,
R.drawable.tehira, R.drawable.tohira,
R.drawable.nahira, R.drawable.nihira,
R.drawable.nuhira, R.drawable.nehira,
R.drawable.nohira, R.drawable.hahira,
R.drawable.hihira, R.drawable.fuhira,
R.drawable.hehira, R.drawable.hohira,
R.drawable.mahira, R.drawable.mihira,
R.drawable.muhira, R.drawable.mehira,
R.drawable.mohira, R.drawable.yahira,
R.drawable.yuhira, R.drawable.yohira,
R.drawable.rahira, R.drawable.rihira,
R.drawable.ruhira, R.drawable.rehira,
R.drawable.rohira, R.drawable.wahira,
R.drawable.ohira2, R.drawable.nhira

};
//Constructor
public ahira(Context c) {
mContext = c;
}

@Override
public int getCount(){
return mThumbIds.length;

}

@Override
public Object getItem(int position) {
return mThumbIds[position];
}

@Override
public long getItemId(int position) {
return 0;
}

@Override
public View getView(int position, View convertView, ViewGroup parent)
{
ImageView imageView = new ImageView(mContext);
imageView.setImageResource(mThumbIds[position]);
imageView.setScaleType(ImageView.ScaleType.FIT_XY);
imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
return imageView;
}

}