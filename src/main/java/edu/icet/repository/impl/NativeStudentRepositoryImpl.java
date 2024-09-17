package edu.icet.repository.impl;

import edu.icet.repository.NativeStudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NativeStudentRepositoryImpl implements NativeStudentRepository {

    final JdbcTemplate jdbcTemplate;

    public Long getRecordCount(){
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM STUDENT",long.class);
    }
}
