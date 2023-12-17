package br.org.com.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.com.recode.model.Promocoe;


@Repository
public interface PromocoeRepository extends JpaRepository<Promocoe, Long>{

}
