package com.cs4520.assignment1

sealed class Product {

    abstract val name: String
    abstract val expiryDate: String?
    abstract val price: Int

    data class FoodProduct(
        override val name: String,
        override val expiryDate: String?,
        override val price: Int
    ) : Product()

    data class EquipmentProduct(
        override val name: String,
        override val expiryDate: String?,
        override val price: Int
    ) : Product()
}
