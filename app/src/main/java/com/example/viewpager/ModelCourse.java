package com.example.viewpager;

public enum ModelCourse {


    RED(R.string.red, R.layout.view_red),
    BlUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);

    private int mTitleID;
    private int mLayoutID;

    ModelCourse(int titleID, int layoutID) {
        mTitleID = titleID;
        mLayoutID = layoutID;
    }

    public int getTitleID() {
        return mTitleID;
    }

    public int getLayoutID() {
        return mLayoutID;
    }
}
