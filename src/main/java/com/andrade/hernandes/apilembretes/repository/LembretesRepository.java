package com.andrade.hernandes.apilembretes.repository;

import com.andrade.hernandes.apilembretes.model.Lembretes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LembretesRepository extends JpaRepository<Lembretes, Long> {
}
