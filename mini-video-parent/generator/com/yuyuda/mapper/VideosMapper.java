package com.yuyuda.mapper;

import com.yuyuda.pojo.Videos;
import java.util.List;

public interface VideosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated
     */
    int insert(Videos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated
     */
    Videos selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated
     */
    List<Videos> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videos
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Videos record);
}