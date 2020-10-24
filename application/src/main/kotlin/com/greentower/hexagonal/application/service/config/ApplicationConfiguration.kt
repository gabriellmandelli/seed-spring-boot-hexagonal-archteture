package com.greentower.hexagonal.application.service.config

import com.greentower.hexagonal.application.service.adapter.LocalizationServiceAdapter
import com.greentower.hexagonal.application.service.api.LocalizationService
import com.greentower.hexagonal.domain.spi.LocalizationPersistencePort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

    @Bean
    fun getLocalizationService(localizationPersistencePort: LocalizationPersistencePort ): LocalizationService {
        return LocalizationServiceAdapter(localizationPersistencePort)
    }
}