package test.dao;

import test.entity.LanshaPatch;

public interface LanshaPatchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LanshaPatch record);

    int insertSelective(LanshaPatch record);

    LanshaPatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LanshaPatch record);

    int updateByPrimaryKey(LanshaPatch record);
}