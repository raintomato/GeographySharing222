package com.example.lenovo.geographysharing.Home;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.geographysharing.Details.AlbumDetailActivity;
import com.example.lenovo.geographysharing.R;

/**
 * Created by lenovo on 2017/12/30.
 */

public class HomePicAdapter extends PagerAdapter {

    private Context context;
    private int[] mDes = new int[]{
            R.string.a_name,
            R.string.b_name,
            R.string.c_name,
            R.string.d_name,
            R.string.e_name,
    };
    private int[] mImg = new int[]{
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
    };

    public HomePicAdapter(Activity activity) {
        context = activity;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_pic_item, null);
        view.setOnClickListener(new View.OnClickListener() {//轮播图的点击事件，跳转到相应的详情页面。
            @Override
            public void onClick(View view) {
                switch (position) {
                    default:
                        break;

                }

            }
        });
        TextView textView = (TextView) view.findViewById(R.id.tv_dec);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
        textView.setText(mDes[position]);
        imageView.setImageResource(mImg[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
