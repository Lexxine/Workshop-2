# Warsztat DAO

## Opis Projektu

Projekt tworzy obiektową warstwę dostępu do danych (DAO) dla aplikacji. W ramach projektu budowana jest klasa `UserDao`, która umożliwia operacje CRUD (Create, Read, Update, Delete) na bazie danych. Dane przechowywane są w bazie danych o nazwie `workshop2` w tabeli `users`.

## Klasy w Projekcie

### Klasa `DbUtil`

**Opis:**
Klasa `DbUtil` zarządza połączeniem z bazą danych. Umożliwia nawiązywanie połączeń z bazą danych MySQL za pomocą statycznej metody `getConnection`.

**Funkcjonalność:**
- Zarządzanie połączeniem z bazą danych.
- Umożliwienie aplikacji wykonywania operacji na bazie danych.

### Klasa `User`

**Opis:**
Klasa `User` reprezentuje użytkownika w systemie. Przechowuje dane użytkownika, takie jak identyfikator, nazwa użytkownika, adres e-mail oraz hasło.

**Atrybuty:**
- `id`: Unikalny identyfikator użytkownika.
- `userName`: Nazwa użytkownika.
- `email`: Adres e-mail.
- `password`: Hasło użytkownika.

**Funkcjonalność:**
- Przechowywanie danych użytkownika.
- Udostępnianie metod do pobierania i modyfikowania tych danych (gettery i settery).

### Klasa `UserDao`

**Opis:**
Klasa `UserDao` implementuje wzorzec DAO (Data Access Object) i umożliwia wykonywanie operacji CRUD na tabeli `users` w bazie danych.

**Funkcjonalności:**
- **Tworzenie użytkownika:** Dodaje nowego użytkownika do bazy danych i ustawia identyfikator na podstawie wygenerowanego klucza.
- **Aktualizacja użytkownika:** Zmienia dane istniejącego użytkownika w bazie danych na podstawie jego identyfikatora.
- **Usuwanie użytkownika:** Usuwa użytkownika z bazy danych na podstawie jego identyfikatora.
- **Wyszukiwanie wszystkich użytkowników:** Wczytuje wszystkie wiersze z tabeli `users` i zamienia je na obiekty `User`.

### Metoda Pomocnicza `addToArray`

**Opis:**
Metoda `addToArray` umożliwia dodawanie nowego obiektu `User` do istniejącej tablicy użytkowników.

**Funkcjonalność:**
- Umożliwia dynamiczne dodawanie nowych elementów do tablicy użytkowników.
- Zapewnia, że tablica ma odpowiednią długość po dodaniu nowego obiektu.

## Testowanie Metod

### Klasa `CreateUser`

**Opis:**
Testuje proces tworzenia nowego użytkownika w bazie danych.

**Funkcjonalność:**
- Inicjalizuje obiekt `User` z nowymi danymi.
- Używa metody `create()` z klasy `UserDao` do dodania użytkownika do bazy danych.
- Sprawdza, czy użytkownik został poprawnie zapisany i czy identyfikator został przydzielony.

### Klasa `ReadUser`

**Opis:**
Testuje odczytywanie danych użytkownika z bazy danych na podstawie jego identyfikatora.

**Funkcjonalność:**
- Wyszukuje użytkownika za pomocą metody `read()` z klasy `UserDao`.
- Sprawdza, czy dane użytkownika są poprawnie pobierane i wyświetlane.
- W przypadku, gdy użytkownik o podanym ID nie istnieje, wyświetla odpowiedni komunikat.

### Klasa `ChangeUser`

**Opis:**
Testuje aktualizację danych istniejącego użytkownika w bazie danych.

**Funkcjonalność:**
- Inicjalizuje obiekt `User` z nowymi danymi.
- Używa metody `update()` z klasy `UserDao` do zmiany danych użytkownika.
- Sprawdza, czy zmiany zostały poprawnie wprowadzone do bazy danych.

### Klasa `DeleteUser`

**Opis:**
Testuje usuwanie użytkownika z bazy danych na podstawie jego identyfikatora.

**Funkcjonalność:**
- Używa metody `delete()` z klasy `UserDao` do usunięcia użytkownika z bazy danych.
- Sprawdza, czy użytkownik został poprawnie usunięty.

### Klasa `ShowAllUsers`

**Opis:**
Testuje wyświetlanie wszystkich użytkowników z bazy danych.

**Funkcjonalność:**
- Pobiera wszystkich użytkowników za pomocą metody `findAll()` z klasy `UserDao`.
- Wyświetla dane wszystkich użytkowników.
- Sprawdza, czy wszystkie dane użytkowników są poprawnie pobierane i prezentowane.

