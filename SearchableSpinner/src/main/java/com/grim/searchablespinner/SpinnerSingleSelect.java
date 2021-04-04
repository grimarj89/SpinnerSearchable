package com.grim.searchablespinner;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;

public class SpinnerSingleSelect extends AppCompatSpinner {


    public SpinnerSingleSelect(@NonNull Context context) {
        super(context);
    }

    public SpinnerSingleSelect(@NonNull Context context, int mode) {
        super(context, mode);
    }

    public SpinnerSingleSelect(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


}
