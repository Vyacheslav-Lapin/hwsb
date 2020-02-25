package com.example.hwsb.config;

import com.example.hwsb.dao.CatRepository;
import com.example.hwsb.model.Cat;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Initer implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("Васька", "Мурзик", "Барсик")
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
