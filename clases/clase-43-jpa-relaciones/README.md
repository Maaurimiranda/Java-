# Clase 43 — JPA: relaciones

**BLOQUE 6 — Spring Boot y desarrollo backend (clases 35–50)**

- `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`, `@JoinColumn`, `@JoinTable`.
- Lado propietario vs lado inverso, `mappedBy`.
- `FetchType.LAZY` vs `EAGER`, `LazyInitializationException`.
- **Problema N+1**: cómo detectarlo y resolverlo (`JOIN FETCH`, `@EntityGraph`, batch size).
- `CascadeType`, `orphanRemoval`.
