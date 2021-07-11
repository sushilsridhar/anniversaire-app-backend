# Concepts Covered

**Connectivity with AWS RDMS**  
Check application.properties

**Auto-configuration annotation**  
@ComponentScan({"controller,service"})  
@EnableJpaRepositories("dao")  
@EntityScan("entity")

**Rest APIs CRUD operations**  
@RestController  
CrudRepository<BirthdayEntity, Integer>  
nativeQuery for repository