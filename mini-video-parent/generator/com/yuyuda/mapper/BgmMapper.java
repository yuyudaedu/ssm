package com.yuyuda.mapper;

import com.yuyuda.pojo.Bgm;
import java.util.List;

public interface BgmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bgm
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bgm
     *
     * @mbg.generated
     */
    int insert(Bgm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bgm
     *
     * @mbg.generated
     */
    Bgm selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bgm
     *
     * @mbg.generated
     */
    List<Bgm> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bgm
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Bgm record);
}