package com.example.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.example.dependency.domain.Person;

@Component
public class NameUppercaser implements Function<Person, String> {

    @Override
    public String apply(Person input) {
        return "hi " + input.getName().toUpperCase() + "!";
    }
}