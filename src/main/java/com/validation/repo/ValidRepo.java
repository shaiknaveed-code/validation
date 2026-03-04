package com.validation.repo;

import com.validation.entity.Valid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidRepo extends JpaRepository<Valid,Long> {
}
