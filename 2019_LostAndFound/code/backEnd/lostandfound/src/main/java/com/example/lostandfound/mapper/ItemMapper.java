package com.example.lostandfound.mapper;

import com.example.lostandfound.model.Item;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Item
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int deleteByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Item
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int insert(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Item
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int insertSelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Item
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    Item selectByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Item
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Item
     *
     * @mbg.generated Wed May 22 17:34:48 CST 2019
     */
    int updateByPrimaryKey(Item record);

    @Select("SELECT * FROM Item WHERE itemType=#{itemType} AND category=#{category}")
    List<Item> selectAllItemByTAndC(int itemType, String category);

    @Select("SELECT * FROM Item WHERE itemType=#{itemType}")
    List<Item> selectAllItemByT(int itemType);
    @Select("SELECT * FROM Item WHERE category=#{category}")
    List<Item> selectAllItemByC(String category);

    @Select("SELECT * FROM Item")
    List<Item> selectAllItem();

    @Select("SELECT count(*) FROM Item")
    String getCount();

    @Select("SELECT max(itemId) FROM Item")
    String getMaxId();

    @Select("SELECT * FROM Item WHERE createUserId=#{userId} " +
            "AND itemType=#{type}")
    List<Item> getItemInfosByUser(int userId, int type);
}