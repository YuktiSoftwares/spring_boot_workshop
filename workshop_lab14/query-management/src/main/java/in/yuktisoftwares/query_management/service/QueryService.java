package in.yuktisoftwares.query_management.service;

import java.util.List;

import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.model.Student;

public interface QueryService {
	public List<Query> getQueries();
	public void saveQuery(Query query);
}
