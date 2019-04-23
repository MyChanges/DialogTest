package zyyl.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import zyyl.library.Utils;

/**
 * @author change
 * @date 2019/4/19
 * @Description: [Main Activity]
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText(Utils.getTestUtils());
        setContentView(textView);
    }
}
