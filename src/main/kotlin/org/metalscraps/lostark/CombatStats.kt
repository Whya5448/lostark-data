package org.metalscraps.lostark

enum class CombatStats(val id: Byte, val friendlyName: String) {
    CRIT(15, "치명"),
    SPECIALIZATION(16, "특화"),
    SWIFTNESS(18, "신속"),
    DOMINATION(17, "제압"),
    ENDURANCE(19, "인내"),
    EXPERTISE(20, "숙련");
}