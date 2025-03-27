package com.rs.desenvolvimento.shell_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.shell.command.annotation.CommandScan;

@EnableConfigurationProperties
@CommandScan(basePackages = "com.rs.desenvolvimento.shell_api.command")
@SpringBootApplication
public class ShellApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShellApiApplication.class, args);
  }

}
