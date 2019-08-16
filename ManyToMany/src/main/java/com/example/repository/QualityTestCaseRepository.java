package com.example.repository;

import com.example.entity.QualityTestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author:
 * @date:2019/8/5 15:27
 */
@Repository
public interface QualityTestCaseRepository extends JpaRepository<QualityTestCase,Integer> {
}
