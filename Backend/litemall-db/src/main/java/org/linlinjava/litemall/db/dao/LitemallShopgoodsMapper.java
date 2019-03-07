package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallShopgoods;
import org.linlinjava.litemall.db.domain.LitemallShopgoodsExample;

public interface LitemallShopgoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    long countByExample(LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int insert(LitemallShopgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int insertSelective(LitemallShopgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallShopgoods selectOneByExample(LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallShopgoods selectOneByExampleSelective(@Param("example") LitemallShopgoodsExample example, @Param("selective") LitemallShopgoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallShopgoods selectOneByExampleWithBLOBs(LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallShopgoods> selectByExampleSelective(@Param("example") LitemallShopgoodsExample example, @Param("selective") LitemallShopgoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    List<LitemallShopgoods> selectByExampleWithBLOBs(LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    List<LitemallShopgoods> selectByExample(LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallShopgoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallShopgoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    LitemallShopgoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallShopgoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallShopgoods record, @Param("example") LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") LitemallShopgoods record, @Param("example") LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallShopgoods record, @Param("example") LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallShopgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(LitemallShopgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallShopgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallShopgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shopgoods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}