package com.MakSSe.foodRecipe;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.foodRecipe.*;

public class StartActivity extends ActionBarActivity {

    private static final String DebugTag = "ScalableLayout_TestAndroid";
    private TextView tv;
    private ScalableLayout sl;

    private static void log(String pLog) {
        Log.e(DebugTag, "MainActivity] " + pLog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sl = new ScalableLayout(this, 400, 200);
       // sl.setBackgroundColor(Color.LTGRAY);
       // ScalableLayout.setLoggable(DebugTag);

        tv = new TextView(this);

        sl.addView(tv,20f,40f,100f,30f);

        sl.setScale_TextSize(tv,20f);

        tv.setText("test");
        tv.setBackgroundColor(Color.YELLOW);

        setContentView(R.layout.activity_start);

        ImageView iv = new ImageView(this);

        sl.addView(iv, 200f, 30f, 50f, 50f);

        iv.setImageResource(R.mipmap.ic_launcher);

//        ImageView iv_surrounded = new ImageView(this);
//        iv_surrounded.setBackgroundColor(Color.BLUE);
//        sl.addView(iv_surrounded, 80f, 80f, 240f, 90f);
//
//        ImageView iv2 = new ImageView(this);
//        iv2.setImageResource(R.mipmap.ic_launcher);
//        sl.addView(iv2, 220f, 160f, 50f, 50f);
//
//        TextView tv2 = new TextView(this);
//        tv2.setText("test2");
//        tv2.setBackgroundColor(Color.YELLOW);
//        sl.addView(tv2, 40f, 170f, 100f, 30f);
//        sl.setScale_TextSize(tv2, 20f);
//
//        TextView tv3 = new TextView(this);
//        tv3.setText("test3");
//        tv3.setBackgroundColor(Color.YELLOW);
//        sl.addView(tv3, 0f, 210f, 60f, 30f);
//        sl.setScale_TextSize(tv3, 20f);
//
//        TextView tv4 = new TextView(this);
//        tv4.setText("test4");
//        tv4.setBackgroundColor(Color.YELLOW);
//        sl.addView(tv4, 150f, 250f, 100f, 30f);
//        sl.setScale_TextSize(tv4, 20f);
//
//        TextView tv5 = new TextView(this);
//        tv5.setText("test5");
//        tv5.setBackgroundColor(Color.YELLOW);
//        sl.addView(tv5, 350f, 300f, 100f, 30f);
//        sl.setScale_TextSize(tv5, 20f);

//        TextView tv6 = new TextView(this);
//        tv6.setText("test6");
//        tv6.setBackgroundColor(Color.YELLOW);
//        sl.addView(tv6, 50f, 300f, 120f, 40f);
//        sl.setScale_TextSize(tv6, 20f);
//
//        mTV_Text = new TextView(this);
////		mTV_Text.setText("test\n2233\n\n\n\nqwelkqjwkrjqw\n\naa");
//        mTV_Text.setText("test");
//        mTV_Text.setBackgroundColor(Color.RED);
////		mSL.addView(mTV_Text, 40f, 170f, 100f, 100f);
//        sl.addView(mTV_Text, 200f, 200f, 1f, 100f);
//        sl.setScale_TextSize(mTV_Text, 30f);
//        sl.setTextView_WrapContent(mTV_Text, ScalableLayout.TextView_WrapContent_Direction.Center_Horizontal, false);
//
//        {
//            Button btn = new Button(this);
//            btn.setText("Refresh");
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View pV) {
//                    sl.requestLayout();
//                    sl.forceLayout();
//                }
//            });
//            sl.addView(btn, 205, 100, 200, 100);
//            sl.setScale_TextSize(btn, 30);
//        }

        setContentView(R.layout.activity_start);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
