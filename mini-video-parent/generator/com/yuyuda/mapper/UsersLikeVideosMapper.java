package com.yuyuda.mapper;

import com.yuyuda.pojo.UsersLikeVideos;
import java.util.List;

public interface UsersLikeVideosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated
     */
    int insert(UsersLikeVideos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated
     */
    UsersLikeVideos selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated
     */
    List<UsersLikeVideos> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UsersLikeVideos record);
}