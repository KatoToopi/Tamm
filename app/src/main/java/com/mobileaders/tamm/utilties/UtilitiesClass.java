package com.mobileaders.tamm.utilties;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Amr on 8/23/2016.
 */
public class UtilitiesClass {
    public static void setFont(TextView textView, Context context, int fontIndex) {
        Typeface font = null;

        switch (fontIndex) {
            case 0:
                font = Typeface.createFromAsset(context.getResources().getAssets(), "cairo_bold.ttf");
                break;

            case 1:
                font = Typeface.createFromAsset(context.getResources().getAssets(), "cairo_regular.ttf");
                break;
        }

        textView.setTypeface(font);
    }

    public static void setFont(EditText editText, Context context, int fontIndex) {
        Typeface font = null;

        switch (fontIndex) {
            case 0:
                font = Typeface.createFromAsset(context.getResources().getAssets(), "cairo_bold.ttf");
                break;

            case 1:
                font = Typeface.createFromAsset(context.getResources().getAssets(), "cairo_regular.ttf");
                break;
        }

        editText.setTypeface(font);
    }

    public static void setFont(Button button, Context context, int fontIndex) {
        Typeface font = null;

        switch (fontIndex) {
            case 0:
                font = Typeface.createFromAsset(context.getResources().getAssets(), "cairo_bold.ttf");
                break;

            case 1:
                font = Typeface.createFromAsset(context.getResources().getAssets(), "cairo_regular.ttf");
                break;
        }

        button.setTypeface(font);
    }

}
