package com.artear.stevedore.stevedoreitems.repository.model.style

/**
 * Object to define margins of an object.
 * There is no necessary deserializer because any margin can be null.
 *
 * @param [Int] top Margin Top value
 * @param [Int] bottom Margin Bottom value
 * @param [Int] left Margin Left value
 * @param [Int] right Margin Right value
 */
class StyleMarginRect(
    var top: Int?,
    var bottom: Int?,
    var left: Int?,
    var right: Int?
)
