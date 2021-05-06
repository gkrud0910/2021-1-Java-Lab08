package edu.handong.csee.java.converters;

public interface Convertible {
    /**
     * This method sets value.
     * @param fromValue a number for converting
     */
    public void setFromValue(double fromValue);

    /**
     *This method returns value.
     * @return value
     */
    public double getConvertedValue();

    /**
     * This method converts a unit into the other unit.
     */
    public void convert();

}
