package in.yuktisoftwares.query_management.utils;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.model.Student;

public class Utilities {
    public static QueryEntity getQueryEntityFromQueryModel(Query model) {
        return QueryEntity.builder().id(model.getId()).description(model.getDescription())
                .response(model.getResponse()).status(model.getStatus()).build();
    }

    public static  Query getQueryModelFromQueryEntity(QueryEntity entity) {
        return Query.builder().id(entity.getId()).description(entity.getDescription())
                .response(entity.getResponse()).status(entity.getStatus())
                .studentId(entity.getStudent().getId())
                .name(entity.getStudent().getName())
                .email(entity.getStudent().getEmail())
                .mobile(entity.getStudent().getMobile())
                .build();
    }

    public static  StudentEntity getStudentEntityFromStudentModel(Student model) {
        return StudentEntity.builder().id(model.getId()).name(model.getName())
                .email(model.getEmail()).mobile(model.getMobile()).build();
    }

    public static  Student getStudentModelFromStudentEntity(StudentEntity entity) {
        return Student.builder().id(entity.getId()).name(entity.getName())
                .email(entity.getEmail()).mobile(entity.getMobile()).build();
    }
}
