package in.yuktisoftwares.query_management.utils;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import in.yuktisoftwares.query_management.model.Query;

public class QueryUtil {

    public static Query entityToModel(QueryEntity entity) {
        if(entity == null){
            return null;
        }
        return Query.builder()
                .id(entity.getId())
                .description(entity.getDescription())
                .response(entity.getResponse())
                .status(entity.getStatus())
                .student(StudentUtil.entityToModel(entity.getStudent())).build();

    }

    public static QueryEntity modelToEntity(Query model) {
        if(model == null){
            return null;
        }
        QueryEntity entity = new QueryEntity();
        entity.setId(model.getId());
        entity.setDescription(model.getDescription());
        entity.setResponse(model.getResponse());
        entity.setStatus(model.getStatus());
        entity.setStudent(StudentUtil.modelToEntity(model.getStudent()));
        return entity;
    }
}
