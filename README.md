# [wip] jetbrains-intellij-extractors

## About

Data extractor for IntelliJ-based IDEs.

## Extractors

### ■ Markdown-Table.md.groovy

extract query results to Table in Markdown.

<details>
  <summary>Example</summary>
  
```sql
> select * from user;
```

| id | name | created_at |
|---:|:---:|:---:|
| 1 | hoge | 2018-01-01 00:00:00 |
| 2 | fuga | 2018-02-01 12:00:00 |
| 3 | piyo | 2018-03-01 23:59:59 |

This extractor extracts above result set as follows:

```Markdown
| id | name | created_at |
|---:|:---:|:---:|
| 1 | hoge | 2018-01-01 00:00:00 |
| 2 | fuga | 2018-02-01 12:00:00 |
| 3 | piyo | 2018-03-01 23:59:59 |
```
</details>

### ■ PHP-Array.php.groovy

extract query results to Array in PHP.

<details>
  <summary>Example</summary>
  
```sql
> select * from user;
```

| id | name | created_at |
|---:|:---:|:---:|
| 1 | hoge | 2018-01-01 00:00:00 |
| 2 | fuga | 2018-02-01 12:00:00 |
| 3 | piyo | 2018-03-01 23:59:59 |

This extractor extracts above result set as follows:

```php
[
    ['id' => 1, 
     'name' => 'hoge', 
     'created_at' => '2018-01-01 00:00:00'
    ],
    ['id' => 2, 
     'name' => 'fuga', 
     'created_at' => '2018-02-01 12:00:00'
    ],
    ['id' => 3, 
     'name' => 'piyo', 
     'created_at' => '2018-03-01 23:59:59'
    ],
];
```
</details>


### ■ Python-Dictionaries.py.groovy

extract query results to Dictionaries in Python.

<details>
  <summary>Example</summary>
  
```sql
> select * from user;
```

| id | name | created_at |
|---:|:---:|:---:|
| 1 | hoge | 2018-01-01 00:00:00 |
| 2 | fuga | 2018-02-01 12:00:00 |
| 3 | piyo | 2018-03-01 23:59:59 |

This extractor extracts above result set as follows:

```python
[
    {'id' : 1, 
     'name' : 'hoge', 
     'created_at' : '2018-01-01 00:00:00'
    },
    {'id' : 2, 
     'name' : 'fuga', 
     'created_at' : '2018-02-01 12:00:00'
    },
    {'id' : 3, 
     'name' : 'piyo', 
     'created_at' : '2018-03-01 23:59:59'
    },
]
```
</details>

### ■ Textile-Table.textile.groovy

extract query results to Table in Textile.

<details>
  <summary>Example</summary>
  
```sql
> select * from user;
```

| id | name | created_at |
|---:|:---:|:---:|
| 1 | hoge | 2018-01-01 00:00:00 |
| 2 | fuga | 2018-02-01 12:00:00 |
| 3 | piyo | 2018-03-01 23:59:59 |

This extractor extracts above result set as follows:

```
| id | name | created_at |
|>. 1 |=. hoge |=. 2018-01-01 00:00:00 |
|>. 2 |=. fuga |=. 2018-02-01 12:00:00 |
|>. 3 |=. piyo |=. 2018-03-01 23:59:59 |
```
</details>

## Installation

