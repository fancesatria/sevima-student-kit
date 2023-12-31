package com.example.studentkit.Component;

import android.content.Context;
import android.view.View;

import com.example.studentkit.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public abstract class SuccessDialog {
   static Snackbar snackbar;

    public static void message(Context context,String message, View view){
        snackbar = Snackbar.make(view,message, BaseTransientBottomBar.LENGTH_SHORT);

        snackbar.setTextColor(context.getColor(R.color.white));
        snackbar.setBackgroundTint(context.getColor(R.color.success));

        snackbar.show();
    }


}