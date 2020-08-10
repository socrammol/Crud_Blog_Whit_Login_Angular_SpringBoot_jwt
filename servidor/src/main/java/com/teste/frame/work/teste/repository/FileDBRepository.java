package com.teste.frame.work.teste.repository;
import com.teste.frame.work.teste.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  FileDBRepository extends JpaRepository<FileDB, String> {
}
