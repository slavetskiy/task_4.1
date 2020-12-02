package ru.netology

fun calculatePrice(
    itemCount: Int,
    itemPrice: Int = 100,
    discount: Int = 100,
    discountStart: Int = 1_000,
    userLevel: String = "normal"
): Int {
    val total = itemPrice * itemCount
    val discounted = if (total > discountStart) {
        total - discount
    } else {
        total
    }
    return ((1 - userLevelToDiscount(userLevel)) * discounted).toInt()
}

fun userLevelToDiscount(level: String = "normal") = when (level) {
    "gold" -> 0.1
    "silver" -> 0.05
    else -> 0.0
}