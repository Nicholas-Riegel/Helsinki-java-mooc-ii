8.2 HASHMAP
-----------

1. .put()

```java

    HashMap<String, String> postalCodes = new HashMap<>();
    postalCodes.put("00710", "Helsinki");

    System.out.println(postalCodes.get("00710"));

```
Sample output
Helsinki

2. .get()

```java

    HashMap<String, String> numbers = new HashMap<>();
    numbers.put("One", "Uno");
    numbers.put("Two", "Dos");

    String translation = numbers.get("One");
    System.out.println(translation);

    System.out.println(numbers.get("Two"));
    System.out.println(numbers.get("Three"));
    System.out.println(numbers.get("Uno"));

```
Sample output
Uno
Dos
null
null

3. .keySet()

```java

    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for(String bookTitle : this.directory.keySet()) {
            if(!bookTitle.contains(titlePart)) {
                continue;
            }

            // if the key contains the given string
            // we retrieve the value related to it
            // and add it tot the set of books to be returned

            books.add(this.directory.get(bookTitle));
        }

        return books;
    }

```

4. .values()

```java

    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for(Book book : this.directory.values()) {
            if(!book.getName().contains(titlePart)) {
                continue;
            }

            books.add(book);
        }

        return books;
    }

```

8.3 SIMILARITY OF OBJECTS
-------------------------






1. HASHCODE
For objects to function correctly as keys in a HashMap, it is important to override both hashCode() and equals() in a way that ensures two logically equal objects (as determined by equals()) also have the same hash code. 

Example: 

```java

    HashMap<Book, String> borrowers = new HashMap<>();

    Book book = new Book("War and Peace", "Tolstoy");

    borrowers.put(book, "Pekka");

    System.out.println(borrowers.get(new Book("War and Peace", "Tolstoy")));

```

This will return null, because the new book is given a new and differnt hashCode from Pakka's book.

So what we want is all objects with this title to be given the same hashcode, so that the get() and containsKey() methods can go to that hashcode and use the equals method to determine if there is any key in there that's equivalent to the newly created book. 

2. POLYMORPHISM
Refers to the idea that the same method name can do different things in the case where one class is derived from another. 
If an object instantiates a sub-class and super-class that both have methods of the same name, then the method of the sub-class will fire, because it overrides the method of the super-class.

If an object of a sub-class is assigned to a variable of the super-class, only the methods of the super-class will be available to it. 

But if the super-class has a method of the same name in the sub class then the method of the sub-class will fire, even if the variable is of the super-class.

Example 1:

```java

    Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    ollie.credits();        // DOESN'T WORK!
    ollie.study();              // DOESN'T WORK!
    System.out.println(ollie);   // ollie.toString() WORKS

```

Example 2:

```java

    Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    System.out.println(ollie);
    
    Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    System.out.println(olliePerson);
    
    Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    System.out.println(ollieObject);

    Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
    System.out.println(alice);

```
Ollie
  6381 Hollywood Blvd. Los Angeles 90028
  credits 0
Ollie
  6381 Hollywood Blvd. Los Angeles 90028
  credits 0
Ollie
  6381 Hollywood Blvd. Los Angeles 90028
  credits 0
Alice
  177 Stewart Ave. Farmington, ME 04938
  credits 0