package com.greentower.hexagonal.infrastructure.postgres.entity

import com.greentower.hexagonal.domain.model.Localization
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "localization")
class LocalizationEntity {

    @Id
    var id: UUID = UUID.randomUUID()
    var longitude = 0.0
    var latitude = 0.0
    var description = ""

    constructor(localization : Localization):this(){
        this.id = localization.id
        this.longitude = localization.longitude
        this.latitude = localization.latitude
        this.description = localization.description
    }

    constructor()

}