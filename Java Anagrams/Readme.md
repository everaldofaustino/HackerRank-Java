# 🔤 Java Anagrams

> Solução do desafio **Java Anagrams** do HackerRank.

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

## 📖 Sobre o desafio

Duas strings são consideradas **anagramas** quando possuem exatamente os mesmos caracteres com a mesma frequência, independentemente da ordem em que aparecem.

Neste desafio, a comparação deve ser **case-insensitive**, ou seja, letras maiúsculas e minúsculas são tratadas como iguais.

### Exemplos

| String A | String B | Resultado |
|----------|----------|-----------|
| `anagram` | `margana` | ✅ Anagrams |
| `Hello` | `hello` | ✅ Anagrams |
| `anagramm` | `marganaa` | ❌ Not Anagrams |

---

## 🎯 Objetivo

Implementar o método

```java
static boolean isAnagram(String a, String b)
```

que retorna:

- `true` caso as duas strings sejam anagramas;
- `false` caso contrário.

---

## 🧠 Estratégia

A solução segue os seguintes passos:

1. Converter ambas as strings para letras minúsculas.
2. Verificar se possuem o mesmo tamanho.
3. Converter as strings em arrays de caracteres.
4. Ordenar ambos os arrays.
5. Comparar posição por posição.

Se todos os caracteres forem iguais, as strings são anagramas.






---

## 📊 Complexidade

### Tempo

A operação dominante é a ordenação.

```
O(n log n)
```

### Espaço

```
O(n)
```

Devido à criação dos arrays de caracteres.

---

## 🧪 Casos de teste

### Entrada

```
anagram
margana
```

### Saída

```
Anagrams
```

---

### Entrada

```
Hello
hello
```

### Saída

```
Anagrams
```

---

### Entrada

```
anagramm
marganaa
```

### Saída

```
Not Anagrams
```

---

## ✅ Alternativa mais eficiente

Também é possível resolver o problema utilizando um vetor de frequência de tamanho **26**, eliminando a necessidade de ordenar.

### Complexidade

| Método | Tempo | Espaço |
|---------|--------|---------|
| Ordenação | O(n log n) | O(n) |
| Frequência | **O(n)** | O(1) |

A abordagem por frequência é considerada a solução ideal em entrevistas técnicas.

---

## 🛠️ Tecnologias

- Java
- Arrays
- Manipulação de Strings
- Algoritmos
- Estruturas de Dados

---

## 📚 Conceitos abordados

- Strings
- Arrays
- Ordenação
- Frequência de caracteres
- Complexidade de algoritmos
- Case-insensitive comparison
- Programação competitiva

---

## 🚀 Como executar

Clone o repositório

```bash
git clone https://github.com/seu-usuario/java-anagrams.git
```

Entre na pasta

```bash
cd java-anagrams
```

Compile

```bash
javac Solution.java
```

Execute

```bash
java Solution
```

---

## 📂 Estrutura

```
java-anagrams/
│
├── Solution.java
├── README.md
└── LICENSE
```

---

## 🎓 Aprendizados

Este desafio reforça conceitos importantes como:

- Manipulação de Strings
- Conversão entre String e Array
- Ordenação de caracteres
- Comparação eficiente de dados
- Complexidade assintótica
- Implementação de algoritmos clássicos

---

## 🏆 Plataforma

Desafio disponível em:

**HackerRank — Java Anagrams**

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT.

---

⭐ Se este projeto foi útil, considere deixar uma estrela no repositório.