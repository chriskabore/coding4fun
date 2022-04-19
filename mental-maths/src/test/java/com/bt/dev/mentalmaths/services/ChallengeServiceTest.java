package com.bt.dev.mentalmaths.services;


import com.bt.dev.mentalmaths.dtos.ChallengeAttemptDTO;
import com.bt.dev.mentalmaths.entities.challenges.ChallengeAttempt;
import com.bt.dev.mentalmaths.services.impl.ChallengeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {

    private ChallengeService challengeService;

    @BeforeEach
    public void setUp(){
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAtemptTest(){
        // given a correct attempt
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50,
                60, "johnDoe",3000);
        // when attempt is verified
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);
        // then the result of the correct attempt verifcation is true
        then(resultAttempt.isCorrect()).isTrue();

    }

    @Test
    public void checkWrongAttemptTest(){
        // given a wrong attempt
        ChallengeAttemptDTO wrongAttemptDTO = new ChallengeAttemptDTO(50,60,"johnDoe", 5000);
        // when an a attempt is verified
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(wrongAttemptDTO);
        // then result of the wrong attempt verification is false
        then(resultAttempt.isCorrect()).isFalse();
        
    }
}
