package com.study.enumeration;

/**
 * @description:
 * @author:
 * @date:2019/8/8
 */
public enum LogOperateTypeEnum {
    ADD("添加", 1), DEL("删除", 2), UPDATE("修改", 3), LOGIN("登陆", 4);
    private String operateDesc;
    private int operateCode;

    LogOperateTypeEnum() {
    }

    public static String getMessage(int operateCode) {
        for (LogOperateTypeEnum logOperateTypeEnum : LogOperateTypeEnum.values()) {
            if (logOperateTypeEnum.getOperateCode() == operateCode) {
                return logOperateTypeEnum.getOperateDesc();
            }


        }
        return null;
    }


    LogOperateTypeEnum(String operateDesc, int operateCode) {
        this.operateDesc = operateDesc;
        this.operateCode = operateCode;
    }

    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }

    public int getOperateCode() {
        return operateCode;
    }

    public void setOperateCode(int operateCode) {
        this.operateCode = operateCode;
    }
}
