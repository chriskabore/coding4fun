package com.bt.dev.mentalmaths.services.impl;


import com.bt.dev.mentalmaths.entities.challenges.Challenge;
import com.bt.dev.mentalmaths.services.ChallengeGeneratorService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

    private final Random random;

    public ChallengeGeneratorServiceImpl(){
        this.random = new Random();
    }

    public ChallengeGeneratorServiceImpl(final Random random){
        this.random = random;
    }

    @Override
    public Challenge generateRandomChallenge() {
        return null;
    }
}
