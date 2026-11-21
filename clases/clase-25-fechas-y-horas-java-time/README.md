# Clase 25 — Fechas y horas (`java.time`)

**BLOQUE 3 — Java avanzado (clases 18–27)**

Para qué sirve cada uno:
- `LocalDate` — fecha sin hora ni zona (cumpleaños, vencimiento).
- `LocalTime` — hora sin fecha (horario de apertura).
- `LocalDateTime` — fecha + hora sin zona (turno médico local).
- `Instant` — punto en la línea de tiempo UTC (timestamps de eventos, logs).
- `ZonedDateTime` / `OffsetDateTime` — con zona horaria (vuelos, sistemas multi-país).
- `Duration` vs `Period` — diferencias basadas en tiempo vs en calendario.
- `DateTimeFormatter`, parseo, `ChronoUnit`.
- Legacy: `Date`, `Calendar`, `java.sql.Timestamp` — cómo convertir y por qué te los vas a cruzar sí o sí en código viejo.
- **Regla de oro:** guardá siempre en UTC, mostrá en la zona del usuario.
