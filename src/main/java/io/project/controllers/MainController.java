/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.controllers;

import io.project.domain.Aloha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author armena
 */
@RestController
public class MainController {

    @GetMapping("/greetOne")
    public Mono<Aloha> alohaReactive() {
        return Mono.just(new Aloha("Aloha From Reactive World!!!!"));
    }

    @GetMapping("/greetTwo")
    public Aloha alohaTraditional() {
        return new Aloha("Aloha From Servlet World!");
    }

}
