package com.rideShare.enums;

public enum SelectionStrategy {
    FastestRide("Fastest Ride"), EarliestRide("Earliest ride"),;

    private String status;

    SelectionStrategy(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }

    public boolean isFastestRide() {
    	return this.equals(FastestRide);
    }

    public boolean isEarliestRide() {
    	return this.equals(EarliestRide);
    }

}
