# Calculator

A simple Java Maven calculator project built with JUnit 5 unit tests.

## CI Status

<!-- Replace OWNER and REPO below with your GitHub username and repository name -->
[![CI](https://github.com/OWNER/REPO/actions/workflows/ci-calculator.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/ci-calculator.yml)

## Build & Test

```bash
mvn clean compile   # compile all Java source files
mvn test            # run all JUnit 5 unit tests
```

## Features

- Addition, subtraction, multiplication, division
- Division by zero throws `ArithmeticException`
- Unknown operator throws `IllegalArgumentException`
