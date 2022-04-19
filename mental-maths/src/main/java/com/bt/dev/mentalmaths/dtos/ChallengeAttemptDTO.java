package com.bt.dev.mentalmaths.dtos;

import lombok.Value;

/**
 *  Attempt coming data transfer object
 */
@Value
public class ChallengeAttemptDTO {
    int factorA, factorB;
    String userAlias;
    int guess;
}
