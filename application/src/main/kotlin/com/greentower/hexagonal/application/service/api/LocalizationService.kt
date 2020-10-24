package com.greentower.hexagonal.application.service.api

import com.greentower.hexagonal.domain.model.Localization
import java.util.*

interface LocalizationService {
    fun add(localization: Localization) : Localization

    fun remove(localization: Localization)

    fun getAll() : List<Localization>

    fun findById(id: UUID) : Optional<Localization>
}