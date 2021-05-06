package edu.handong.csee.java.converters;

public class KMToMILEConverter implements Convertible {
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
     * This method convert KM value to MILE value.
     */
    public void convert() {
        this.value = this.value / 1.6;
    }
}