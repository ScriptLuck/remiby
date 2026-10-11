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
