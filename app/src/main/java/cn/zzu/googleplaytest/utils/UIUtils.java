package cn.zzu.googleplaytest.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

import cn.zzu.googleplaytest.base.MyApplication;

/**
 * Created by yangg on 2017/7/8.
 */

public class UIUtils {


    /**
     * 得到上下文
     */
    public static Context getContext(){
        return MyApplication.getmContext();
    }


    /**
     * 得到Restute对象
     */
    public static Resources getResources(){
        return getContext().getResources();
    }
    /**
     * 得到string.xml中的字符串信息
     */
    public static String getString(int resId){
        return  getResources().getString(resId);
    }
    /**
     * 得到String.xml中的字符串数组信息
     */
    public static String[] getStrings (int resId){
        return getResources().getStringArray(resId);
    }
    /**
     * 得到Color.xml中的颜色信息
     */
    public static int getColor(int resId){
        return getResources().getColor(resId);
    }
    /**
     * 得到应用程序报名
     */
    public static String getPackageName(){
        return getContext().getPackageName();
    }

    public static int dip2Px(int dip) {
        // px/dp = density
        //取得当前手机px和dp的倍数关系
        float density = getResources().getDisplayMetrics().density;
        int px = (int) (dip * density + .5f);
        return px;
    }

    public static int px2Dip(int px) {
        // px/dp = density
        //取得当前手机px和dp的倍数关系
        float density = getResources().getDisplayMetrics().density;
        int dip = (int) (px / density + .5f);
        return dip;
    }

}
