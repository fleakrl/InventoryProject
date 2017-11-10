package com.example.demo.helloworld;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloREST {
    private final long id;
    private final String content;

}
