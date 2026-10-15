# Ideas

Future-facing notebook for Remiby: ideas, open questions and the backlog.
Once something is built, its decisions move to `CLAUDE.md` and leave this file.

## The idea

- Flashcards that show an English word's **definition**, not a translation.
- Built-in dictionary of 10k-40k words, written by the Author, ordered by word frequency:
  the most common words come first.
- Two answers per card:
  - **Know**: repetitions + 1, last reviewed = now.
  - **Don't know**: repetitions back to 0.
- The review interval doubles with each "Know": 1, 2, 4, 8, 16... days
  (interval = 2^(repetitions - 1) days).

## Ideas for later

- **More word data**: similar words (synonyms), word forms (edit → editor, editing),
  phrases and idioms ("cool as a cucumber").
- **Phrases**: give `Word` a `type` field (WORD, PHRASAL_VERB, IDIOM) and keep
  `PartOfSpeech` purely grammatical ("cool as a cucumber" = IDIOM, used as an adjective).
- **Function words** (the, a, in, and, I) are the most frequent words, so they'll be the very
  first cards. Consider friendlier part-of-speech labels, or grouping the rare ones as "Other".
- **Dictionary vs progress**: when moving to SQLite, split shipped dictionary data from user
  progress (two tables linked by word id), so dictionary updates never wipe progress.
- **"Use wallpaper colours" setting**: bring back Material You dynamic colour as a user
  option (stored with DataStore), off by default.
- **Pure black theme** for OLED screens, possibly as a setting.
- **Dictionary sources**: dictionary text (Oxford, Cambridge...) is copyrighted. Frequency
  lists and any definition sources need licences compatible with Apache-2.0.

## Working rules

- Write definitions and examples in our own words; never copy dictionary text.
- New ideas go to "Ideas for later"; once built, their decisions move to `CLAUDE.md`.

## Current work

- Main screen shows one word with `WordCard` (`sampleWords[6]`, "run").
- Theme follows the system light/dark setting; dynamic colour was removed.
- Next: decide the dark theme look (dark grey or pure black) and Remiby's brand colours.

## Open questions

- When does a "Don't know" word come back: later in the same session, or tomorrow?
- Card flow: show the word and reveal definitions on tap, or show a definition and guess
  the word?
- Always dark, or follow the system setting? If dark, grey or pure black?
- Brand colours (the template's purple is still in place).
- Where do the 10k-40k words and their frequency ranks come from?

## Backlog

- Screens and navigation: Home, Learn, Review, Settings.
- Card interaction: Know / Don't know buttons with state.
- Persist words and progress with Room (SQLite).
- Spaced-repetition logic + unit tests.
- Daily reminder notifications (WorkManager).
- Polish: theming, app icon, accessibility.
- Release build and Play Store preparation.
- Likely libraries: Navigation Compose, ViewModel + StateFlow, Room, DataStore, WorkManager,
  Hilt or manual DI, coroutines.
