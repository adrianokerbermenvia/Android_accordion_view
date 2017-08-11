package com.riyagayasen.easyaccordiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.riyagayasen.easyaccordion.AccordionView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AccordionView accordionView = (AccordionView) findViewById(R.id.test_accordion);
        AccordionView accordionView2 = (AccordionView) findViewById(R.id.test_accordion2);
        TextView textView = (TextView) accordionView.findViewById(R.id.textView);
        textView.setText("This is a demo accordion with text added dynamically This is a demo accordion with text added dynamically This is a demo accordion with text added dynamically This is a demo accordion with text added dynamically This is a demo accordion with text added dynamically This is a demo accordion with text added dynamically This is a demo accordion with text added dynamically");

        //////////////////////////////
        // A1

        //accordionView.setBackground(getResources().getDrawable(R.drawable.background_magenta));
        //accordionView.setBackgroundColor(getResources().getColor(R.color.yellow));
        accordionView.setHeadingBackGround(R.drawable.background_yellow);
        //accordionView.setBodyBackGround(getResources().getDrawable(R.drawable.background_yellow));


        //////////////////////////////
        // A2

        accordionView2.setBackground(getResources().getDrawable(R.drawable.background_magenta));
        accordionView2.setHeadingBackGround(R.drawable.background_yellow);
        //accordionView2.setHeadingBackGroundColor(R.color.test);
    }
}
