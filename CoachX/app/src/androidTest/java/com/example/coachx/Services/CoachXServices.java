package com.example.coachx.Services;

import com.example.coachx.Repositories.CoachXRepository;

public class CoachXServices {
    private final CoachXRepository repo;


    public CoachXServices(CoachXRepository repo) {
        this.repo = new CoachXRepository();
    }

}
