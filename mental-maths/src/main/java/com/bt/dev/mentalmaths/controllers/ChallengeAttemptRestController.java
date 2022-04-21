package com.bt.dev.mentalmaths.controllers;

import com.bt.dev.mentalmaths.dtos.ChallengeAttemptDTO;
import com.bt.dev.mentalmaths.entities.challenges.ChallengeAttempt;
import com.bt.dev.mentalmaths.services.ChallengeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Slf4j
@RequiredArgsConstructor
@RequestMapping("/attempts")
@RestController
public class ChallengeAttemptRestController {

    private final ChallengeService challengeService;

    @PostMapping
    ResponseEntity<ChallengeAttempt> postResult(@RequestBody @Valid ChallengeAttemptDTO challengeAttemptDTO){
        return ResponseEntity.ok(challengeService.verifyAttempt(challengeAttemptDTO));
    }
}
