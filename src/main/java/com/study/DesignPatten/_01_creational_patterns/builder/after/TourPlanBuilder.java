package com.study.DesignPatten._01_creational_patterns.builder.after;

import com.study.DesignPatten._01_creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    DefaultTourBuilder2 newInstance();
    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
