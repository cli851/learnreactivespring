package com.learnreactivespring.fluxandmonoplayground;
import org.junit.Test;
import reactor.core.publisher.Flux;


public class FLuxAndmonoTest {

  @Test
  public void fulxTest() {
    Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
      .concatWith(Flux.error(new RuntimeException("Exception Occurred")));

    stringFlux.subscribe(System.out::println,
      (e)-> System.err.println(e));
  }
}
