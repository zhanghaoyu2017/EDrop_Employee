package net.edrop.edrop_employee.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import net.edrop.edrop_employee.R;

/**
 * Created by Android Studio.
 * User: zhanghaoyu
 * Date: 2019/12/12
 * Time: 16:24
 */
public class HomePageFragment extends Fragment implements TabHost.TabContentFactory, GestureDetector.OnGestureListener {
    private static final String SECTION_STRING = "fragment_string";
    private View view;
    //定义手势检测器实例
    private GestureDetector detector;
    private AddFragmentActivity addFragmentActivity;
    public static HomePageFragment newInstance(String sectionNumber) {
        HomePageFragment fragment = new HomePageFragment();
        Bundle args = new Bundle();
        args.putString(SECTION_STRING, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home_page, container, false);
        //创建手势检测器
        detector = new GestureDetector(getActivity(),this);
        AddFragmentActivity.MyOnTouchListener myOnTouchListener = new AddFragmentActivity.MyOnTouchListener() {
            @Override
            public boolean onTouch(MotionEvent ev) {
                boolean result = detector.onTouchEvent(ev);
                return result;
            }
        };
        addFragmentActivity=(AddFragmentActivity)getActivity();
        ((AddFragmentActivity) getActivity()).registerMyOnTouchListener(myOnTouchListener);

//        initView();
//        initEvent();
//        setListener();
//        imageStart();
        return view;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public View createTabContent(String tag) {
        return null;
    }
}
