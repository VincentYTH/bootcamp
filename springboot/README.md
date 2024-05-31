### Spring boot
- @SpringBootApplication
- @ComponentScan
- @Component, @Controller(Interface), @Service, @Configuration(Interface)
- @Bean
- @Autowired
- @GetMapping, @PostMapping
- @RequestParam, @PathVariable
- @JsonProperty(DTO)
- @RestController(@Controller, @ResponseBody)
- @PostConstruct(right after bean creation, before the server start completed)
- @RestControllerAdvice(@ControllerAdvice + @ResponseBody)
- @ExceptionHandler
- @SpringBootTest, @WebMvcTest, @MockBean, @SpyBean
- mockMvc.perform(), andExpect()

### Maven Project - Java/Spring boot
### Lombok
- @Data (@ToString, @RequiredArgsConstructor, @Getter, @Setter, @EqualAndHashCode)
- @ToString
- @Getter
- @Setter
- @AllArgsConstructor
- @NoArgsConstructor
- @EqualAndHashCode
- @Builder

### others
- Custom Library (infra folder)
  - AprResp.class
  - UrlBuilder.class
  - BusinessRuntimeException.class, SysCode.class
  - GlobalExceptionHandler.class
- Mockito, Junit5, Hamcrest
- @Mock, @Spy, @InjectMock, @BeforeAll, @BeforeEach, @AfterAll, @AfterEach
- Mockito.when().thenResult(), verify(), assertEqual, assertThat, etc.
- RestTemplate

### Spring boot (Spring) vs Java
- SpringContext & Bean, DI & IOC (Dependency Injection & Inversion of Control)
- Global Exception Handling (Parent Concept - Exception.Class, RuntimeException.class) -- 原路不返回，全局攔截捕捉
- Auto Deserialization (JSON to Java Object) & Serialization (Java Object to JSON)
- application.yml
- Data Transfer Object(DTO)