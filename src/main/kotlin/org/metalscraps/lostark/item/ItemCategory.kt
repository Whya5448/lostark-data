package org.metalscraps.lostark.item

enum class ItemCategory(val firstId: Int, val secondId: Int, val friendlyName: String) {
    ALL(0, 0, "전체 카테고리"),
    EQUIPMENT_ALL(10000, 0, "장비 - 전체"),
    EQUIPMENT_WEAPONS(10000, 190000, "장비 - 무기"),
    EQUIPMENT_HELMS(10000, 190010, "장비 - 투구"),
    EQUIPMENT_CHEST_ARMOR(10000, 190020, "장비 - 상의"),
    EQUIPMENT_LEGS_ARMOR(10000, 190030, "장비 - 하의"),
    EQUIPMENT_GLOVES(10000, 190040, "장비 - 장갑"),
    EQUIPMENT_SHOULDERS(10000, 190050, "장비 - 어깨"),
    ABILITY_STONES_ALL(30000, 0, "어빌리티 스톤 - 전체"),
    ACCESSORY_ALL(200000, 0, "장신구 - 전체"),
    ACCESSORY_AMULETS(200000, 200010, "장신구 - 목걸이"),
    ACCESSORY_EARRINGS(200000, 200020, "장신구 - 귀걸이"),
    ACCESSORY_RING(200000, 200030, "장신구 - 반지"),
    ACCESSORY_NO_NAME_1(200000, 200040, "장신구 - 팔찌"),
    GEMS_ALL(210000, 0, "보석 - 전체"),
}