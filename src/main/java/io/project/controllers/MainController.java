/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.controllers;

import io.project.domain.Aloha;
import java.util.Random;
import java.util.stream.IntStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v1/actions")
public class MainController {

    @GetMapping("/greetOne")
    public Mono<Aloha> alohaReactive() {
        return Mono.just(new Aloha("Aloha From Reactive World!!!!"));
    }

    @GetMapping("/greetTwo")
    public Aloha alohaTraditional() {
        return new Aloha("Aloha From Servlet World!");
    }

    @GetMapping("/linearSearch")
    public Mono<Integer> linearSearch() {
        
        int[]  randomIntsArray = IntStream.generate(() -> new Random().nextInt(1000000)).limit(1000000).toArray();
        int searchKey = 777;
        System.out.println("Key " + searchKey + " found at index: " + linerSearch(randomIntsArray, searchKey));

        Mono<Integer> result = Mono.just(linerSearch(randomIntsArray, searchKey));

        return result;
    }

    public static int linerSearch(int[] arr, int key) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
