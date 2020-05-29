package com.wanyongi.module_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wanyongi.library_base.router.RouterActivityPath;

@Route(path = RouterActivityPath.Message.PAGER_MESSAGE)
public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        ((TextView) findViewById(R.id.click)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(RouterActivityPath.Main.PAGER_MAIN).navigation();
            }
        });
    }
}
