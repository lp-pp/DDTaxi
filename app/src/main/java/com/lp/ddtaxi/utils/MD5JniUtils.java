package com.lp.ddtaxi.utils;

/**
 * @className: MD5JniUtils
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/9 上午10：20
 * @version  : 1.0
 * @desc     :
 */

public class MD5JniUtils {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    public static native String getMd5(String origin);

}
