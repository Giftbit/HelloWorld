package com.giftbit.codingexercise

import spock.lang.Specification
import groovyx.net.http.HTTPBuilder

class CodingExerciseTest extends Specification {
    def "Make sure we can run a simple test"() {
        setup:
        HelloWorld exercise = new HelloWorld()
        when:
        def result = exercise.whatShouldISay()
        then:
        result == "Hello World"
    }
}
