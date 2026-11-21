# Clase 45 — Transacciones en Spring

**BLOQUE 6 — Spring Boot y desarrollo backend (clases 35–50)**

- `@Transactional`: cómo funciona por debajo (proxies AOP) y **por qué falla si te llamás a vos mismo dentro de la misma clase** (self-invocation).
- **Propagaciones**:
  - `REQUIRED` (default) — se une a la transacción existente o crea una nueva.
  - `REQUIRES_NEW` — suspende la actual y crea una nueva independiente. Caso de uso clásico: auditoría o logging que debe persistir aunque la operación principal haga rollback.
  - `SUPPORTS` — si hay transacción se une, si no corre sin transacción.
  - `MANDATORY` — exige que ya exista una, si no explota.
  - `NOT_SUPPORTED` — suspende la transacción y corre sin ella.
  - `NEVER` — explota si hay una transacción activa.
  - `NESTED` — savepoint dentro de la transacción padre.
- `isolation`, `readOnly`, `timeout`, `rollbackFor` / `noRollbackFor` (ojo: por defecto solo hace rollback con unchecked exceptions).
- Optimistic locking con `@Version` vs pessimistic locking.
