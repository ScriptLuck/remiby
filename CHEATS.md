# Cheats

Useful Android Studio, Kotlin and Compose shortcuts and tips.
Shortcuts use the default Linux/Windows keymap (change them in **Settings → Keymap**).

## Editing and navigation

| Shortcut | What it does |
|---|---|
| `Alt+Enter` | Quick fixes: add missing import, fix an error, convert code. The most important one |
| `Shift Shift` | Search everything: files, classes, settings, actions |
| `Ctrl+Shift+A` | Find any action by name |
| `Ctrl+B` / `Ctrl+Click` | Go to definition |
| `Ctrl+Q` | Quick documentation for the thing under the cursor |
| `Ctrl+P` | Show function parameters (cursor inside the `( )`) |
| `Shift+F6` | Rename everywhere |
| `Ctrl+E` | Recent files |
| `Ctrl+W` / `Ctrl+Shift+W` | Grow / shrink selection |
| `Ctrl+D` | Duplicate line |
| `Ctrl+Y` | Delete line |
| `Ctrl+/` | Comment / uncomment line |
| `Alt+Shift+↑/↓` | Move line up / down |
| `Ctrl+Alt+V` | Extract into a variable |
| `Ctrl+Alt+M` | Extract into a function |
| `Ctrl+Alt+S` | Open Settings |

## Formatting

| Shortcut | What it does |
|---|---|
| `Ctrl+Alt+L` | Reformat code (on some Linux desktops this locks the screen; use **Code → Reformat Code**) |
| `Ctrl+Alt+O` | Optimize imports: remove unused, sort the rest |

Format automatically on save: **Settings → Tools → Actions on Save** → ☑ Reformat code, ☑ Optimize imports.

## Compose

| Trick | What it does |
|---|---|
| `comp` + `Tab` | New `@Composable` function skeleton |
| `prev` + `Tab` | New `@Preview` function skeleton |
| `Alt+Enter` on a composable → *Surround with widget* | Wrap it in `Row` / `Column` / `Box` |
| **Split** button (top-right of editor) | Code + live preview side by side |

## Running and reloading

| Tool | Shortcut | Use for |
|---|---|---|
| **Live Edit** | automatic | UI changes inside `@Composable` bodies, state mostly kept. Enable in **Settings → Editor → Live Edit**; needs API 30+ |
| **Apply Changes and Restart Activity** | `Ctrl+F10` | Code changes Live Edit can't handle, without reinstalling |
| **Apply Code Changes** | `Ctrl+Alt+F10` | Changed function bodies, no restart |
| **Run** | `Shift+F10` | New classes, changed parameters or data classes, manifest / Gradle changes |
