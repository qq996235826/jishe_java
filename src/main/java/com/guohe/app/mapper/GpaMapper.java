package com.guohe.app.mapper;

import com.guohe.app.model.Gpa;
import com.guohe.app.model.GpaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GpaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    long countByExample(GpaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int deleteByExample(GpaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int insert(Gpa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int insertSelective(Gpa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    List<Gpa> selectByExampleWithRowbounds(GpaExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    List<Gpa> selectByExample(GpaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    Gpa selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int updateByExampleSelective(@Param("record") Gpa record, @Param("example") GpaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int updateByExample(@Param("record") Gpa record, @Param("example") GpaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int updateByPrimaryKeySelective(Gpa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gpa
     *
     * @mbg.generated Sun May 17 09:53:32 CST 2020
     */
    int updateByPrimaryKey(Gpa record);
}