# Clase 42 — JPA e Hibernate: fundamentos

**BLOQUE 6 — Spring Boot y desarrollo backend (clases 35–50)**

- Qué es JPA (especificación) vs Hibernate (implementación) vs Spring Data JPA (abstracción encima).
- **ORM**: cómo se mapea una clase a una tabla. `EntityManager`, persistence context, estados de una entidad (transient, managed, detached, removed).
- Anotaciones: `@Entity`, `@Table`, `@Id`, `@GeneratedValue` (`IDENTITY` vs `SEQUENCE` vs `AUTO` vs `UUID`), `@Column` (`unique`, `nullable`, `length`), `@Enumerated`, `@Temporal`, `@Transient`.
- UUID como PK: ventajas y el problema de fragmentación de índices.
- `ddl-auto`: por qué `update` está bien en dev y es un suicidio en prod → Flyway/Liquibase.
- Ver el SQL generado (`show-sql`, `format_sql`) y entenderlo.
