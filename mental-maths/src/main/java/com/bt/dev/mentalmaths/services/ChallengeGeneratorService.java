package com.bt.dev.mentalmaths.services;


import com.bt.dev.mentalmaths.entities.challenges.Challenge;

public interface ChallengeGeneratorService {
    /**
     *
     * @return a randomly generated Challenge with factors between 11 et 99.
     */
    Challenge generateRandomChallenge();
}
