package com.company;

/**
 * Created by joseb on 5/21/2017.
 */
public class Monitor {
    private String mdoel;
    private String manufacterer;
    private int size;
    private Resolution nativeResolution;//This is composition, the resolution is a component of the monitor

    public Monitor(String mdoel, String manufacterer, int size, Resolution nativeResolution) {
        this.mdoel = mdoel;
        this.manufacterer = manufacterer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
    }

    public String getMdoel() {
        return mdoel;
    }

    public void setMdoel(String mdoel) {
        this.mdoel = mdoel;
    }

    public String getManufacterer() {
        return manufacterer;
    }

    public void setManufacterer(String manufacterer) {
        this.manufacterer = manufacterer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
}
