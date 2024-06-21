package com.bootcamp.demo.demo_sb_restful.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;

@Repository // Bean
// SPring Framwork: Hibernate (JobsDB)
// Generate the class implementing this JPA interface
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  

  // select * from users where phone = ?
  Optional<UserEntity> findByPhone(String phone);

  // select * from users where addrLat = ? and addrLong = ?
  Optional<List<UserEntity>> findByAddrLatitudeAndAddrLongtitude(String addrLatitude, String addrLongtitude);

  // JPQL -> work with Entity & JPA
  @Query(value = "select e from UserEntity e where e.addrLatitude > :lat")
  Optional<List<UserEntity>> findByAddrLatitudeGreaterThan(
    @Param(value = "lat") Double lat);

  // JPQL + @QModifying(when Update, Delete, Insert)
  @Modifying
  @Query(value = "update UserEntity e set e.email = :newEmail where e.id = :userId")
  void updateUserEmail(@Param("userId") Long id, @Param("newEmail") String email);

}
