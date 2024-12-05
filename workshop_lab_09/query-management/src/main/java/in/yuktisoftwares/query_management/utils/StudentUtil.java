package in.yuktisoftwares.query_management.utils;

import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Student;

public class StudentUtil {
    public static Student entityToModel(StudentEntity entity) {
        if(entity == null){
            return null;
        }
        Student model = new Student();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setEmail(entity.getEmail());
        model.setMobile(entity.getMobile());
        return model;
    }
    public static StudentEntity modelToEntity(Student model) {
        if(model == null){
            return null;
        }
        StudentEntity entity = new StudentEntity();
        entity.setId(model.getId());
        entity.setName(model.getName());
        entity.setEmail(model.getEmail());
        entity.setMobile(model.getMobile());
        return entity;
    }
}
