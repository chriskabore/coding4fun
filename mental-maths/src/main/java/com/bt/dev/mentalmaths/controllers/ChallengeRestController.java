package com.bt.dev.mentalmaths.controllers;

import com.bt.dev.mentalmaths.entities.challenges.Challenge;
import com.bt.dev.mentalmaths.services.ChallengeGeneratorService;
import com.bt.dev.mentalmaths.services.ChallengeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/challenges")
public class ChallengeRestController {
    private final ChallengeGeneratorService challengeGeneratorService;

    @GetMapping("/random")
    Challenge getRandomChallenge(){
        Challenge challenge = challengeGeneratorService.generateRandomChallenge();
        log.info("Generating random challenge: {}",challenge);
        return challenge;
    }
}
