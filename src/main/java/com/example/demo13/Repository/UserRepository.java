package com.example.demo13.Repository;

import com.example.demo13.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer>
{

    //Query JPQL
    @Query("select u from User u")
    public List<User> getAllUserJPQL();

    @Query("select u from User u where u.name=:c")
    public List<User> getByName(@Param("c") String name);

    @Query("select u from User u where u.name=:c and job=:p")
    public List<User>  getByJobOrName(@Param("c")String name,@Param("p")String job);

    //Native
    @Query(value = "select * from User",nativeQuery = true)
    public List<User>  getAllUserNative();


}
