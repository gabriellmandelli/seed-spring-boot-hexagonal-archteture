package com.greentower.hexagonal.infrastructure.memory

import com.greentower.hexagonal.domain.domain.Localization
import com.greentower.hexagonal.domain.spi.LocalizationRepository
import java.util.*

class InMemoryLocalizationRepository : LocalizationRepository {

    var localizationList : MutableList<Localization> = emptyList<Localization>() as MutableList<Localization>

    override fun add(localization: Localization) : Localization {
        localizationList.add(localization)
        return localization
    }

    override fun remove(localization: Localization) {

        val localizationFind = findById(localization.id)

        if (localizationFind.isPresent){localizationList.remove(localizationFind.get())}
    }

    override fun getAll(): List<Localization> {
        return localizationList
    }

    override fun findById(id: UUID): Optional<Localization> {

        val localizationOptional : Optional<Localization>

        val localization = localizationList.find { localization: Localization -> localization.id === id }

        if (localization !== null){
            localizationOptional = Optional.of(localization)
        }else{
            localizationOptional = Optional.empty()
        }

        return localizationOptional
    }
}