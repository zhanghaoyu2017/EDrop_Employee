package net.edrop.edrop_employee.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.edrop.edrop_employee.R;

/**
 * Created by Android Studio.
 * User: zhanghaoyu
 * Date: 2019/12/12
 * Time: 16:28
 */
public class MsgPageFragment extends Fragment {
    private View view;
    private static final String SECTION_STRING = "fragment_string";
    public static MsgPageFragment newInstance(String sectionNumber) {
        MsgPageFragment fragment = new MsgPageFragment();
        Bundle args = new Bundle();
        args.putString(SECTION_STRING, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_msg_page, container, false);
//        initView();
//        initData();
//        setListener();
        return view;
    }
}
