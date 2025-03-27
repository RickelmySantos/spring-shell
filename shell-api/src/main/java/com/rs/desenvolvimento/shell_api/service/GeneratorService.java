package com.rs.desenvolvimento.shell_api.service;

import com.rs.desenvolvimento.shell_api.template.ProjectMetadata;
import freemarker.template.Configuration;
import freemarker.template.Template;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeneratorService {

  private final Configuration freemarkerConfig;

  public void generateProject(ProjectMetadata metadata) {
    Map<String, Object> data = Map.of("projectName", metadata.getProjectName(), "package", metadata.getPackageName());
    try {
      Template template = this.freemarkerConfig.getTemplate("README.md.ftl");
      File output = new File(metadata.getProjectName() + "/README.md");
      output.getParentFile().mkdirs();
      try (Writer writer = new FileWriter(output)) {
        template.process(data, writer);
      }
    } catch (Exception e) {
      throw new RuntimeException("Error generating project", e);
    }
  }
}
