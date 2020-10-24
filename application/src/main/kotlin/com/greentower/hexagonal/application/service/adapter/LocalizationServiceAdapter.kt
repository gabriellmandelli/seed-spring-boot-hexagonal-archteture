package com.greentower.hexagonal.application.service.adapter

import com.greentower.hexagonal.application.service.api.LocalizationService
import com.greentower.hexagonal.domain.model.Localization
import com.greentower.hexagonal.domain.spi.LocalizationPersistencePort
import java.util.*

class LocalizationServiceAdapter(private val localizationPersistencePort : LocalizationPersistencePort) : LocalizationService {

    override fun add(localization: Localization): Localization {
        return localizationPersistencePort.add(localization)
    }

    override fun remove(localization: Localization) {
        localizationPersistencePort.remove(localization)
    }

    override fun getAll(): List<Localization> {
        return localizationPersistencePort.getAll()
    }

    override fun findById(id: UUID): Optional<Localization> {
        return localizationPersistencePort.findById(id)
    }
}