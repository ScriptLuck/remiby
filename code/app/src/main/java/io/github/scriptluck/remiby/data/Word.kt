package io.github.scriptluck.remiby.data

import java.time.Instant

enum class PartOfSpeech {
    NOUN,
    VERB,
    ADJECTIVE,
    ADVERB,
    PRONOUN,
    PREPOSITION,
    CONJUNCTION,
    DETERMINER,
    INTERJECTION,
}

data class Definition(
    val partOfSpeech: PartOfSpeech,
    val meaning: String,
    val examples: List<String> = emptyList(),
)

data class Word(
    val id: Int,
    val text: String,
    val frequencyRank: Int,
    val definitions: List<Definition>,
    val repetitions: Int = 0,
    val lastReviewedAt: Instant? = null,
)
