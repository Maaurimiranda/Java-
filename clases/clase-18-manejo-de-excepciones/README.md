# Clase 18 — Manejo de excepciones

**BLOQUE 3 — Java avanzado (clases 18–27)**

- Jerarquía: `Throwable` → `Error` / `Exception` → `RuntimeException`.
- Checked vs unchecked: el debate real y qué se usa en la industria.
- `try/catch/finally`, multi-catch, **try-with-resources** y `AutoCloseable`.
- `throw` vs `throws`. Excepciones custom con contexto útil.
- Antipatrones: `catch (Exception e) {}`, tragarse el stacktrace, usar excepciones para control de flujo.
