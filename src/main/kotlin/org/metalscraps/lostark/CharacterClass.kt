package org.metalscraps.lostark

@Suppress("unused")
enum class CharacterClass(val id: Short, val friendlyName: String) {
    BERSERKER(102, "버서커"),
    DESTROYER(103, "디스트로이어"),
    GUNLANCER(104, "워로드"),
    PALADIN(105, "홀리나이트"),
    ARCANIST(202, "아르카나"),
    SUMMONER(203, "서머너"),
    BARD(204, "바드"),
    SORCERESS(205, "소서리스"),
    WARDANCER(302, "배틀마스터"),
    SCRAPPER(303, "인파이터"),
    SOULFIST(304, "기공사"),
    GLAIVIER(305, "창술사"),
    STRIKER(312, "스트라이커"),
    DEATHBLADE(402, "블레이드"),
    SHADOWHUNTER(403, "데모닉"),
    REAPER(404, "리퍼"),
    SHARPSHOOTER(502, "호크아이"),
    DEADEYE(503, "데빌헌터"),
    ARTILLERIST(504, "블래스터"),
    MACHINIST(505, "스카우터"),
    GUNSLINGER(512, "건슬링어"),
    ARTIST(602, "도화가"),
}