package kr.hs.emirim.s2019w39.gridviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] imgRes = {R.drawable.poster01, R.drawable.poster02,R.drawable.poster03,R.drawable.poster04,
            R.drawable.poster05, R.drawable.poster06,R.drawable.poster07,R.drawable.poster08,
            R.drawable.poster09, R.drawable.poster10,R.drawable.poster11,R.drawable.poster12,
            R.drawable.poster13, R.drawable.poster14,R.drawable.poster15,R.drawable.poster16};

    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(250, 350));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(imgRes[position]);
        return imgv;
    }
}
