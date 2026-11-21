# Clase 35 — Servlets y el modelo web de Java

**BLOQUE 6 — Spring Boot y desarrollo backend (clases 35–50)**

- **Qué es un Servlet:** una clase Java que corre dentro de un contenedor web (Tomcat) y responde a requests HTTP. Ciclo de vida: `init()` → `service()` → `destroy()`.
- `HttpServletRequest` / `HttpServletResponse`, `web.xml`, mapeo de URLs.
- Por qué escribir servlets a mano es un dolor → nace Spring MVC. `DispatcherServlet` es el servlet único que Spring usa por debajo.
- HTTP a fondo: métodos, status codes, headers, content negotiation, stateless.
