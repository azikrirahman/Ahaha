package com.dor.ahaha;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class HiraganaAdapter extends BaseAdapter {
private Context mContext;
//keep all Images in array
public Integer[]mThumbIds = {
R.drawable.a, R.drawable.i,
R.drawable.u, R.drawable.e,
R.drawable.o, R.drawable.ka,
R.drawable.ki, R.drawable.ku,
R.drawable.ke, R.drawable.ko,
R.drawable.sa, R.drawable.shi,
R.drawable.su, R.drawable.se,
R.drawable.so, R.drawable.ta,
R.drawable.chi, R.drawable.tsu,
R.drawable.te, R.drawable.to,
R.drawable.na, R.drawable.ni,
R.drawable.nu, R.drawable.ne,
R.drawable.no, R.drawable.ha,
R.drawable.hi, R.drawable.fu,
R.drawable.he, R.drawable.ho,
R.drawable.ma, R.drawable.mi,
R.drawable.mu, R.drawable.me,
R.drawable.mo, R.drawable.ya,
R.drawable.yu, R.drawable.yo,
R.drawable.ra, R.drawable.ri,
R.drawable.ru, R.drawable.re,
R.drawable.ro, R.drawable.wa,
R.drawable.wo, R.drawable.n

};

//Constructor
public HiraganaAdapter(Context c){
mContext = c;
}
@Override
public int getCount(){
return mThumbIds.length;
}

@Override
public Object getItem(int position){
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
imageView.setLayoutParams(new GridView.LayoutParams(100, 100));
return imageView;
}

}