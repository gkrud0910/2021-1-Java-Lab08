package edu.handong.csee.java.converters;

public class MILEToKMConverter implements Convertible {
    private double value;

    /**
     * This method sets value.
     * @param fromValue a number for converting
     */
    public void setFromValue(double fromValue) {
        this.value = fromValue;
    }

    /**
     * This method returns value.
     * @return value
     */
    public double getConvertedValue() {
        return this.value;
    }

    /**
     * This method convert MILE value to KM value.
     */
    public void convert() {
        this.value = this.value * 1.6;
    }
}