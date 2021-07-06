package dao;

import entity.BirthdayEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface BirthdayRepo extends CrudRepository<BirthdayEntity, Integer> {

    /*@Query("SELECT b FROM BirthdayEntity b where b.birthday = :currentDate")
    Iterable<BirthdayEntity> findByDate(@Param("currentDate") LocalDate currentDate); */

    /*@Query("SELECT b FROM BirthdayEntity b where b.birthday like %:currentDate%")
    Iterable<BirthdayEntity> findByDate(@Param("currentDate") String currentDate); */

    //->working

    @Query(value = "SELECT * FROM birthday where birthday like %?1%", nativeQuery = true)
    Iterable<BirthdayEntity> findByDate(@Param("currentDate") String currentDate);
}
