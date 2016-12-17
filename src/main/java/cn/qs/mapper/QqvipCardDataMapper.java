package cn.qs.mapper;

import cn.qs.model.QqvipCardData;
import cn.qs.model.QqvipCardDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QqvipCardDataMapper {
    int countByExample(QqvipCardDataExample example);

    int deleteByExample(QqvipCardDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QqvipCardData record);

    int insertSelective(QqvipCardData record);

    List<QqvipCardData> selectByExample(QqvipCardDataExample example);

    QqvipCardData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QqvipCardData record, @Param("example") QqvipCardDataExample example);

    int updateByExample(@Param("record") QqvipCardData record, @Param("example") QqvipCardDataExample example);

    int updateByPrimaryKeySelective(QqvipCardData record);

    int updateByPrimaryKey(QqvipCardData record);
}