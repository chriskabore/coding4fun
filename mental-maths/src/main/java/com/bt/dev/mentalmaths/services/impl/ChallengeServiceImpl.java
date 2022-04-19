package com.bt.dev.mentalmaths.services.impl;

import com.bt.dev.mentalmaths.dtos.ChallengeAttemptDTO;
import com.bt.dev.mentalmaths.entities.challenges.ChallengeAttempt;
import com.bt.dev.mentalmaths.entities.users.User;
import com.bt.dev.mentalmaths.services.ChallengeService;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {

    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt) {

        // check if the attempt is correct
        boolean isCorrect = resultAttempt.getGuess() ==
                resultAttempt.getFactorA() * resultAttempt.getFactorB();

        User user = new User(null, resultAttempt.getUserAlias());

        ChallengeAttempt checkedAttempt = new ChallengeAttempt(null, null,
                resultAttempt.getFactorA(),resultAttempt.getFactorB(), resultAttempt.getGuess(), isCorrect);


        return checkedAttempt;
    }
}
