package com.yuyuda.mapper;

import com.yuyuda.pojo.TbItem;
import java.util.List;

public interface TbItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbg.generated
     */
    int insert(TbItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbg.generated
     */
    TbItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbg.generated
     */
    List<TbItem> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbItem record);
}