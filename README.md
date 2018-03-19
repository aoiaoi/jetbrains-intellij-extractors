# [wip] jetbrains-intellij-extractors

## About

Data extractor for IntelliJ-based IDEs.

### Examples

```
> select * from user;
```

| id | name | created_at |
|---:|:---:|:---:|
| 1 | hoge | 2018-01-01 00:00:00 |
| 2 | fuga | 2018-02-01 12:00:00 |
| 3 | piyo | 2018-03-01 23:59:59 |

#### Markdown-Table-Groovy.md.groovy

The extractor will output:

```Markdown
| id | name | created_at |
|---:|:---:|:---:|
| 1 | hoge | 2018-01-01 00:00:00 |
| 2 | fuga | 2018-02-01 12:00:00 |
| 3 | piyo | 2018-03-01 23:59:59 |
```

#### PHP-Array-Groovy.php.groovy

The extractor will output:

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

#### Python-Dictionaries-Groovy.py.groovy

The extractor will output:

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

#### Textile-Table-Groovy.textile.groovy

The extractor will output:

```
| id | name | created_at |
|>. 1 |=. hoge |=. 2018-01-01 00:00:00 |
|>. 2 |=. fuga |=. 2018-02-01 12:00:00 |
|>. 3 |=. piyo |=. 2018-03-01 23:59:59 |
```

## Getting started
