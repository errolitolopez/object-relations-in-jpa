package com.java.world.objectrelationsinjpa.repository;

import com.java.world.objectrelationsinjpa.entity.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<TypeEntity, Long> {
}
