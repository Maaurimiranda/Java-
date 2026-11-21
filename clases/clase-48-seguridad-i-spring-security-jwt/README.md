# Clase 48 — Seguridad I: Spring Security + JWT

**BLOQUE 6 — Spring Boot y desarrollo backend (clases 35–50)**

- Autenticación vs autorización.
- Arquitectura de Spring Security: filter chain, `SecurityFilterChain`, `AuthenticationManager`, `UserDetailsService`, `PasswordEncoder` (BCrypt).
- **JWT**: estructura (header.payload.signature), firma, claims, expiración. Access token + refresh token. Dónde guardarlo en el cliente y por qué localStorage es discutible.
- Filtro JWT custom, `SecurityContextHolder`.
- Roles y permisos: `@PreAuthorize`, `hasRole` vs `hasAuthority`.
- Logout con blacklist de tokens.
