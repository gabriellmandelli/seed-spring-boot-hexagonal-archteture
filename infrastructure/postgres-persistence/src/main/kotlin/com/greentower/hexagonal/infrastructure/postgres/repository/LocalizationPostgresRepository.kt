package com.greentower.hexagonal.infrastructure.postgres.repository


import com.greentower.hexagonal.domain.domain.Localization
import com.greentower.hexagonal.domain.spi.LocalizationRepository
import com.greentower.hexagonal.infrastructure.postgres.entity.LocalizationEntity
import java.util.*

class LocalizationPostgresRepository(private var repository: LocalizationJpaRepository) : LocalizationRepository {

    override fun add(localization: Localization) : Localization {
        val localizationDB = repository.save(LocalizationEntity(localization))
        localization.id = localizationDB.id
        return localization
    }

    override fun remove(localization: Localization) {
        repository.deleteById(localization.id)
    }

    override fun getAll(): List<Localization> {
        return repository.findAll().map { localization  ->
            localization.apply {
                id = localization.id
                longitude = localization.longitude
                latitude = localization.latitude
                description = localization.description
            } as Localization
        }
    }

    override fun findById(id: UUID): Optional<Localization> {

        val localizationDb = this.repository.findById(id)
        val localizationOptional : Optional<Localization>
        val localization = Localization()

        if (localizationDb.isPresent){
            localizationOptional = Optional.of(localization.apply {
                this.id = localizationDb.get().id
                this.longitude = localizationDb.get().longitude
                this.latitude = localizationDb.get().latitude
                this.description = localizationDb.get().description
            })
        }else{
            localizationOptional = Optional.empty()
        }

        return localizationOptional
    }
}