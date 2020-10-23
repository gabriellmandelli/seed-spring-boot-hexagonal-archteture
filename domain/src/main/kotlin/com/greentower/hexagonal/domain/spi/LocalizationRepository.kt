package com.greentower.hexagonal.domain.spi

import com.greentower.hexagonal.domain.domain.Localization
import java.util.*

interface LocalizationRepository {
    fun add(localization: Localization) : Localization

    fun remove(localization: Localization)

    fun getAll() : List<Localization>

    fun findById(id: UUID) : Optional<Localization>
}