package io.github.scriptluck.remiby.data

// Hardcoded starter data until the real dictionary exists.
// frequencyRank values are rough placeholders, not from a real frequency list.
val sampleWords = listOf(
    Word(
        id = 1,
        text = "mother",
        frequencyRank = 470,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.NOUN,
                meaning = "a woman who has a child",
                examples = listOf("My mother is a teacher.", "She became a mother last year."),
            ),
        ),
    ),
    Word(
        id = 2,
        text = "tree",
        frequencyRank = 900,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.NOUN,
                meaning = "a tall plant with a wooden trunk, branches and leaves",
                examples = listOf("We sat in the shade of a big tree."),
            ),
        ),
    ),
    Word(
        id = 3,
        text = "water",
        frequencyRank = 280,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.NOUN,
                meaning = "the clear liquid that falls as rain and that people and animals drink",
                examples = listOf("Can I have a glass of water?"),
            ),
            Definition(
                partOfSpeech = PartOfSpeech.VERB,
                meaning = "to pour water on plants to help them grow",
                examples = listOf("Don't forget to water the flowers."),
            ),
        ),
    ),
    Word(
        id = 4,
        text = "house",
        frequencyRank = 310,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.NOUN,
                meaning = "a building where people live, usually one family",
                examples = listOf("They live in a small house near the sea."),
            ),
        ),
    ),
    Word(
        id = 5,
        text = "friend",
        frequencyRank = 450,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.NOUN,
                meaning = "a person you know well and like, who is not part of your family",
                examples = listOf("She is my best friend.", "I met some friends after work."),
            ),
        ),
    ),
    Word(
        id = 6,
        text = "eat",
        frequencyRank = 600,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.VERB,
                meaning = "to put food in your mouth and swallow it",
                examples = listOf("We usually eat dinner at seven."),
            ),
        ),
    ),
    Word(
        id = 7,
        text = "run",
        frequencyRank = 350,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.VERB,
                meaning = "to move quickly on your feet",
                examples = listOf("I run in the park every morning."),
            ),
            Definition(
                partOfSpeech = PartOfSpeech.VERB,
                meaning = "to manage a business or an organization",
                examples = listOf("She runs a small café."),
            ),
            Definition(
                partOfSpeech = PartOfSpeech.NOUN,
                meaning = "a period of running, often for exercise",
                examples = listOf("Let's go for a run."),
            ),
        ),
    ),
    Word(
        id = 8,
        text = "happy",
        frequencyRank = 650,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.ADJECTIVE,
                meaning = "feeling pleased and good",
                examples = listOf("The children look very happy.", "I'm happy to help."),
            ),
        ),
    ),
    Word(
        id = 9,
        text = "light",
        frequencyRank = 420,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.NOUN,
                meaning = "the energy from the sun or a lamp that lets you see things",
                examples = listOf("Turn on the light, please."),
            ),
            Definition(
                partOfSpeech = PartOfSpeech.VERB,
                meaning = "to make something start to burn",
                examples = listOf("He lit a candle."),
            ),
            Definition(
                partOfSpeech = PartOfSpeech.ADJECTIVE,
                meaning = "not heavy",
                examples = listOf("This bag is very light."),
            ),
        ),
    ),
    Word(
        id = 10,
        text = "quickly",
        frequencyRank = 1200,
        definitions = listOf(
            Definition(
                partOfSpeech = PartOfSpeech.ADVERB,
                meaning = "fast; in a short time",
                examples = listOf("She quickly finished her homework."),
            ),
        ),
    ),
)
