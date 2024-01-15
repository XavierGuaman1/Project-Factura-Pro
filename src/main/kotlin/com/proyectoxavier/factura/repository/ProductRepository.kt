package com.proyectoxavier.factura.repository

import com.proyectoxavier.factura.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long?> {
    fun findById (id: Long?): Product?
}


