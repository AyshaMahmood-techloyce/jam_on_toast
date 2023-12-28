package com.example.Toaster;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void simpleToast(Context context){
        Toast.makeText(context, "A toast to the first sdk", Toast.LENGTH_SHORT).show();
    }
}
