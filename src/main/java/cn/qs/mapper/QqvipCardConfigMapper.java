package cn.qs.mapper;

import cn.qs.model.QqvipCardConfig;
import cn.qs.model.QqvipCardConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QqvipCardConfigMapper {
    int countByExample(QqvipCardConfigExample example);

    int deleteByExample(QqvipCardConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QqvipCardConfig record);

    int insertSelective(QqvipCardConfig record);

    List<QqvipCardConfig> selectByExample(QqvipCardConfigExample example);

    QqvipCardConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QqvipCardConfig record, @Param("example") QqvipCardConfigExample example);

    int updateByExample(@Param("record") QqvipCardConfig record, @Param("example") QqvipCardConfigExample example);

    int updateByPrimaryKeySelective(QqvipCardConfig record);

    int updateByPrimaryKey(QqvipCardConfig record);
}