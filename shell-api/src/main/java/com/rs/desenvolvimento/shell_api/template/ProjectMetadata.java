package com.rs.desenvolvimento.shell_api.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectMetadata {

  private String projectName;
  private String packageName;
}
