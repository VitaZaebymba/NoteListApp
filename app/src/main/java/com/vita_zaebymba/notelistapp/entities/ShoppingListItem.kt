package com.vita_zaebymba.notelistapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity (tableName = "ShopListItem")
data class ShoppingListItem(
    @PrimaryKey (autoGenerate = true)
    val id: Int?,

    @ColumnInfo (name = "name")
    val name: String,

    @ColumnInfo (name = "itemInfo")
    val itemInfo: String?,

    @ColumnInfo (name = "itemChecked")
    val itemChecked: Int = 0,

    @ColumnInfo (name = "listId")
    val listId: Int,

    @ColumnInfo (name = "itemType")
    val itemType: String = "item",

): Serializable
