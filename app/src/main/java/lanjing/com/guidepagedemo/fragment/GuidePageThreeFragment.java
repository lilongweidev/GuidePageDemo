package lanjing.com.guidepagedemo.fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import lanjing.com.guidepagedemo.R;
import lanjing.com.guidepagedemo.activity.MainActivity;

public class GuidePageThreeFragment extends Fragment {

    public static GuidePageThreeFragment newInstance() {

        return new GuidePageThreeFragment();
    }

    private void initView(View view) {

    }

    private void initListeners() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_guide_page_three,
                container, false);
        Button openMain = (Button)view.findViewById(R.id.into_app_btn);
        openMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        initView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initListeners();
    }

}
