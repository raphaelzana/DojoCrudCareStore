package br.com.s2it.incubadora.DojoSolucao.repository;

import br.com.s2it.incubadora.DojoSolucao.entity.SugestaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SugestaoRepository extends CrudRepository<SugestaoEntity, Long> {
}
