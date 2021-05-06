package edu.handong.csee.java.converters;

public class AllConverter {
    private double valueBefore, valueAfter;
    private String type;

    /**
     * This constructor sets value.
     * @param fromValue a number for converting
     * @return this for using method chaining
     */
    public AllConverter setFromValue(double fromValue) {
        this.valueBefore = fromValue;
        return this;
    }

    /**
     * This constructor sets type.
     * @param originalMeasure a unit for converting the other unit
     * @return this for using method chaining
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.type = originalMeasure;
        return this;
    }

    /**
     * This constructor check the type and print values.
     * @return this for using method chaining
     * @see KMToMConverter
     * @see KMToMConverter
     * @see TONToKGConverter
     * @see TONToGConverter
     */
    public AllConverter convertAndPrintOut() {
        if(type.equals("KM")) {
            KMToMConverter kmTOm = new KMToMConverter();
            KMToMILEConverter kmTOmile = new KMToMILEConverter();

            kmTOm.setFromValue(valueBefore);
            kmTOm.convert();
            this.valueAfter = kmTOm.getConvertedValue();
            System.out.println(valueBefore + " KM to " + valueAfter + " M");

            kmTOmile.setFromValue(valueBefore);
            kmTOmile.convert();
            this.valueAfter = kmTOmile.getConvertedValue();
            System.out.println(valueBefore + " KM to " + valueAfter + " MILE");
        }

        else if(type.equals("TON")) {
            TONToKGConverter tonTOkg = new TONToKGConverter();
            TONToGConverter tonTOg = new TONToGConverter();

            tonTOkg.setFromValue(valueBefore);
            tonTOkg.convert();
            this.valueAfter = tonTOkg.getConvertedValue();
            System.out.println(valueBefore + " TON to " + valueAfter + " KG");

            tonTOg.setFromValue(valueBefore);
            tonTOg.convert();
            this.valueAfter = tonTOg.getConvertedValue();
            System.out.println(valueBefore + " TON to " + valueAfter + " G");
        }

        else {
            System.out.println("AllConverter cannot support the measure!");
        }

        return this;
    }
}