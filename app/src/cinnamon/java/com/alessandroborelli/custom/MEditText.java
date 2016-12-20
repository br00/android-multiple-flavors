package com.alessandroborelli.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by alessandroborelli on 20/12/2016.
 */

public class MEditText extends EditText {
    public MEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(context.getResources().getColor(android.R.color.background_dark));
        setTextColor(context.getResources().getColor(android.R.color.background_light));
    }
}
