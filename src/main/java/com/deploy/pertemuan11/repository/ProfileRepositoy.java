package com.deploy.pertemuan11.repository;

import com.deploy.pertemuan11.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepositoy extends JpaRepository<Profile, String> {
}
