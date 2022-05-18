package org.metalscraps.lostark.item

enum class ItemGrade(val id: Byte, val friendlyName: String) {
    ALL(-1, "전체"),
    NORMAL(0, "일반"),
    UNCOMMON(1, "고급"),
    RARE(2, "희귀"),
    EPIC(3, "영웅"),
    LEGENDARY(4, "전설"),
    RELIC(5, "유물"),
    ANCIENT(6, "고대"),
    ESTHER(7, "에스더");
}