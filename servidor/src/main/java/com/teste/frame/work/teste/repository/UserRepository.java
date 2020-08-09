package com.teste.frame.work.teste.repository;
import com.teste.frame.work.teste.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
