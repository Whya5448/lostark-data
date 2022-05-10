package org.metalscraps.lostark

@Suppress("unused")
enum class Engraving(
    val id: Short,
    val friendlyName: String
) {
    DISRESPECT(id = 107, friendlyName = "약자 무시"),
    SPIRIT_ABSORPTION(id = 109, friendlyName = "정기 흡수"),
    ETHER_PREDATOR(id = 110, friendlyName = "에테르 포식자"),
    STABILIZED_STATUS(id = 111, friendlyName = "안정된 상태"),
    GRUDGE(id = 118, friendlyName = "원한"),
    SUPER_CHARGE(id = 121, friendlyName = "슈퍼 차지"),
    STRONG_WILL(id = 123, friendlyName = "굳은 의지"),
    DROPS_OF_ETHER(id = 134, friendlyName = "구슬동자"),
    CRISIS_EVASION(id = 140, friendlyName = "위기 모면"),
    KEEN_BLUNT_WEAPON(id = 141, friendlyName = "예리한 둔기"),
    VITAL_POINT_HIT(id = 142, friendlyName = "급소 타격"),
    MAX_MP_INCREASE(id = 167, friendlyName = "최대 마나 증가"),
    MP_EFFICIENCY_INCREASE(id = 168, friendlyName = "마나 효율 증가"),
    MASTER_OF_ESCAPE(id = 202, friendlyName = "탈출의 명수"),
    FORTITUDE(id = 235, friendlyName = "불굴"),
    CRUSHING_FIST(id = 236, friendlyName = "분쇄의 주먹"),
    SHIELD_PIERCING(id = 237, friendlyName = "실드 관통"),
    MASTER_S_TENACITY(id = 238, friendlyName = "달인의 저력"),
    DIVINE_PROTECTION(id = 239, friendlyName = "여신의 가호"),
    HEAVY_ARMOR(id = 240, friendlyName = "중갑 착용"),
    EXPLOSIVE_EXPERT(id = 241, friendlyName = "폭발물 전문가"),
    ENHANCED_SHIELD(id = 242, friendlyName = "강화 방패"),
    NECROMANCY(id = 243, friendlyName = "강령술"),
    PREEMPTIVE_STRIKE(id = 244, friendlyName = "선수필승"),
    BROKEN_BONE(id = 245, friendlyName = "부러진 뼈"),
    LIGHTNING_FURY(id = 246, friendlyName = "번개의 분노"),
    CURSED_DOLL(id = 247, friendlyName = "저주받은 인형"),
    CONTENDER(id = 248, friendlyName = "승부사"),
    AMBUSH_MASTER(id = 249, friendlyName = "기습의 대가"),
    MAGICK_STREAM(id = 251, friendlyName = "마나의 흐름"),
    BARRICADE(id = 253, friendlyName = "바리케이드"),
    RAID_CAPTAIN(id = 254, friendlyName = "돌격대장"),
    AWAKENING(id = 255, friendlyName = "각성"),
    MASTER_BRAWLER(id = 288, friendlyName = "결투의 대가"),
    INCREASES_MASS(id = 295, friendlyName = "질량 증가"),
    PROPULSION(id = 296, friendlyName = "추진력"),
    HIT_MASTER(id = 297, friendlyName = "타격의 대가"),
    SIGHT_FOCUS(id = 298, friendlyName = "시선 집중"),
    ADRENALINE(id = 299, friendlyName = "아드레날린"),
    ALL_OUT_ATTACK(id = 300, friendlyName = "속전속결"),
    EXPERT(id = 301, friendlyName = "전문의"),
    EMERGENCY_RESCUE(id = 302, friendlyName = "긴급구조"),
    PRECISE_DAGGER(id = 303, friendlyName = "정밀 단도"),
    MAYHEM(id = 125, friendlyName = "광기"),
    ESOTERIC_SKILL_ENHANCEMENT(id = 127, friendlyName = "오의 강화"),
    ENHANCED_WEAPON(id = 129, friendlyName = "강화 무기"),
    FIREPOWER_ENHANCEMENT(id = 130, friendlyName = "화력 강화"),
    BERSERKERS_TECHNIQUE(id = 188, friendlyName = "광전사의 비기"),
    FIRST_INTENTION(id = 189, friendlyName = "초심"),
    ULTIMATE_SKILL_TAIJUTSU(id = 190, friendlyName = "극의: 체술"),
    SHOCK_TRAINING(id = 191, friendlyName = "충격 단련"),
    PISTOLEER(id = 192, friendlyName = "핸드거너"),
    BARRAGE_ENHANCEMENT(id = 193, friendlyName = "포격 강화"),
    TRUE_COURAGE(id = 194, friendlyName = "진실된 용맹"),
    DESPERATE_SALVATION(id = 195, friendlyName = "절실한 구원"),
    NO_NAME_1(id = 196, friendlyName = "분노의 망치"),
    NO_NAME_2(id = 197, friendlyName = "중력 수련"),
    NO_NAME_3(id = 198, friendlyName = "상급 소환사"),
    NO_NAME_4(id = 199, friendlyName = "넘치는 교감"),
    NO_NAME_5(id = 200, friendlyName = "황후의 은총"),
    NO_NAME_6(id = 201, friendlyName = "황제의 칙령"),
    NO_NAME_7(id = 224, friendlyName = "전투 태세"),
    LONE_KNIGHT(id = 225, friendlyName = "고독한 기사"),
    ENERGY_OVERFLOW(id = 256, friendlyName = "세맥타통"),
    ROBUST_SPIRIT(id = 257, friendlyName = "역천지체"),
    LOYAL_COMPANION(id = 258, friendlyName = "두 번째 동료"),
    DEATH_STRIKE(id = 259, friendlyName = "죽음의 습격"),
    PINNACLE(id = 276, friendlyName = "절정"),
    CONTROL(id = 277, friendlyName = "절제"),
    REMAINING_ENERGY(id = 278, friendlyName = "잔재된 기운"),
    SURGE(id = 279, friendlyName = "버스트"),
    PERFECT_SUPPRESSION(id = 280, friendlyName = "완벽한 억제"),
    DEMONIC_IMPULSE(id = 281, friendlyName = "멈출 수 없는 충동"),
    JUDGMENT(id = 282, friendlyName = "심판자"),
    BLESSED_AURA(id = 283, friendlyName = "축복의 오라"),
    NO_NAME_8(id = 284, friendlyName = "아르데타인의 기술"),
    NO_NAME_9(id = 285, friendlyName = "진화의 유산"),
    NO_NAME_10(id = 286, friendlyName = "갈증"),
    NO_NAME_11(id = 287, friendlyName = "달의 소리"),
    PEACEMAKER(id = 289, friendlyName = "피스메이커"),
    TIME_TO_HUNT(id = 290, friendlyName = "사냥의 시간"),
    DEATHBLOW(id = 291, friendlyName = "일격필살"),
    ESOTERIC_FLURRY(id = 292, friendlyName = "오의난무"),
    IGNITER(id = 293, friendlyName = "점화"),
    REFLUX(id = 294, friendlyName = "환류"),
    NO_NAME_12(id = 305, friendlyName = "회귀"),
    NO_NAME_13(id = 306, friendlyName = "만개"),
}