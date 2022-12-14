package com.popov.repo;


import com.popov.models.Indexing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexRepository extends CrudRepository<Indexing, Integer> {
    List<Indexing> findByLemmaId (int lemmaId);
    List<Indexing> findByPageId (int pageId);
    Indexing findByLemmaIdAndPageId (int lemmaId, int pageId);


}

