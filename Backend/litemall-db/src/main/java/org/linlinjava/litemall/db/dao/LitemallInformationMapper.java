package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallInformation;
import org.linlinjava.litemall.db.domain.LitemallInformationExample;

public interface LitemallInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    long countByExample(LitemallInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int insert(LitemallInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int insertSelective(LitemallInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallInformation selectOneByExample(LitemallInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallInformation selectOneByExampleSelective(@Param("example") LitemallInformationExample example, @Param("selective") LitemallInformation.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallInformation> selectByExampleSelective(@Param("example") LitemallInformationExample example, @Param("selective") LitemallInformation.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    List<LitemallInformation> selectByExample(LitemallInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallInformation selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallInformation.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    LitemallInformation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallInformation selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallInformation record, @Param("example") LitemallInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallInformation record, @Param("example") LitemallInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_information
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}