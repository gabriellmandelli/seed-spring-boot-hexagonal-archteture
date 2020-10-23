package com.greentower.hexagonal.infrastructure.postgres.repository

import com.greentower.hexagonal.infrastructure.postgres.entity.LocalizationEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface LocalizationJpaRepository : JpaRepository<LocalizationEntity, UUID> {
}