package com.greentower.hexagonal.domain.spi

import com.greentower.hexagonal.domain.model.Localization
import java.util.*

interface LocalizationPersistencePort {
    fun add(localization: Localization) : Localization

    fun remove(localization: Localization)

    fun getAll() : List<Localization>

    fun findById(id: UUID) : Optional<Localization>
}