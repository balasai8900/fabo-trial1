package com.pack.fabo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pack.fabo.entity.RolesTable;

public interface RolesTableRepository extends JpaRepository<RolesTable, Long>{

	@Query("SELECT rt.roleName FROM RolesTable rt WHERE rt.id = :roleId")
    String findRoleNameById(@Param("roleId") Long roleId);
}
