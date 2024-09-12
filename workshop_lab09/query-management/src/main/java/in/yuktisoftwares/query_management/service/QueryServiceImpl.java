package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl {

    @Autowired
    private QueryRepository queryRepository;

    public List<Query> getQueries() {
        List<QueryEntity> queryEntities = (List<QueryEntity>) queryRepository.findAll();

        return queryEntities.stream().map(this::queryEntityToQueryModel).toList();


    }


    private Query queryEntityToQueryModel(QueryEntity entity) {
        return Query.builder().id(entity.getId()).description(entity.getDescription())
                .response(entity.getResponse()).status(entity.getStatus()).build();
    }
}
