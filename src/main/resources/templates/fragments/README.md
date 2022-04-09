# Thymeleaf Custom Attributes
- **insert** – inserts content inside the tag
- **replace** – replaces the current tag with the tag defining the fragment
```html
<h1 th:text="${testMessage}"></h1>
```
# Expression Utility Objects
[More info here](https://www.baeldung.com/spring-thymeleaf-3-expressions)
- **dates**: utility methods for java.util.Date objects
- **calendars**: similar to #dates, used for java.util.Calendar objects
- **numbers**: utility methods for formatting numeric objects
- **strings**: utility methods for String objects
- **objects**: utility methods for Java Object class in general
- **bools**: utility methods for boolean evaluation
- **arrays**: utility methods for arrays
- **lists**: utility methods for lists
- **sets**: utility methods for sets
- **maps**: utility methods for maps
- **aggregates**: utility methods for creating aggregates on arrays or collections
- **messages**: utility methods for obtaining externalized messages inside variables expressions
```html
<p th:text="${#strings.toUpperCase(testMessage)}"></p>
```

# Attribute concatenation
Both of these work
```html
<a th:href="|mailto: ${email}|" />
<a th:href="'mailto:'+ ${email}" />
```