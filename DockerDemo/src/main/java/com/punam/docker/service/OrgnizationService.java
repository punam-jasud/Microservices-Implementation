package com.punam.docker.service;

import com.punam.docker.model.OrgnizationDto;

public interface OrgnizationService {

	OrgnizationDto saveOrgnization(OrgnizationDto orgnizationDto);

	OrgnizationDto getOrgnization(String code);

}
