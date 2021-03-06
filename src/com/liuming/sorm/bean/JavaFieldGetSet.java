package com.liuming.sorm.bean;

/**
 * 封装了java属性和get,set方法的源码
 *
 * @Author: 刘艳明
 * @Date: 19-4-29 上午11:10
 */
public class JavaFieldGetSet {
    /**
     * 属性的源码信息,如private int userId;
     */
    private String fieldInfo;
    /**
     * get方法的源码信息
     */
    private String getInfo;
    /**
     * set方法的源码信息
     */
    private String setInfo;

    public JavaFieldGetSet() {
    }

    public JavaFieldGetSet(String fieldInfo, String getInfo, String setInfo) {
        this.fieldInfo = fieldInfo;
        this.getInfo = getInfo;
        this.setInfo = setInfo;
    }

    public String getFieldInfo() {
        return fieldInfo;
    }

    public void setFieldInfo(String fieldInfo) {
        this.fieldInfo = fieldInfo;
    }

    public String getGetInfo() {
        return getInfo;
    }

    public void setGetInfo(String getInfo) {
        this.getInfo = getInfo;
    }

    public String getSetInfo() {
        return setInfo;
    }

    public void setSetInfo(String setInfo) {
        this.setInfo = setInfo;
    }

    @Override
    public String toString() {
        return fieldInfo + getInfo + setInfo;
    }
}
