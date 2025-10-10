# Roman to Integer 🧩

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

| Symbol | Value |
|:------:|:------:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

For example:
- **2** is written as **II** in Roman numerals (just two ones added together).
- **12** is written as **XII**, which is simply **X + II**.
- **27** is written as **XXVII**, which is **XX + V + II**.

Roman numerals are usually written from **largest to smallest** from left to right.  
However, the numeral for four is not **IIII**. Instead, **IV** is used — the **I** comes before **V**, so we **subtract** 1 from 5.  
The same principle applies to the number nine, which is written as **IX**.

There are six instances where subtraction is used:

- `I` can be placed before `V (5)` and `X (10)` to make **4** and **9**.
- `X` can be placed before `L (50)` and `C (100)` to make **40** and **90**.
- `C` can be placed before `D (500)` and `M (1000)` to make **400** and **900**.



```java
Example 1:
    Input: s = "III"
    Output: 3
    Explanation: III = 3.
```

```java
Example 2:
    IInput: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
```

```java
Example 3:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

🧩 Constraints
- 1 <= s.length <= 15
- s contains only the characters 'I', 'V', 'X', 'L', 'C', 'D', 'M'
- It is guaranteed that s is a valid Roman numeral in the range [1, 3999]


# 🧩 Преобразование римских чисел в целые (на русском)

На Римские цифры представляются с помощью семи различных символов:

| Символ | Значение |
|:------:|:---------:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |


Например:
- **2** записывается как **II** (просто две единицы подряд).
- **12** записывается как **XII**, что равно **X + II**.
- **27** записывается как **XXVII**, то есть **XX + V + II**.

Обычно римские числа записываются **от большего к меньшему** слева направо.  
Однако число **4** записывается не как **IIII**, а как **IV** — символ **I** стоит перед **V**,  
поэтому мы **вычитаем** 1 из 5.  
Тот же принцип применяется и к числу **9**, которое записывается как **IX**.

Есть шесть случаев, когда используется вычитание:

- `I` может стоять перед `V (5)` и `X (10)` — чтобы образовать **4** и **9**.
- `X` может стоять перед `L (50)` и `C (100)` — чтобы образовать **40** и **90**.
- `C` может стоять перед `D (500)` и `M (1000)` — чтобы образовать **400** и **900**.  

**Ограничения**
1 <= s.length <= 15
s содержит только символы 'I', 'V', 'X', 'L', 'C', 'D', 'M'
Гарантируется, что s — корректное римское число в диапазоне [1, 3999]