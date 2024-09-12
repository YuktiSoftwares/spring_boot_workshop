package in.yuktisoftwares.query_management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.repository.QueryRepository;
import in.yuktisoftwares.query_management.repository.StudentRepository;


@Service
public class QueryServiceImpl implements QueryService{

	@Autowired
	private QueryRepository queryRepository;
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Query> getQueries(){
	
		 List<QueryEntity> queryEntities = ( List<QueryEntity>)queryRepository.findAll();
		 ArrayList<Query> queries = new ArrayList<Query>();
		 for(int i=0;i<queryEntities.size();i++) {
			 QueryEntity queryEntity = (QueryEntity)queryEntities.get(i);
			 
			 
			 Query query = new Query();
			 query.setId(queryEntity.getId());
			 query.setDescription(queryEntity.getDescription());
			 query.setResponse(queryEntity.getResponse());
			 query.setStatus(queryEntity.getStatus());
			 
			 StudentEntity studentEntity = queryEntity.getStudent();
			 query.setName(studentEntity.getName());
			 query.setMobile(studentEntity.getMobile());
			 query.setEmailId(studentEntity.getEmailId());
			 query.setStudentId(studentEntity.getId());
			 
			
			 queries.add(query);
		 }
		 
		 
		return queries;
	};
	
	@Override
	public void saveQuery(Query query){
		 
		 StudentEntity studentEntity = new StudentEntity();
		 studentEntity.setId(query.getStudentId());
		 studentEntity.setName(query.getName());
		 studentEntity.setEmailId(query.getEmailId());
		 studentEntity.setMobile(query.getMobile());
			
	  studentEntity = studentRepository.save(studentEntity);
	  System.out.println("StudentEntity has been save to database:"+studentEntity);
			 
		 
		QueryEntity queryEntity = new QueryEntity();
		 queryEntity.setId(query.getId());
		 queryEntity.setDescription(query.getDescription());
		 queryEntity.setResponse(query.getResponse());
		 queryEntity.setStatus(query.getStatus());
		 queryEntity.setStudent(studentEntity);
		 queryRepository.save(queryEntity);
		 System.out.println("StudentEntity has been save to database:"+queryEntity);
		 
		 
	}
}
