# Clase 36 — Spring Core: IoC y DI

**BLOQUE 6 — Spring Boot y desarrollo backend (clases 35–50)**

- Inversión de control: qué problema resuelve realmente.
- Inyección por constructor / setter / campo — **y por qué constructor siempre**.
- `@Component`, `@Service`, `@Repository`, `@Configuration`, `@Bean`, `@Autowired`, `@Qualifier`, `@Primary`.
- Component scanning.
- **Ciclo de vida de un bean:** instanciación → populate → `BeanNameAware`/`BeanFactoryAware` → `@PostConstruct` → `InitializingBean` → init-method → listo → `@PreDestroy` → `DisposableBean`.
- Scopes: singleton, prototype, request, session.
