package io.github.sejoung

class MapOfUse {
    companion object {
        val CONFIRMED_COMMENT = "confirmedComment"
        val CONFIRMED_BY = "confirmedBy"
    }

    enum class Atest {
        A
    }

    fun getMap(confirmedBy: String?, confirmedComment: Atest): Map<String, Any> =
        mapOf(
            CONFIRMED_COMMENT to confirmedComment,
            CONFIRMED_BY to confirmedBy
        ).filter { it.value != null } as Map<String, Any>
}