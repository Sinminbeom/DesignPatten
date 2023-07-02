package com.study.DesignPatten._01_creational_patterns.builder.after;

import com.study.DesignPatten._01_creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public class DefaultTourBuilder2 implements TourPlanBuilder{

    private TourPlan tourPlan;

    @Override
    public DefaultTourBuilder2 newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return null;
    }

    @Override
    public TourPlanBuilder title(String title) {
        return null;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        return null;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        return null;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        return null;
    }

    @Override
    public TourPlan getPlan() {
        return null;
    }
}
