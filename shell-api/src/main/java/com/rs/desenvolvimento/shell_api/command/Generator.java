package com.rs.desenvolvimento.shell_api.command;

import com.rs.desenvolvimento.shell_api.service.GeneratorService;
import com.rs.desenvolvimento.shell_api.template.ProjectMetadata;
import org.springframework.shell.command.annotation.Command;

@Command(command = "generator", description = "Generate a new project")
public class Generator {

  private final GeneratorService generatorService;

  public Generator(GeneratorService generatorService) {
    this.generatorService = generatorService;

  }

  @Command(command = "api")
  public String generateProject(String name, String packageName) {
    ProjectMetadata metadata = new ProjectMetadata(name, packageName);
    this.generatorService.generateProject(metadata);

    return ">>>> PROJETO GERADO COM SUCESSO! <<<<<";
  }

}
