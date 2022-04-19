package com.bt.dev.mentalmaths.services;

import com.bt.dev.mentalmaths.dtos.ChallengeAttemptDTO;
import com.bt.dev.mentalmaths.entities.challenges.ChallengeAttempt;

public interface ChallengeService {

    /**
     * Verifies if an attempt is correct or not
     * @param resultAttempt
     * @return the resulting challenge attempt object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
