package com.wpt.risk.dal.dao;

import com.wpt.risk.dal.pojo.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DepartmentMapper {
    void addDep(@Param("dep") Department department);

    void deleteDep(@Param("dep") Department department);

    List<Department> getDepByPid(Long pid);

    List<Department> getAllDeps();
}
