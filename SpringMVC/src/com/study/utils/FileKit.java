package com.study.utils;

import jdk.nashorn.internal.runtime.FindProperty;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @description: 文件允许格式
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/22 16:09
 */
public class FileKit {

    private static List<String> allowFiles = Arrays.asList(".gif", ".png", ".jpg", ".jpeg", ".bmp");
    private final static String PREFIX_VIDEO = "video/";
    private final static String PREFIX_IMAGE = "image/";

    public static boolean checkFileType(String fileName) {
        Iterator<String> types = allowFiles.iterator();
        while (types.hasNext()) {
            String next = types.next();
            if (fileName.toLowerCase().endsWith(next)) {
                return true;
            }
        }
        return false;
    }

    public static String getFileName(String path) {
        int pos = path.lastIndexOf(File.separator);
        return path.substring(pos+1);
    }

    public static String getSuffix(String fileName){
        int pos = fileName.lastIndexOf(".");
        return fileName.substring(pos+1) ;
    }

}
