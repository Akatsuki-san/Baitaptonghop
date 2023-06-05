package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface greatVibesRegularTypeFace;
    private static Typeface montserratAlternatesTypeFace;
    private static Typeface openSansTypeFace;
    private static Typeface raleWayTypeFace;
    private static Typeface robotoTypeFace;

    public static Typeface getGreatVibesRegularTypeFace(Context context) {
        if(greatVibesRegularTypeFace == null){
            greatVibesRegularTypeFace = Typeface.createFromAsset(context.getAssets(), "fonts/GreatVibes-Regular.otf");
        }
        return greatVibesRegularTypeFace;
    }

    public static Typeface getMontserratAlternatesTypeFace(Context context) {
        if(montserratAlternatesTypeFace == null){
            montserratAlternatesTypeFace = Typeface.createFromAsset(context.getAssets(), "fonts/MontserratAlternates-Black.otf");
        }
        return montserratAlternatesTypeFace;
    }

    public static Typeface getOpenSansTypeFace(Context context) {
        if(openSansTypeFace == null){
            openSansTypeFace = Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Bold.ttf");
        }
        return openSansTypeFace;
    }

    public static Typeface getRaleWayTypeFace(Context context) {
        if(raleWayTypeFace == null){
            raleWayTypeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Raleway-Black.ttf");
        }
        return raleWayTypeFace;
    }

    public static Typeface getRobotoTypeFace(Context context) {
        if(robotoTypeFace == null){
            robotoTypeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Black.ttf");
        }
        return robotoTypeFace;
    }
}
