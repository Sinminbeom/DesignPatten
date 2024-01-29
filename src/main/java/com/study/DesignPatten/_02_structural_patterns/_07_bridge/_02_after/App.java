package com.study.DesignPatten._02_structural_patterns._07_bridge._02_after;

import com.study.DesignPatten._02_structural_patterns._07_bridge._01_before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion Poolparty아리 = new 아리(new PoolParty());
        Poolparty아리.skillQ();
        Poolparty아리.skillW();
    }
}
