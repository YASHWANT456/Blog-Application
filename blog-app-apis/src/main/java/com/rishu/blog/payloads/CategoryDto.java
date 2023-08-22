package com.rishu.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
	
	private Integer categoryId;
	@NotBlank(message = "title should not be empty")
	private String categoryTitle;
	@NotBlank(message = "description should not be empty")
	private String categoryDescription;

}
