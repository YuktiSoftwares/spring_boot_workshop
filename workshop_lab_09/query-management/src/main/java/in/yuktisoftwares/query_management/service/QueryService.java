package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.model.Query;

import java.util.List;

public interface QueryService {
    public List<Query> getQueries();

    Query saveQuery(Query query);
    Query updateQuery(Integer id, Query query);

    void deleteQuery(Integer id);
}
