package com.greentower.hexagonal.infrastructure.memory.config

import com.greentower.hexagonal.domain.spi.LocalizationPersistencePort
import com.greentower.hexagonal.infrastructure.memory.InMemoryLocalizationRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LocalizationInMemoryAdapter {

    @Bean
    fun getLocalizationPersistencePort() : LocalizationPersistencePort {
        return InMemoryLocalizationRepository()
    }
}