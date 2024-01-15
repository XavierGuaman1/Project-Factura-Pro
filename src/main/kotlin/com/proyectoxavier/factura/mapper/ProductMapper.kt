package com.proyectoxavier.factura.mapper

import com.proyectoxavier.factura.dto.ProductDto
import com.proyectoxavier.factura.model.Product


object ProductMapper {
    fun mapToDto(product: Product): ProductDto {

        return ProductDto(
            product.id,
            "${product.description} ${product.brand}"
        )
    }
}