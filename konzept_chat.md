2026-06-23

# 🌿 Pocket Garden – Terminal Java Game (OOP Konzept)

## 🎮 Grundidee
Ein kleines Terminal-Spiel, in dem der Spieler einen Garten mit verschiedenen Pflanzen pflegt. Ziel ist es, Pflanzen am Leben zu halten und sie gesund wachsen zu lassen.

Kein Filesystem, keine GUI, alles läuft im Speicher.

---

# 🧠 1. Spielkonzept

Der Spieler interagiert über ein Menü:

- Pflanzen gießen
- Düngen
- Sonnenlicht geben
- Status anzeigen
- Zurück ins Menü / Beenden

Das Spiel läuft in einer Schleife (Game Loop).

---

# 🔁 2. Game Loop Konzept


START
↓
Main Menu anzeigen
↓
Spieler wählt Aktion
↓
Aktion wird ausgeführt
↓
Zeit-Tick wird ausgelöst
↓
Pflanzen verändern sich
↓
zurück ins Menü


---

# 🌱 3. Pflanzen-System (OOP)

## 🧬 Abstrakte Klasse: Plant
Alle Pflanzen haben gemeinsame Eigenschaften:

- name
- waterLevel
- nutrients
- growth
- health
- happiness (optional)

## 🌸 Unterklassen (Vererbung)

### 🌹 Rose
- schnell wachsend
- empfindlich
- braucht viel Pflege

### 🌵 Cactus
- sehr robust
- wenig Wasser nötig
- langsames Wachstum

### 🌻 Sunflower
- stark abhängig von Licht
- gutes Wachstum bei Sonne

---

# 🎭 4. Aktionen (Spieler-Interaktion)

## 💧 Water
- erhöht Wasserlevel
- verbessert Gesundheit

## 🌿 Fertilize
- erhöht Nährstoffe
- steigert Wachstum

## ☀️ Sunlight
- beeinflusst Wachstum (je nach Pflanze unterschiedlich)

## ✂️ Care / Trim (optional)
- erhöht Gesundheit
- reduziert kurzfristig Wachstum

## 💤 Wait (Time Tick)
- simuliert Zeitverlauf

---

# ⏳ 5. Zeit-System (Tick-System)

## Konzept:
Zeit läuft NICHT real, sondern pro Aktion.

Nach jeder Spieleraktion:

- Wasser sinkt
- Nährstoffe sinken leicht
- Wachstum steigt (wenn Bedingungen gut)
- Gesundheit verändert sich abhängig vom Zustand

---

## ⚠️ Zustände

- zu wenig Wasser → Pflanze verdorrt langsam
- zu viele Nährstoffe → Überdüngung (schädlich)
- schlechte Bedingungen → Wachstum stoppt
- Gesundheit = 0 → Pflanze stirbt

---

# 🎮 6. Game Loop Struktur


while (gameRunning) {
Menü anzeigen
Input lesen
Aktion ausführen
tickTime() aufrufen
}


---

# 🚪 7. Menü / Exit Konzept

- Menü läuft in einer while-Schleife
- „Beenden“ setzt:
  - gameRunning = false

ODER bei Sub-Menüs:
- gardenRunning = false → zurück ins Hauptmenü

---

# 🌿 8. GardenManager Konzept

Zweiter Spielmodus innerhalb des Spiels:

- eigenes Menü
- eigene while-Schleife
- verwaltet Pflanzen
- führt Aktionen aus
- kehrt zurück zum Hauptmenü

---

# 🧱 9. Architektur (vereinfachtes Design)

## Struktur:

- Main → startet Spiel
- Game/App → Hauptsteuerung
- GardenManager → Pflanzen-Modus
- Plant (abstract) → Basis aller Pflanzen
- Subclasses → spezielle Pflanzen
- TimeService → Tick-System
- Interfaces → Fähigkeiten

---

# 🔌 10. Interfaces (OOP Erweiterung)

Optional für sauberes Design:

- Waterable
- Fertilizable
- Growable

→ Pflanzen können unterschiedliche Fähigkeiten haben

---

# 🧠 11. OOP Konzepte im Projekt

Dieses Projekt nutzt:

- ✔ Abstrakte Klassen (Plant)
- ✔ Vererbung (Rose, Cactus, Sunflower)
- ✔ Polymorphismus (unterschiedliche Reaktionen)
- ✔ Interfaces (Fähigkeiten)
- ✔ Kapselung (Service-Klassen)
- ✔ Game Loop Architektur

---

# 📦 12. Ziel des Projekts

Du lernst:

- saubere Terminal-App Struktur
- OOP in echten Szenarien
- Game Loop Design
- Zustandslogik (Simulation)
- Architektur statt nur Code

---

# 🚀 13. Erweiterungsmöglichkeiten (später)

- 🌦 Wetter-System (Regen, Sonne)
- 🐛 Zufalls-Events (Insekten, Krankheiten)
- 📅 Tages-/Jahreszeiten
- 🏆 Highscore Garten
- 🌱 neue Pflanzenarten

---

# 💡 14. Kerngedanke

> Main steuert, GardenManager verwaltet, Plant lebt, Time verändert alles.

---
