package lib.view.state.changes;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lib.base.sjy.adpater.MainAdapter;


public class VSCMainAct extends AppCompatActivity {
    //-----------------------------控件--------------------------------
    /**
     * xml方式 引用
     */
    @BindView(R2.id.tv_01)
    TextView tv_01;

    /**
     * code方式 引用
     */
    @BindView(R2.id.tv_02)
    TextView tv_02;

    /**
     * xml调用动画list
     */
    @BindView(R2.id.img_01)
    ImageView img_01;

    //-------------------------------------------------------------
    private List<String> data = new ArrayList<>();
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_demo1);
        ButterKnife.bind(this);
        initStateListAnimator();
    }

    /**
     * code方式 引用
     */
    private void initStateListAnimator() {
        //加载动画(属性动画AnimatorInflater加载动画xml)
        StateListAnimator stateListAnimator = AnimatorInflater.loadStateListAnimator(this, R.animator.view_state_change_02);
        //设置动画
        tv_02.setStateListAnimator(stateListAnimator);
    }
}