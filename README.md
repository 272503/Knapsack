# Laboratorium 5 – Nieograniczony Problem Plecakowy w Javie

**Przedmiot:** Platformy Programistyczne .NET i Java  
**Data:** 29 maja 2025  
**Autor:** Piotr Kosior

## Cel projektu

Celem laboratorium było stworzenie aplikacji konsolowej w języku Java, która rozwiązuje nieograniczony problem plecakowy przy użyciu algorytmu zachłannego (Dantzig, 1957). Projekt miał na celu porównanie możliwości języka Java względem technologii .NET, a także zapoznanie się z podstawami programowania obiektowego, testowania i obsługi Maven.

---

## Struktura projektu

Projekt zawiera następujące klasy:

- `Main` – uruchamia aplikację i prezentuje wyniki.
- `Problem` – reprezentuje instancję problemu plecakowego (lista przedmiotów, generacja danych).
- `Item` – klasa opisująca przedmiot (waga, wartość).
- `Result` – klasa reprezentująca wynik rozwiązania (lista wybranych przedmiotów, łączna wartość i waga).
- `ProblemTest` – testy jednostkowe stworzone przy użyciu JUnit.

---

## Opis algorytmu

Zaimplementowany algorytm zachłanny działa według następującego schematu:

1. Oblicza stosunek wartość/waga dla każdego przedmiotu.
2. Sortuje przedmioty malejąco według tego stosunku.
3. Umieszcza w plecaku tyle sztuk najbardziej opłacalnego przedmiotu, ile się zmieści.
4. Przechodzi do kolejnego przedmiotu i powtarza proces do wyczerpania pojemności plecaka.

---

## Testy jednostkowe

Zostały zaimplementowane cztery testy jednostkowe:

1. **Poprawność liczby wygenerowanych przedmiotów.**
2. **Poprawność sumy wag i wartości dla znanej instancji.**
3. **Zwrócenie pustego rozwiązania, gdy żaden przedmiot nie spełnia ograniczeń.**
4. **Sprawdzenie, czy wylosowane wartości mieszczą się w zadanym przedziale (1–10).**

---

## ⚙Uruchamianie aplikacji

Wymagania:
- JDK 17+
- Maven

Kroki:
1. Otwórz projekt w IntelliJ IDEA lub innym IDE obsługującym Maven.
2. Uruchom `Main.java`.
3. (Opcjonalnie) Uruchom `ProblemTest.java`, aby wykonać testy jednostkowe.

---

## Wnioski

Projekt pozwolił na:
- Praktyczne zapoznanie się z Javą, Mavenem i JUnit.
- Zrozumienie implementacji algorytmów aproksymacyjnych.
- Rozwój umiejętności związanych z obiektowym podejściem do projektowania aplikacji.
