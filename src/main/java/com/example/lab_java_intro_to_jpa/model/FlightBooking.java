package com.example.lab_java_intro_to_jpa.model;

import jakarta.persistence.Entity;

@Entity
public class FlightBooking {

    private Integer bookingId;
    private Integer customerId;
    private Integer flightId;

    public FlightBooking() {
    }

    public FlightBooking(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "FlightBooking{" +
                "bookingId=" + bookingId +
                ", customerId=" + customerId +
                ", flightId=" + flightId +
                '}';
    }
}
