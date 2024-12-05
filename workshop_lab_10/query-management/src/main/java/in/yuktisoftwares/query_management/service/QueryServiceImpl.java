package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.repository.QueryRepository;
import in.yuktisoftwares.query_management.repository.StudentRepository;
import in.yuktisoftwares.query_management.utils.QueryUtil;
import in.yuktisoftwares.query_management.utils.StudentUtil;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QueryServiceImpl implements QueryService{

    private final QueryRepository queryRepository;

    private final StudentRepository studentRepository;

    public List<Query> getQueries(){

        List<QueryEntity> queryEntities = (List<QueryEntity>) queryRepository.findAll();

        ArrayList<Query> queries = new ArrayList<Query>();
        for(int i=0;i<queryEntities.size();i++) {
            QueryEntity queryEntity = (QueryEntity)queryEntities.get(i);

            Query query = new Query();
            query.setId(queryEntity.getId());
            query.setDescription(queryEntity.getDescription());
            query.setResponse(queryEntity.getResponse());
            query.setStatus(queryEntity.getStatus());

            StudentEntity studentEntity = queryEntity.getStudent();
            Student student = Student.builder().id(studentEntity.getId())
                            .name(studentEntity.getName()).mobile(studentEntity.getMobile()).email(studentEntity.getEmail()).build();

            query.setStudent(student);


            queries.add(query);
        }
        return queries;

    }

    @Override
    public Query saveQuery(Query query) {
        QueryEntity queryEntity  = QueryUtil.modelToEntity(query);
        Student student = query.getStudent();
        if (student != null && student.getId() == null) {
            StudentEntity  studentEntity = StudentUtil.modelToEntity(student);
            StudentEntity savedStudentEntity = studentRepository.save(studentEntity);
            queryEntity.setStudent(savedStudentEntity);
        }else {
            if(student != null){
                Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(student.getId());
                if (optionalStudentEntity.isPresent()) {
                    StudentEntity st = optionalStudentEntity.get();
                    st.setName(student.getName());
                    st.setEmail(student.getEmail());
                    st.setMobile(student.getMobile());
                    queryEntity.setStudent(st);
                } else {
                    throw new EntityNotFoundException("Student is not found for id: " + student.getId());
                }
            }else{
                throw new EntityNotFoundException("Student is not found for the query");
            }

        }

        QueryEntity savedQueryEntity = queryRepository.save(queryEntity);

        Query savedQuery = QueryUtil.entityToModel(savedQueryEntity);
        return savedQuery;
    }

    @Override
    public Query updateQuery(Integer id, Query query) {

        return null;
    }

    @Override
    public void deleteQuery(Integer id) {
        queryRepository.deleteById(id);
    }
}
