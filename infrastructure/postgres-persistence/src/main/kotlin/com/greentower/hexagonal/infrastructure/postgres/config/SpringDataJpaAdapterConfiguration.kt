package com.greentower.hexagonal.infrastructure.postgres.config

import com.greentower.hexagonal.domain.spi.LocalizationPersistencePort
import com.greentower.hexagonal.infrastructure.postgres.adapter.LocalizationPostgresPersistencePort
import com.greentower.hexagonal.infrastructure.postgres.repository.LocalizationJpaRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringDataJpaAdapterConfiguration {

    @Bean
    fun getLocalizationPersistencePort(localizationJpaRepository : LocalizationJpaRepository) : LocalizationPersistencePort {
        return LocalizationPostgresPersistencePort(localizationJpaRepository)
    }
}