# Accounting-lib

A modular accounting library for Java, designed with clean architecture principles.  
The project separates contracts (`accounting-api`), core business logic (`accounting-core`), and adapters (persistence, reporting, integrations).

## Modules

- **accounting-api** → Public contracts (interfaces, records, DTOs).
- **accounting-core** → Core accounting engine (journal entries, ledger, validations).
- **accounting-adapter-inmemory** → In-memory adapter for testing and quick usage.
- **accounting-tests** → Cross-module integration tests.

## Prerequisites

- Java 21 (toolchain configured in Gradle)
- Gradle wrapper included in the repository

## Build

Use the provided Gradle wrapper:

```bash
./gradlew build          # compile & run tests
./gradlew test           # run tests only
```

## Design Guidelines

- `accounting-api` must stay framework-free (no Spring, JPA, Jackson) — keep it as minimal contracts-only.
- `accounting-core` depends only on minimal, stable libraries (Moneta, SLF4J, commons-lang).
- Modules are independent and publishable (Maven Central-ready via `maven-publish`).

## Versioning & Releases

This repository uses semantic versioning in the module artifacts. The default project version in the root Gradle is `1.0-SNAPSHOT`.

## License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.