package com.example.shoplist.domain

class DeleteItemUseCase(private val shopListRepository: ShopListRepository) {
    private val shopList = mutableListOf<ShopItem>()



    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }



}