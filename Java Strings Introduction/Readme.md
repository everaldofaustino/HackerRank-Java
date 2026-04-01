
# 📘 Java Strings Exercise

> 💬 "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable."  
> — Wikipedia: String (computer science)



## 🧠 Objective

This exercise is to test your understanding of **Java Strings**.

### 📝 Sample Declaration

```java
String myString = "Hello World!";
````

* 🔤 The elements of a String are called **characters**.
* 📏 The number of characters in a String is called the **length**, and it can be retrieved with the `String.length()` method.

---

## 📥 Problem Description

Given two strings of lowercase English letters, `s` and `t`, perform the following operations:

1. ➕ Sum the lengths of `s` and `t`.
2. 🔤 Determine if `s` is lexicographically larger than `t`
   (i.e.: does `s` come before `t` in the dictionary?).
3. 🔠 Capitalize the first letter in `s` and `t` and print them on a single line, separated by a space.

---

## 📌 Input Format

* 📄 The first line contains a string `s`.
* 📄 The second line contains another string `t`.

✔️ The strings are comprised of only lowercase English letters.

---

## 📤 Output Format

There are three lines of output:

1. ➕ For the first line, sum the lengths of `s` and `t`.
2. ❓ For the second line, write **Yes** if `s` is lexicographically greater than `t` otherwise print **No** instead.
3. 🔠 For the third line, capitalize the first letter in both `s` and `t` and print them on a single line, separated by a space.

---

## 🧪 Sample Input 0

```
hello
java
```

---

## ✅ Sample Output 0

```
9
No
Hello Java
```

---

## 💡 Explanation 0

* 📌 String `s` is `"hello"` and `t` is `"java"`.

* 📏 `s` has a length of **5**, and `t` has a length of **4**;
  ➕ the sum of their lengths is **9**.

* 🔤 When sorted alphabetically/lexicographically, `"hello"` precedes `"java"`;
  ❌ therefore, `s` is not greater than `t` and the answer is **No**.

* 🔠 When you capitalize the first letter of both `s` and `t` and print them separated by a space, you get:

```
Hello Java
```


