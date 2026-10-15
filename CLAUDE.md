# Remiby

Android app (Android-only for now) that helps users learn and remember English.

## Repo layout

- `/`: git root, general files (README, LICENSE, docs).
- `code/`: the Android Studio project. Open this folder in Android Studio, run Gradle from here.
- A single `.gitignore` at the root covers everything.

## Tech stack

- Kotlin, Jetpack Compose + Material 3
- Gradle with Kotlin DSL (`build.gradle.kts`) and a version catalog (`gradle/libs.versions.toml`)
- Android Studio

## Project facts

- Package / applicationId: `io.github.scriptluck.remiby`
- minSdk 26, targetSdk / compileSdk 37
- License: Apache-2.0 (`LICENSE` + `NOTICE`), copyright "ScriptLuck"

## Code map (`code/app/src/main/java/io/github/scriptluck/remiby/`)

- `MainActivity.kt`: entry point; shows one `WordCard` inside a `Scaffold`.
- `data/Word.kt`: `Word`, `Definition`, `PartOfSpeech`.
  - `Word.id` is a permanent identity; `frequencyRank` is only a sort order and may change.
  - Part of speech and examples belong to each `Definition`, not to the `Word`.
  - `lastReviewedAt == null` means never seen. All fields are `val`; update with `copy()`.
- `data/SampleWords.kt`: 10 hardcoded sample words (data only, placeholder frequency ranks).
- `ui/WordCard.kt`: card showing a word with its numbered definitions and examples.
- `ui/theme/`: Material 3 theme; follows the system light/dark setting, no dynamic colour.

Plans, ideas and open questions: see `IDEAS.md`.

