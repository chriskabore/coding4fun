package com.bt.dev.mentalmaths.services.impl;


import com.bt.dev.mentalmaths.entities.challenges.Challenge;
import com.bt.dev.mentalmaths.services.ChallengeGeneratorService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

    private static final int MINIMUM_FACTOR = 11;
    private static final int MAXIMUM_FACTOR = 100;

    private final Random random;

    public ChallengeGeneratorServiceImpl(){
        this.random = new Random();
    }

    public ChallengeGeneratorServiceImpl(final Random random){
        this.random = random;
    }

    @Override
    public Challenge generateRandomChallenge() {
        return new Challenge(next(),next());
    }

    private int next() {
        return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR)+ MINIMUM_FACTOR;
    }
}
