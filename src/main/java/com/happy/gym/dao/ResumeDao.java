package com.happy.gym.dao;

import com.happy.gym.pojo.Resume;

public interface ResumeDao {
    int deleteByPrimaryKey(Integer rsmId);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer rsmId);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}