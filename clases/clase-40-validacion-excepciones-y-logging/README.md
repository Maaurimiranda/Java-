# Clase 40 — Validación, excepciones y logging

**BLOQUE 6 — Spring Boot y desarrollo backend (clases 35–50)**

- Bean Validation: `@NotNull`, `@NotBlank`, `@Size`, `@Email`, `@Min`, `@Past`, validadores custom, `@Valid`.
- **Manejo global de excepciones**: `@RestControllerAdvice`, `@ExceptionHandler`, respuesta de error estandarizada (RFC 7807 / Problem Details).
- Logging: SLF4J + Logback, niveles, logs estructurados, MDC con correlation ID, qué loguear y qué NUNCA loguear (passwords, tokens, datos personales).
