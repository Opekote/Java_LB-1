<h2>Програма вміє:</h2>

Додавати нову книгу в бібліотеку.
Показувати всі книги в бібліотеці.
Шукайти книгу за її назвою.
Видаляти книгу з бібліотеки за її номером ISBN.

Стоврена для того аби керувати бібліотекою книг

<h2>Опис роботи:</h2>
Є два класи, Book і Library.
Book власне класс книги.Складається з полів, геттерів і конструктора
Там є геттери для усіх полів.

<h3>Клас Library має методи:</h3>
<strong>getibrary</strong> - дозволяє отримати ArrayList в якому будуть всі наявні книги.
<strong>showAllBooks</strong> - виводить всі елементи із ArrayList в консоль
<strong>findBookViaName</strong> - шукає книгу по заданому імені книги і повертає саму книгу для майбутньої роботи, якщо її немає видає IllegalArgumentException ловить його і повертає null інакше повертає книгу і виводить результат пошуку у консоль. </br>
<strong>removeBook</strong> - якщо знаходить книгу видаляє її, виводить "Book removed" і повертаж true.Інакше кидаєть і ловиться IllegalArgumentException і повертає false

<h2>Про тести:</h2>
<h3>LibraryTest</h3>
<strong>testAddBook</strong>: Перевіряє додавання книги до бібліотеки та переконується, що після додавання книга знаходиться в бібліотеці.

<strong>testFindBookViaName</strong>: Перевіряє метод findBookViaName для пошуку книги за назвою. Спершу додаються дві книги до бібліотеки, а потім перевіряється, чи вдається знайти книгу за назвою.

<strong>testFindBookViaNameNotFound</strong>: Перевіряє метод findBookViaName для випадку, коли книгу з вказаною назвою не знайдено. Очікується, що метод поверне null.

<strong>testRemoveBook</strong>: Перевіряє видалення книги з бібліотеки за допомогою методу removeBook, перевіряє, що метод повертає правильне значення і переконується, що книга більше не міститься в бібліотеці.

<strong>testRemoveBookNotFound</strong>: Перевіряє метод removeBook для випадку, коли книгу з вказаним ISBN не знайдено. Очікується, що метод поверне false.

Перевірені сценарії можуть гаратнувати правильніть роботи програми.


