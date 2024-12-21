### Ćwiczenia 1
Poznanie podstaw języka i klas.
### Ćwiczenia 2
#### Zadanie 1
Napisz program, który tworzy listę tablicową 10 liczb całkowitych, a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia.
#### Zadanie 2
Napisz statyczną metodę `minimumValue`, która przyjmuje listę tablicową liczb całkowitych jako argument i zwraca najmniejszą liczbę w liście tablicowej. Przyjmij, że lista tablicowa zawsze będzie miała co najmniej jeden element. Stwórz przypadek testowy.
#### Zadanie 3
Napisz statyczną metodę `average`, która przyjmuje listę tablicową liczb zmiennoprzecinkowych jako argument i zwraca średnią arytmetyczną wszystkich liczb. Jeżeli lista tablicowa jest pusta, zwróć 0. Stwórz przypadek testowy.
#### Zadanie 4
Napisz statyczną metodę `countZeros`, która przyjmuje listę tablicową liczb całkowitych jako argument i zwraca liczbę wystąpień zera w liście tablicowej. Na przykład, dla [0, 1, 2, 0, 3, 0, 4], funkcja powinna zwrócić 3. Stwórz przypadek testowy.
#### Zadanie 5
Napisz statyczną metodę, która przyjmuje napis jako argument i zwraca ten napis w odwrotnej kolejności. Stwórz przypadek testowy.
#### Zadanie 6
Używając metody `charAt`, napisz statyczną metodę, która sprawdza, czy dany napis zaczyna się i kończy tym samym znakiem. Stwórz przypadek testowy.
#### Zadanie 7
Napisz statyczną metodę, która przyjmuje napis jako argument i zwraca ten napis z zamienioną pierwszą i ostatnią literą. Stwórz przypadek testowy.
#### Zadanie 8
Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą `n`. Używając klasy `StringBuilder`, zbuduj i wypisz piramidę o wysokości `n`, gdzie każdy poziom piramidy składa się z podanego znaku. Na przykład dla znaku `*` i `n=3`, oczekiwany wynik to:
```
  *
 ***
*****
```

### Ćwiczenia 3
#### Zadanie 1
Napisz klasę `Book`, która będzie zawierać trzy pola: `title`, `author`, `publicationYear`. Następnie zaimplementuj dwa konstruktory - jeden domyślny, który nie przyjmuje żadnych argumentów, i drugi, który przyjmuje trzy argumenty odpowiadające polom klasy. W przypadku drugiego konstruktora, nazwy parametrów muszą być takie same jak nazwy pól. Sprawdź czy jesteś w stanie prawidłowo przypisać wartości do pól klasy używając słowa kluczowego `this`.
#### Zadanie 2
Zaprojektuj klasę `Person`, która będzie zawierać dwa pola: `firstName`, `lastName`. Zaimplementuj konstruktor, który przyjmuje dwa argumenty odpowiadające polom klasy. Nazwy parametrów muszą być takie same jak nazwy pól. Spróbuj przypisać wartości do pól klasy bez używania słowa kluczowego `this`. Czy jest to możliwe? Jeżeli nie, to dlaczego?
#### Zadanie 3
Zaprojektuj klasę `Square`, która posiada pole `side` oraz konstruktor, który umożliwia ustawienie wartości tego pola. Następnie napisz drugi konstruktor, który nie przyjmuje żadnych argumentów, a jedynie wywołuje pierwszy konstruktor z wartością domyślną 1.
#### Zadanie 4
Stwórz dwie klasy w tym samym pakiecie: `Employee` i `Company`. Klasa `Employee` powinna mieć pole bez modyfikatora dostępu. Spróbuj uzyskać dostęp do tego pola z klasy `Company`.
#### Zadanie 5
Stwórz klasę `Coach`, która jest zadeklarowana jako `private`. Spróbuj stworzyć obiekt `Coach` w klasie `Main`. Jaki jest rezultat?
#### Zadanie 6
Zdefiniuj klasę `Car`, która ma pola: `brand`, `model` i `productionYear`. Klasa powinna zawierać dwa konstruktory: pierwszy przyjmujący wszystkie trzy parametry, a drugi tylko markę i model. Drugi konstruktor powinien wywoływać pierwszy, przekazując mu domyślną wartość `productionYear` jako aktualny rok.
#### Zadanie 7
Utwórz klasę `Point` z dwoma polami: `x` i `y` reprezentującymi współrzędne na płaszczyźnie. Napisz metodę `distance(Point otherPoint)`, która oblicza odległość między bieżącym punktem a innym punktem. Stwórz przypadek testowy, aby wywołać metodę co najmniej jeden raz.

### Ćwiczenia 4
#### Zadanie 1
Stwórz klasę `Mathematics`, która posiada pole statyczne `PI`, które przechowuje przybliżoną wartość liczby . Upewnij się, że wartość tego pola jest niemodyfikowalna. Stwórz przypadek testowy.
#### Zadanie 2
Stwórz klasę `Product`, która zawiera pole statyczne `numberOfProducts` oraz pole statyczne `MAX_PRODUCTS`. Pole `numberOfProducts` będzie służyć do zliczania ilości utworzonych produktów, a `MAX_PRODUCTS` do ograniczenia ich liczby. Oznacz tylko jedno z tych pól słowem kluczowym `final` i zastanów się nad konsekwencjami tego wyboru.
#### Zadanie 3
Wykonaj poniższe czynności:
- Zdefiniuj klasę `Person`, która posiada następujące pola: `firstName`, `lastName` i `age`.
- Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
  - Wiek osoby (`age`) nie powinien być ujemny. W przypadku podania wartości ujemnej dla wieku, ustaw wiek osoby na zero.
  - Pola `firstName` i `lastName` nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null dla tych pól, ustaw odpowiednio pusty napis.
- Dodaj metodę `toString()`, która zwraca informacje o osobie w formacie: `"Person: [firstName] [lastName], Age: [age]."`. Zwróć uwagę na wielkość liter i znaki interpunkcyjne.
- Dodaj metodę `equals()`, która porównuje dwie osoby na podstawie ich pól `firstName`, `lastName` i `age`. Dwie osoby są uważane za identyczne, jeśli wszystkie trzy pola są takie same.
- Dodaj metodę `hashCode()`, która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna być zgodna z metodą `equals()`
#### Zadanie 4
Wykonaj poniższe czynności:
- Zdefiniuj klasę `Vehicle`, która posiada następujące pola: `brand`, `model` i `yearOfProduction`.
- Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
  - Rok produkcji (`yearOfProduction`) nie powinien być większy od aktualnego roku. W przypadku podania wartości większej, ustaw rok produkcji na aktualny rok.
  - Pola `brand` i `model` nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null dla tych pól, ustaw odpowiednio pusty napis.
- Dodaj metodę `toString()`, która zwraca informacje o pojeździe w formacie: `"Vehicle: [brand] [model], Year: [yearOfProduction]."`.
- Dodaj metodę `equals()`, która porównuje dwa pojazdy na podstawie ich pól brand, model i yearOfProduction.
- Dodaj metodę `hashCode()`, która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna być zgodna z metodą `equals()`
#### Zadanie 5
Wykonaj poniższe czynności:
- Stwórz klasę `Results` (wyniki testu) z prywatnymi polami: `firstName`, `lastName` oraz `results` (jako tablica typu `int`). Dodaj konstruktor, który przyjmuje `firstName`, `lastName` oraz rozmiar tablicy jako argumenty. Dodaj metody dostępowe (gettery i settery) oraz metodę `addResult(int index, int result)`, która dodaje wynik testu na podanym indeksie. Dodaj również metodę `averageResult()` do obliczania i zwracania średniego wyniku.
- Dodaj metodę `toString()`, która zwraca informacje o uczniu, jego wynikach oraz zawartość tablicy `results` w formacie: `"Results for [firstName] [lastName]: Average Score = [averageResult], Results: [result1, result2, ...]. "`. Ponadto dodaj metodę `equals()`, która porównuje dwa obiekty klasy `Results` na podstawie ich pól `firstName`, `lastName` oraz zawartości tablicy `results`. Dwa obiekty są uważane za identyczne, jeśli wszystkie pola i wyniki testów w tablicach są takie same. Dodaj także metodę `hashCode()`, która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna być zgodna z metodą `equals()`

### Ćwiczenie 5
#### Zadanie 0
Wykonaj kolejno poniższe czynności:
- Stwórz klasę bazową `Person` z prywatnym polem `firstName` oraz chronionym polem `lastName`. Następnie stwórz klasę `Employee`, która dziedziczy po klasie `Person`. W klasie `Employee` próbuj odnieść się do obu pól i zauważ, które z nich są dostępne.
- Na bazie klasy `Person` z poprzedniego podpunktu, stwórz metody dostępowe (gettery) dla obu pól. W klasie `Employee` stwórz metodę `displayData`, która korzysta z tych metod dostępowych, aby wypisać informacje o pracowniku. Zastanów się, dlaczego metody dostępowe są używane do dostępu do prywatnych pól.
#### Zadanie 1
Stwórz klasę `Tool` z chronionym konstruktorem, który przyjmuje nazwę narzędzia. Następnie stwórz klasę potomną `Hammer`, która dziedziczy po klasie `Tool`. W klasie `Hammer` stwórz konstruktor, który korzysta z konstruktora klasy bazowej. Zastanów się, dlaczego używając modyfikatora `private` dla konstruktora klasy bazowej, taki scenariusz nie byłby możliwy.
#### Zadanie 2
Stwórz dwa różne pakiety: `animals` i `mammals`. W pakiecie animals stwórz klasę bazową `Animal` z chronionym polem `species` i prywatnym polem `age`. W pakiecie `mammals` stwórz klasę `Dog`, która dziedziczy po klasie `Animal`. Spróbuj odnieść się w klasie `Dog` do obu pól z klasy bazowej i zauważ, które z nich są dostępne.
#### Zadanie 3
Wykonaj kolejno poniższe czynności:
- Stwórz klasę bazową `Vehicle` z metodą `drive`, która wypisuje “The vehicle is moving.”. Następnie stwórz klasę potomną `Car`, która nadopisuje metodę `drive` tak, by wypisywała “The car is moving.”. Utwórz obiekt klasy `Car` i wywołaj jego metodę `drive`, aby zaobserwować wynik.
- Na bazie klasy `Vehicle` z poprzedniego podpunktu, w klasie `Car`, nadpisz metodę `drive` tak, by wywoływała oryginalną metodę z klasy bazowej i dodatkowo wypisywała informacje specyficzne dla klasy `Car`. Użyj słowa kluczowego `super`, aby wywołać metodę z klasy bazowej.
#### Zadanie 4
Stwórz klasę `Calculator` z metodą `add`, która przyjmuje dwa argumenty typu `int` i zwraca ich sumę. Następnie stwórz klasę potomną `ExtendedCalculator`, która nadpisuje metodę `add` w taki sposób, by przyjmowała trzy argumenty typu `int` i zwracała ich sumę. Zastanów się, czy to faktycznie nadpisywanie metody, czy może coś innego.
#### Zadanie 5
Stwórz klasę bazową `Base` z metodą statyczną `info`, która wypisuje “This is the base class.”. Następnie stwórz klasę potomną `Child` i próbuj przesłonić metodę statyczną `info` tak, by wypisywała “This is the child class.”. Zastanów się nad zachowaniem tak przesłoniętych metod i dlaczego takie przesłanianie jest inaczej traktowane.
#### Zadanie 6
Stwórz klasę bazową o nazwie `Animal` z polem `name` oraz konstruktor z domyślnym przypisaniem nazwy do “Unknown”. Następnie stwórz klasę `Dog`, która dziedziczy po klasie `Animal`. Nie twórz w niej dodatkowego konstruktora. Sprawdź, jakie zwierzę zostanie utworzone, gdy stworzysz nową instancję klasy `Dog` (Użyj metody `getClass().getName()`).
#### Zadanie 7
Utwórz klasę `Computer` z polami `manufacturer`, `model` oraz `partsPrices` (jako ArrayList typu `Double`). Utwórz klasy `Laptop` i `Desktop`, które dziedziczą po klasie `Computer`. Klasa Laptop powinna mieć dodatkowe pole `weight`, a klasa `Desktop` pole `caseType`. Dodaj konstruktory, metody gettery i settery, metodę `toString()`, `equals()` oraz `hashCode()` dla każdej z klas. Napisz program testujący zdefiniowane klasy i metody.

### Ćwieczenie 6
#### Zadanie 1
Stwórz rekord `BookDTO`, który reprezentuje książkę w sklepie internetowym. Powinien zawierać takie informacje jak `title`, `author`, `price` i `yearOfPublication`. Następnie stwórz kilka instancji tego rekordu, reprezentujących różne książki.
#### Zadanie 2
Utwórz rekord `Address`, który zawiera `street`, `houseNumber`, `postalCode` i `city`. Następnie, stwórz rekord Person, który oprócz podstawowych informacji o osobie (np. `firstName`, `lastName`) zawiera również pole typu `Address`. Stwórz przypadek testowy.
#### Zadanie 3
Stwórz klasę `PointC` reprezentującą punkt na płaszczyźnie 2D z polami `x` i `y`. Następnie, stwórz rekord `PointR` z tymi samymi polami. Dodaj metody umożliwiające konwersję z instancji klasy na rekord i odwrotnie. Stwórz przypadek testowy.
#### Zadanie 4
Stwórz rekord `Car`, który zawiera `brand`, `model` i `fuelConsumptionPer100km`. Dodaj metodę `fuelCost(double fuelPrice, double distance)`, która oblicza i zwraca koszt podróży na podstawie podanej ceny paliwa oraz dystansu. Stwórz przypadek testowy.
#### Zadanie 5
Stwórz rekord `Student`, który reprezentuje imię, nazwisko i listę ocen ucznia. Wprowadź metodę `averageGrades()`, która oblicza średnią ocen ucznia. Stwórz przypadek testowy.
#### Zadanie 6
Stwórz rekord `BankAccount`, który zawiera numer konta oraz saldo. Dodaj konstruktor, który pozwala na tworzenie konta tylko z numerem, przy czym domyślne saldo wynosi 0. Stwórz przypadek testowy.

### Ćwiczenie 7 - powtórka przed kolokwium
#### Zadanie 1
Napisz statyczną metodę `minimumValue`, która przyjmuje listę tablicową liczb wymiernych jako argument i zwraca najmniejszą liczbę w liście tablicowej. Przyjmij, że lista tablicowa zawsze będzie miała co najmniej jeden element. Stwórz przypadek testowy.
#### Zadanie 2
Napisz statyczną metodę `oddElementsSum`, która przyjmuje tablicę liczb całkowitych jako argument i zwraca sumę wszystkich nieparzystych liczb w tablicy. Jeżeli w tablicy nie ma żadnych nieparzystych liczb, funkcja powinna zwrócić 0. Stwórz przypadek testowy.
#### Zadanie 3
Stwórz klasę bazową o nazwie `Vehicle` z polami: `brand` i `model`. Klasa ta powinna posiadać konstruktor przyjmujący oba te parametry. Następnie stwórz klasę potomną o nazwie `Car`, która dziedziczy po klasie `Vehicle`. Klasa `Car` powinna posiadać dodatkowe pole `numberOfDoors`. Stwórz konstruktor dla klasy `Car`, który przyjmuje wszystkie trzy parametry i korzysta z konstruktora klasy bazowej. Stwórz przypadek testowy.
#### Zadanie 4
Stwórz klasę bazową `Computer` z publiczną metodą `start`, która wypisuje “Computer started.”. Stwórz klasę potomną `Laptop`, która nadpisuje metodę `start`, wypisując informację "Laptop started"
#### Zadanie 5
Zaprojektuj klasę `Car`, która posiada pola: `brand`, `model` i `productionYear`. Napisz konstruktor, który przyjmuje trzy argumenty. Zadaniem konstruktora jest sprawdzenie, czy `productionYear` nie jest większy niż aktualny rok oraz czy `brand` i `model` nie są puste i nullem (w przypadku niepoprawnych wartości z osobna ustaw pusty napis lub bieżący rok).\
\
Wskazówka: wykorzystaj `Calendar.getInstance().get(Calendar.YEAR)` do pobrania aktualnego roku.
#### Zadanie 6
Wykonaj poniższe czynności:
- Zdefiniuj klasę `Vehicle`, która posiada następujące pola: `brand`, `model` i `yearOfProduction`.
- Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
  - Rok produkcji (`yearOfProduction`) nie powinien być większy od aktualnego roku. W przypadku podania wartości większej, ustaw rok produkcji na aktualny rok.
  - Pola `brand` i `model` nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null dla tych pól, ustaw odpowiednio pusty napis.
- Dodaj metodę `toString()`, która zwraca informacje o pojeździe w formacie: `"Vehicle: [brand] [model], Year: [yearOfProduction]."`.
- Dodaj metodę `equals()`, która porównuje dwa pojazdy na podstawie ich pól `brand`, `model` i `yearOfProduction`.
- Dodaj metodę `hashCode()`, która generuje kod hash dla odpowiedniego obiektu. Metoda ta powinna być zgodna z metodą `equals()`

### Ćwiczenie 8
Kolokwium z poprzednich ćwiczeń prócz ćwiczeń z rekordów tj. ćwiczenie 6.

### Ćwieczenie 9
#### Zadanie 1
Zdefiniuj abstrakcyjną klasę `ComputerGraphic` z polami `width`, `height` typu `int` oraz `fileName` typu `String`. Dodaj abstrakcyjne metody `loadFile()` i `saveFile()`. Następnie zdefiniuj klasy `Bitmap` i `Vector`, które dziedziczą po klasie `ComputerGraphic` i implementują metody `loadFile()` oraz `saveFile()`. Stwórz listę tablicową odpowiednich 5 obiektów i wywołaj dla nich napisaną metodę.
#### Zadanie 2
Zdefiniuj abstrakcyjną klasę `ElectronicDevice` z polami `manufacturer` typu `String`, `model` typu `String` oraz `productionYear` typu `int`. Dodaj abstrakcyjne metody `turnOn()` i `turnOff()`. Następnie zdefiniuj klasy `Smartphone`, `Television` i `Laptop`, które dziedziczą po klasie `ElectronicDevice` i implementują metody `turnOn()` oraz `turnOff()`. Stwórz listę tablicową odpowiednich 5 obiektów i wywołaj dla nich napisaną metodę.
#### Zadanie 3
W jednym projekcie wykonaj czynności:
- A. Stwórz abstrakcyjną klasę `Product` zawierającą publiczną abstrakcyjną metodę `getPrice()`, która nie przyjmuje argumentów i zwraca `double`. Klasę umieść w pakiecie `store`.
- B.  Utwórz dwie klasy pochodne od `Product`: `Book` i `Clothing`. W obu klasach nadpisz metodę `getPrice()`. Dla `Book` niech zwraca cenę `29.99`, a dla `Clothing` niech zwraca cenę `59.99`.
- C.  W klasie `TestProduct` w pakiecie `store` utwórz tablicę typu `Product` i zainicjuj ją 5 instancjami `Book` i `Clothing`. Iteruj po tablicy wywołując metodę `getPrice()` dla każdego produktu (wyświetl ceny na standardowym wyjściu).
#### Zadanie 4
W jednym projekcie wykonaj czynności:
- A. Stwórz abstrakcyjną klasę `Game` zawierającą publiczną abstrakcyjną metodę `getRating()`, która nie przyjmuje argumentów i zwraca `double`. Klasę umieść w pakiecie `entertainment`.
- B. Utwórz dwie klasy pochodne od `Game`: `StrategyGame` i `AdventureGame`. W obu klasach nadpisz metodę `getRating()`. Dla `StrategyGame` niech zwraca ocenę `8.5`, a dla `AdventureGame` niech zwraca ocenę `7.3`.
- C. W klasie `TestGame` w pakiecie `entertainment` utwórz listę tabllicową typu `Game` i zainicjalizuj ją 5 instancjami `StrategyGame` i `AdventureGame`. Iteruj po liście tablicowej wywołując metodę `getRating()` dla każdej gry (wyświetl oceny na standardowym wyjściu).
