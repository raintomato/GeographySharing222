package com.example.lenovo.geographysharing.Details;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;

import com.example.lenovo.geographysharing.BaseClass.BaseActivity;
import com.example.lenovo.geographysharing.R;

public class AlbumDetailRequestActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_album_detail_request;
    }

    @Override
    protected void initView() {
        //轮播图以及小圆点
//        LoopViewPager viewPager = bindViewId(R.id.details_viewpager);
//        CircleIndicator circleIndicator = bindViewId(R.id.details_indicator);
//        viewPager.setAdapter(new DetailsPicAdapter(this));
//        viewPager.setLooperPic(true);
//        circleIndicator.setViewPager(viewPager);
//        Equipment equipment = new Equipment();
//        String titleName = equipment.getEquipName();

        setSupportActionBar();//表示当前页面支持ActionBar
        setSupportArrowActionBar(true);
        setTitle("详情页面");
    }

    //处理左上角返回箭头
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void initData() {

    }

    public static void launchAlbumDetailRequestActivity(Activity activity) {
        Intent intent = new Intent(activity, AlbumDetailRequestActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        activity.startActivity(intent);
    }


}
