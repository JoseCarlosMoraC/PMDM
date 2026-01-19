package com.example.proyectocoachx.Services;


import com.example.proyectocoachx.Repositories.CoachXRepository;

public class CoachXServices {
    private final CoachXRepository repo;


    public CoachXServices(CoachXRepository repo) {
        this.repo = new CoachXRepository();
    }

}
