package com.study.DesignPatten._01_creational_patterns.builder.after;

import com.study.DesignPatten._01_creational_patterns.builder.before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
//        TourPlanBuilder builder = new DefaultTourBuilder();
//        TourPlan plan = builder.title("칸쿤")
//                .nightsAndDays(2, 3)
//                .startDate(LocalDate.of(2020, 12, 9))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인하고 짐 풀기")
//                .addPlan(0, "저녁 식사")
//                .getPlan();
//
//        TourPlan longBeachTrip = builder.title("롱비치")
//                .startDate(LocalDate.of(2021,7,23))
//                .getPlan();
    }
}
