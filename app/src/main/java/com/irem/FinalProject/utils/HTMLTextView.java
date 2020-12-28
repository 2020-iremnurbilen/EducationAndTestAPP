package com.irem.FinalProject.utils;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class HTMLTextView extends AppCompatTextView {


    public HTMLTextView(@NonNull Context context) {
        super(context);
        init();
    }

    public HTMLTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HTMLTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            setText(Html.fromHtml(getText().toString(), Html.FROM_HTML_MODE_COMPACT));
        } else {
            setText(Html.fromHtml(getText().toString()));
        }
    }
}
