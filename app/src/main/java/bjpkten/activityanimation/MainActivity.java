package bjpkten.activityanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //之前有一个项目里面的动画，我以为是window的动画，以为是通过style 里面设置就可以解决的，后来发现那个动画是自己定义的duration
        //忙了半天发现怎么设置window的动画都没有用，最后全局搜索setDuration 以后发现是自定义的，尴尬！

        //注意fromXdelta 一定要用100%， 不要用1，这些代替，因为1 可能它会以为是1dp这样的，可以做一个测试将%去掉就可以看到了



    }

    public void jump(View view) {
        startActivity(new Intent(this,SecondActivity.class));
//        overridePendingTransition(R.anim.anim1, R.anim.anim2);
    }

    public void xuankuJump(View view) {
        startActivity(new Intent(this,SecondActivity.class));
        overridePendingTransition(R.anim.animation_open_enter, R.anim.animation_open_exit);
    }


    public void xuanZhuanJump(View view) {
        startActivity(new Intent(this,SecondActivity.class));
        overridePendingTransition(R.anim.animation_rotate_enter, R.anim.animation_rotate_exit);
    }

    public void pingyiJump(View view) {
        startActivity(new Intent(this,SecondActivity.class));
        overridePendingTransition(R.anim.animation_pingyi_enter, R.anim.animation_pingyi_exit);
    }

    public void tuiyaJump(View view) {
        startActivity(new Intent(this,SecondActivity.class));
        overridePendingTransition(R.anim.animation_tuiya_enter, R.anim.animation_tuiya_exit);
    }
}
