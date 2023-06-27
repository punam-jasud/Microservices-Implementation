package com.punam.docker.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrgnizationDto {

	private Long id;

	private String name;

	private String description;

	private String code;

	private LocalDateTime createdDate;

}
